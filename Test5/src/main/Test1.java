package main;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		double [] speeds = {1,10,20,40};
		int i;
		double m,v,t;
		Scanner sc=new Scanner(System.in);
		m=sc.nextDouble();
		for(i=0;i<speeds.length;i++) {
			v=speeds[i];
			t=m*v*v/3.0;
			System.out.println("T: "+t);
			if(t>60)break;
			
		}
		System.out.println("Max Speed: "+speeds[i-1]);
		
	}
}
