package com.java.study.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",10088);
        OutputStream ops = socket.getOutputStream();
        ops.write("客户端发送的内容".getBytes());



         InputStream is= socket.getInputStream();
         byte[]bys = new byte[1024];
        int len= is.read(bys);
        System.out.println(new String(bys,0 ,len));
        socket.close();
    }
}
