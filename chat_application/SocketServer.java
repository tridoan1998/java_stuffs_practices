import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.net.*;
import java.util.*;

public class SocketServer {
    
}

class ServerThread extends Thread {
    SocketServer server;
    PrintWriter pw;
    String name;

    public ServerThread(SocketServer server) {
        this.server = server;
    }

    @Override 
    public void run() {
        try {
            //read
            BufferedReader br = new BufferedReader(new InputStreamReader(server.sk.getInputStream()));

            //writing
            pw = new PrintWriter(server.sk.getOutputStream(), true);
            name = br.readLine();
            server.broadCast("@["+name+"] Entered this chat ++");
        String data;
        while((data = br.readLine()) != null) {
            if (data == "/list") {
                pw.println("a");
            }
            server.broadCast("["+name+"] "+ data);
        }
        
        }catch(Exception e) {
            server.removeThread(this);
            server.broadCast("@["+name+"] Left this chat --");
            System.out.println(server.sk.getInetAddress()+" - ["+name+"] Exit");
            System.out.println(e + "---->");
        }
    }
}