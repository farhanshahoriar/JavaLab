package main;

public class RunGreet {

	public static void main(String[] args) {
		PrintGreeting r1=new PrintGreeting("Hello");
		PrintGreeting r2=new PrintGreeting("World");
		PrintGreeting r3=new PrintGreeting("Shuvo");
		Thread tr1 = new Thread(r1);
		Thread tr2 = new Thread(r2);
		Thread tr3 = new Thread(r3);
		tr1.start();
		tr2.start();
		r2.DELAY=400;
		tr1.interrupt();
		tr3.start();
	}

}
