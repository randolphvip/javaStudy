package com.java.study.network;

import java.io.IOError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        System.out.println("prepare to receive data.....");
        DatagramSocket socket = new DatagramSocket(100);

        DatagramPacket pack = new DatagramPacket(new byte[1024],1024);
        socket.receive(pack);
        pack.getData();

        System.out.println(new String(pack.getData(),0,pack.getLength()));
        socket.close();
    }
}
