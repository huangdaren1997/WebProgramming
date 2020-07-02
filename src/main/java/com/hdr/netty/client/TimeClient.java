package com.hdr.netty.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TimeClient {

    public void connect(int port , String host) throws Exception{
        NioEventLoopGroup group = new NioEventLoopGroup();
        try{
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY,true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new LineBasedFrameDecoder(1024));
                            ch.pipeline().addLast(new StringDecoder());
                            ch.pipeline().addLast(new TimeClientHandler());
                        }
                    });
            ChannelFuture f = b.connect(host, port).sync();
            f.channel().closeFuture().sync();
        }finally {
            group.shutdownGracefully();
        }
    }

//    public static void main(String[] args) throws Exception {
//        int port = 2333;
//        if (args != null && args.length > 0) {
//            try{
//                port = Integer.valueOf(args[0]);
//            }catch (NumberFormatException e){
//                // use default value
//            }
//        }
//        new TimeClient().connect(port,"127.0.0.1");
//    }


    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1", 2333,
                InetAddress.getLocalHost(), 23234);
        try(BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream())){
            byte[] data = new byte[1024*1024];
            bos.write(data);
            long cur = System.currentTimeMillis();
            while (System.currentTimeMillis()-cur<10*1000){

            }
            throw new RuntimeException();
        }
    }

}
