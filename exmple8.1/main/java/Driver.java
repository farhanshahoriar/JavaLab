package main.java;

public class Driver {
	public String name;
	private int bill;
	private int rate;
	public Driver(){
		bill=0;
		rate=15;
	}
	public void SetRate(int rate) {
		this.rate=rate;
	}
	public void ride(int distance){
		bill=bill+distance*rate;
	}
	public int totalbill() {
		return bill;
	}
}
