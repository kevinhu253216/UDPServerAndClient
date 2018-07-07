import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] arg) throws Exception{
        byte buf[] = new byte[1024];//memory 分配了1K的字节
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        DatagramSocket ds = new DatagramSocket(6666);//UDP设置端口
        while (true){
            ds.receive(dp);//收到包袱
            System.out.println(new String(buf, 0, dp.getLength()));
        }
    }
}
