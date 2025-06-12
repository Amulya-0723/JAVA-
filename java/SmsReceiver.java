import java.net.*;

public class SmsReceiver {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(2000); // Listen on port 2000
            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, b.length);

            System.out.println("Waiting to receive message...");
            ds.receive(dp); // Blocking - waits for incoming packet

            String s = new String(dp.getData(), 0, dp.getLength()); // Clean up message
            System.out.println("Received: " + s);

            ds.close(); // Always close your socket
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
