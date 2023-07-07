package edu.chat;

import java.net.ServerSocket;
import java.net.Socket;

import edu.chat.way.Receiver;
import edu.chat.way.Sender;

public class ChatTcpserver { // 서버 = 기다리는 쪽 (내부적으로 계쏙 폼 돌리고있음)

	public static void main(String[] args) {
		ServerSocket serverSocket = null;// 서버소켓을 가지는 쪽이 서버 구축 하는 것 
		
		Socket socket = null;
		
		try {
			//포트번호 = 프로그램번호 
			serverSocket = new ServerSocket(8888); //포트번호 지정 
			System.out.println("서버가 준비되었습니다.");
			
			socket = serverSocket.accept(); // 이 함수를 쓰기 위해 9번 줄 ServerSocket을 선언 	
			//System.out.println(" 연결 되었습니다."+socket.getInetAddress().getHostName());
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}
}
