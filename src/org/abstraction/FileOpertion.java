package org.abstraction;

import java.io.File;
import java.io.IOException;

public class FileOpertion {
	public static void main(String[] args) throws IOException {
		File f=new File("E://user.txt");
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		boolean file = f.isFile();
		System.out.println(file);
		boolean canRead = f.canRead();
		System.out.println(canRead);
	
		
				
	}

}
