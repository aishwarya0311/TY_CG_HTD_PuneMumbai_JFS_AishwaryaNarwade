package com.capgemini.exceptionhandle.railway;

import java.io.File;
import java.io.IOException;

public class Bottle {
	
	
void open () throws  Exception 
{
	File f = new File("aish.txt");
	f.createNewFile();
	
	Class.forName("com.capgemini.exceptionhandle.railway.Bottle");
}
}
