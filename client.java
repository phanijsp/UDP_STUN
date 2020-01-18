import java.net.*;
public class client{
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] data = "Hello There !".getBytes();
        byte[] data1 = new byte[100];
        InetAddress inetAddress = InetAddress.getByName("localhost");
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, inetAddress, 6969);
        DatagramPacket datagramPacket1 = new DatagramPacket(data1, data1.length);
        while(true){
            Thread.sleep(1000);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(datagramPacket1);
            System.out.println(new String(data1));
        }
    }
}