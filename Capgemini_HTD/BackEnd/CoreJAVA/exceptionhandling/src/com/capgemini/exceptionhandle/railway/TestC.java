package com.capgemini.exceptionhandle.railway;

import java.io.File;
import java.io.IOException;

public class TestC {

	public static void main(String[] args) {
System.out.println("main started");
File f = new File("aish.txt");
try {
	f.createNewFile();
	System.out.println("file created");
}
catch (IOException e)
{
	System.out.println("sorry not able to create the file");
}
System.out.println("main ended");
	}

}
