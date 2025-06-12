import java.net.*;

public class SmsSender {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            String message = "Hello, this is a test SMS!";
            InetAddress ip = InetAddress.getLocalHost(); // localhost (127.0.0.1)
            DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), ip, 2000);
            ds.send(dp); // Send the packet
            ds.close();

            System.out.println("Message sent.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
