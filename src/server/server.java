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
			//ʹ��UDP��ʽ��������ͨ��
		DatagramSocket socket = new DatagramSocket(8001);
		byte data[] = new byte[1024];
		
		// ����һ���յ�DatagramPacket����
		
		DatagramPacket packet = new DatagramPacket(data, data.length);
		
		// ʹ��receive�������տͻ��������͵����ݣ�
		// ����ͻ���û�з������ݣ��ý��̾�ͣ��������
		
		socket.receive(packet);
		String result = new
				String(packet.getData(), packet.getOffset(),
				packet.getLength());
				System.out.println("server:" + result);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		/*TCPʹ��inputStream��outputStreamʵ������ͨ��*/
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
