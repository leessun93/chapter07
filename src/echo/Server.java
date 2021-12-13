package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
	    ServerSocket serverSocket= new ServerSocket();
	    serverSocket.bind(new InetSocketAddress("172.30.1.17", 10001)); //본인 컴터 서버 생성주소, 포트
	    
	    System.out.println("<서버시작>");
	    System.out.println("=========================");
	    System.out.println("[연결을 기다리고 있습니다.]");
	    
	    
	    while(true) {//누가오면 실행을 무한반복시킴
	    	
	    	Socket socket = serverSocket.accept(); //대기하다가 누가 오면 실행
	    	
	    	Thread thread = new ServerThread(socket); //즈나버노, 출장코드, 회선 강화3단, 메세지 주고 받고, 종료코드
	    	thread.start(); // 출장 나가고,[선보강, 메세지 주고받기,] 출장종료
	    	
	    	/*
	    	if() {
	    		break;
	    	}
	    	*/
	    }
	    
	 
	   
	 
	
	    
	    
	    
	    /*
	    
	    System.out.println("==================================");
	    System.out.println("<서버 종료>");
	    socket.close();
	    serverSocket.close();
	    */
	
	
	
	
	
	
	
	
	}

}
