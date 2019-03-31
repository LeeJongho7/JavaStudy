package javaStudy;

import javaStudy.HelloThread;

public class HelloThreadTest {

	public static void main(String args[])
	{
		HelloThread ht = new HelloThread();
		ht.start();
		
		HelloThread ht1 = new HelloThread();
		ht1.start();
		
		HelloThread ht2 = new HelloThread();
		ht2.start();				
	}	
}
