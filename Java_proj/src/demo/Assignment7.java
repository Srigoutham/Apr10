package demo;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int actpin=3456;
		System.out.println("Please enter your pin no:");
		int pin=scn.nextInt();
		while(actpin!=pin){
			System.out.println("Please enter correct pin");
			pin=scn.nextInt();
		}
		
		if(actpin==pin){
			System.out.println("Welcome to ABC Bank");
		}
				
	}
}
