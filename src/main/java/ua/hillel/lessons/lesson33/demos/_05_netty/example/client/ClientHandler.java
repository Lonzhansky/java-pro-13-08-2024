package ua.hillel.lessons.lesson33.demos._05_netty.example.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ClientHandler extends SimpleChannelInboundHandler<String> {
    // Виводить повідомлення, отримане від сервера
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) {
        System.out.println("SERVER: " + msg);
    }
}