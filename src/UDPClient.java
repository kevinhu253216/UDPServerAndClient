import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception{
        byte[] buf = (new String("hello")).getBytes();//把字符串解析成字符数组
        DatagramPacket dp = new DatagramPacket(buf, buf.length,
                new InetSocketAddress("127.0.0.1",6666) //子类
        );
        DatagramSocket ds = new DatagramSocket(9999);//Client端口
        ds.send(dp);//发送
        ds.close();

    }
}
