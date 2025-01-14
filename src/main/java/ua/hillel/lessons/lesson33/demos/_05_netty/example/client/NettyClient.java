package ua.hillel.lessons.lesson33.demos._05_netty.example.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

public final class NettyClient {

    static final String HOST = "127.0.0.1";
    static final int PORT = 8001;

    public static void main(String[] args) throws Exception {

        EventLoopGroup group = new NioEventLoopGroup();

        try {
            Bootstrap b = new Bootstrap();
            b.group(group) // Встановлення EventLoopGroup для обробки всіх подій для клієнта.
                    .channel(NioSocketChannel.class) // Використання NIO для нового з'єднання
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch) {
                            ChannelPipeline p = ch.pipeline();
                            // Комунікація сокет-канал відбувається у потоках байтів.
                            // Декодер рядків і кодувальник допомагають перетворенню
                            // між байтами та рядком.
                            p.addLast(new StringDecoder());
                            p.addLast(new StringEncoder());
                            // Клієнтский обробник
                            p.addLast(new ClientHandler());
                        }
                    });
            // Старт клієнта
            ChannelFuture f = b.connect(HOST, PORT).sync();
            // Дані для обробки в мережі
            String input = "Tom";
            Channel channel = f.sync().channel();
            channel.writeAndFlush(input);
            channel.flush();
            // Очікування доки з'єднання не буде закрито
            f.channel().closeFuture().sync();
        } finally {
            // Завершення всіх циклів обробки подій,
            // щоб завершити всі потоки.
            group.shutdownGracefully();
        }
    }
}
