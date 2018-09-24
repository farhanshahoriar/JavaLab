package main;

import java.util.Date;

public class PrintGreeting implements Runnable{
	private  String greeting;
	public int DELAY=100;
	public PrintGreeting(String str) {
		greeting=str;
	}
	public void run() {
		try {
			for( int i=0;i<10;i++ ) {
				Date now=new Date();
				System.out.println(now+" "+i+" "+ greeting);
				Thread.sleep(DELAY);
				System.out.println(now+" | "+greeting);
				
			}
			
			
		}
		catch (InterruptedException e) {
			System.out.println("NOW"+greeting);
		}
	}
}
