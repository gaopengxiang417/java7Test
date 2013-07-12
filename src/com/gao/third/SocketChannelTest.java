package com.gao.third;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.NetworkChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Set;

/**
 * User: gaopengxiang
 * Date: 12-3-30
 * Time: 下午8:27
 */
public class SocketChannelTest {
    public static void main(String[] args) throws IOException {
        SelectorProvider provider = SelectorProvider.provider();

        NetworkChannel networkChannel = provider.openSocketChannel();

        SocketAddress socketAddress = new InetSocketAddress(3308);
        networkChannel = networkChannel.bind(socketAddress);

        Set<SocketOption<?>> set = networkChannel.supportedOptions();

        System.out.println(set.toString());

        networkChannel.setOption(StandardSocketOptions.IP_TOS,3);
        Integer reeslt = networkChannel.getOption(StandardSocketOptions.SO_RCVBUF);
        System.out.println(reeslt);
    }
}
