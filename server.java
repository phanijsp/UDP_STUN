import java.net.*;
import java.util.Arrays;
public class server{
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(6969);
        byte[] data = new byte[100];
        byte[] data1 = "This is my reply".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
        DatagramPacket datagramPacket1;
        
        while(true){
            datagramSocket.receive(datagramPacket);
            String s = new String(data);
            System.out.println(s+datagramPacket.getAddress().getHostAddress()+"  " +datagramPacket.getPort());
            datagramPacket1 = new DatagramPacket(data1,data1.length,datagramPacket.getAddress(),datagramPacket.getPort());
            datagramSocket.send(datagramPacket1);
        }
       
    }
}