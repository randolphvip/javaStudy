package com.java.study.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(10088);
        System.out.println("waiting the message:");
        Socket s= socket.accept();
        InputStream is=s.getInputStream();
        byte bytes[]= new byte[1024];
        int length =is.read(bytes);
        String mes= new String(bytes,0,length);
        System.out.println(mes);


        OutputStream ops = s.getOutputStream();
        ops.write("服务器：已经收到".getBytes());


    }
}
