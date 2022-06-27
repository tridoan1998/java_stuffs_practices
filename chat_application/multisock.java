import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class multisock {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket();
        InetAddress ip = InetAddress.getByName("224.168.1.124");

        ms.setTTL((byte) 25);

        ms.setTimeToLive(20);
        

    }
}