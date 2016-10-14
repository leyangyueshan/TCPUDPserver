package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	private static DataInputStream fromClient1;
	private static DataOutputStream toClient1;
	private static String c1 = null;

	public static void main(String[] args) {
		try{
			//使用UDP方式进行网络通信
		DatagramSocket socket = new DatagramSocket(8001);
		byte data[] = new byte[1024];
		
		// 创建一个空的DatagramPacket对象
		
		DatagramPacket packet = new DatagramPacket(data, data.length);
		
		// 使用receive方法接收客户端所发送的数据，
		// 如果客户端没有发送数据，该进程就停滞在这里
		
		socket.receive(packet);
		String result = new
				String(packet.getData(), packet.getOffset(),
				packet.getLength());
				System.out.println("server:" + result);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		/*TCP使用inputStream和outputStream实现网络通信*/
//		try {
//			ServerSocket serverSocket = new ServerSocket(8001);
//			Socket client1 = serverSocket.accept();
//			fromClient1 = new DataInputStream(client1.getInputStream());
//			toClient1 = new DataOutputStream(client1.getOutputStream());
//			while (true) {
//				c1 = fromClient1.readUTF();
//				System.out.println("server:" + c1);
//			}
//		} catch (IOException e) {
//			System.err.println(e);
//		}
	}
}
