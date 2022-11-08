import java.io.*;
import java.net.*;

public class MyServer {

	public static void main(String[] args) {

		
		try {
			
			ServerSocket ss = new ServerSocket(6666);
			
			System.out.println("Server  listen on port 6666 ...... ");
			
			while(true){
				 
			Socket s = ss.accept();// establishes connection

			DataInputStream dis = new DataInputStream(s.getInputStream());

			String str = (String) dis.readUTF();
			System.out.println("message= " + str);
		   }
			//ss.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
