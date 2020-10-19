package com.java.study.network;

import java.io.IOException;
import java.net.*;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket sc = new DatagramSocket();
        byte [] data ="发送数据".getBytes();
        Inet4Address address= (Inet4Address) Inet4Address.getByName("localhost");
        DatagramPacket packet= new DatagramPacket(data, data.length,address,100);
        sc.send(packet);
        sc.close();



    }


}
