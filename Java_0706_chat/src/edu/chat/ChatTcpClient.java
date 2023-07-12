package edu.chat;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatTcpClient {

	public static void main(String[] args) {
		String serverIP = "127.0.0.1";
		
		Socket socket = null;
		
		try {
			
			socket =  new Socket(serverIP, 8888); // 아이피주소로 8888을 커넥션 ~ 
			System.out.println("서버에 연결되었습니다.");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}
}

