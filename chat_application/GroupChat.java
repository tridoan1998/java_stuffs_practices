import java.io.*;
import java.net.*;
import java.util.*;

public class GroupChat {
    private static final String TERMINATE = "Exit";
    static String name;
    static volatile boolean finished = false;
    public static void main(String[] args) throws Exception {
        if (args.length != 2)
        {
            System.out.println("Two argunments required: <multicast-host> <port-number>");
        }
        else
        {
            try{
                InetAddress group = InetAddress.getByName(args[0]); //input IP address for the group to establish all the connections on!
                int port = Integer.parseInt(args[1]);           //input the port number for connections
                Scanner sc = new Scanner(System.in);            //
                System.out.print("Enter your name: ");
                name = sc.nextLine();
                MulticastSocket socket = new MulticastSocket(port);

                socket.setTimeToLive(0);

                socket.joinGroup(group);
                Thread t = new Thread(new ReadThread(socket, group, port));

            }
            catch(SocketException se)
            {
                System.out.println("Error creating socket!");
                se.printStackTrace();
            }
            catch(IOException ie)
            {
                System.out.print("Error reading/writing from/to socket");
                ie.printStackTrace();
            }
        }
    }
}