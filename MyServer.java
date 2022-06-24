import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyServer {

    public static void main(String[] args) throws Exception{
        MyServer server1 = new MyServer();
        server1.run();
    }

    public void run() throws Exception {

        //Initializes the port the serverOcket will be on
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("the server is waiting for a client on port 9999 ...");
        //Accept the connection for the client socket
        Socket socket = serverSocket.accept();

        InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(ir);
        String message;
        PrintStream ps = new PrintStream(socket.getOutputStream());

        while((message = br.readLine()) != null) {
            System.out.println(message);
        }
    }
}