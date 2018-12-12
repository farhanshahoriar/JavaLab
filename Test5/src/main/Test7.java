package main;

import java.util.Scanner;

public class Test7 {
	
	public static void main(String[] args) {
		int tickets=8;
		
		Scanner sc=new Scanner(System.in);
		while(tickets>0) {
			System.out.println("Enter the number of tickets : ");
			int tc=sc.nextInt();
			if(tc<=tickets&&tc<=4) {
				tickets=tickets-tc;
			}
			else {
				System.out.println("Try less tickets ");
				
			}
		}
		System.out.println("Sold out ");
	}
}
