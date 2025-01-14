package ua.hillel.lessons.lesson33.demos._05_netty.example.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.ArrayList;
import java.util.List;

// @Sharable означає, що можна зареєструватися
// і поділитися обробником з кількома клієнтами.
@ChannelHandler.Sharable
public class ServerHandler extends SimpleChannelInboundHandler<String> {

    // Список підключених клієнтських каналів
    static final List<Channel> channels = new ArrayList<>();

    // Щоразу, коли клієнт підключається до сервера через канал,
    // додаємо його канал до списку каналів.
    @Override
    public void channelActive(final ChannelHandlerContext ctx) {
        System.out.println("Client joined - " + ctx);
        channels.add(ctx.channel());
    }

    @Override
    public void channelRead0(ChannelHandlerContext ctx, String msg) {
        System.out.println("Message received: " + msg);
        for (Channel c : channels) {
            c.writeAndFlush("Hello " + msg + '\n');
        }
    }

    // У випадку винятку - канал закривається
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        System.out.println("Closing connection for client - " + ctx);
        ctx.close();
    }
}
