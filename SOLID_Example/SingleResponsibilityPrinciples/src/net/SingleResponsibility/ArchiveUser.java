package net.SingleResponsibility;

import java.io.FileWriter;
import java.io.IOException;

public class ArchiveUser {
	public void saveUser(User u,String filename) {
		try {
			FileWriter file = new FileWriter(filename + ".txt");
			file.write("User: " + u.getUsername() + ", Pass: " + u.getPassword() + "\n");
			file.close();
			System.out.print("Successfull save " + u.getUsername() + " to file.\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("Somethins error!");
			e.printStackTrace();
		}
	}
}

