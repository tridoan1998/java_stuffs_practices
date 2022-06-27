import java.io.*;
import java.net.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println("InetAddress of local host: " + address1);
        InetAddress address2 = InetAddress.getByName("1");
        System.out.println("InetAddress of Named Host: " + address2);
    
    }
}