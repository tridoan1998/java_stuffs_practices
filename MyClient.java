import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter username: ");
            String userName = myObj.nextLine();
            dout.writeUTF(userName);
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}