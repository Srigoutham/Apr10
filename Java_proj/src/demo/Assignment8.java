package demo;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		
	
	Scanner scn=new Scanner(System.in);
	
		int pin=3456;
		int flag=0;
		System.out.println("Please enter your pin:");
		int num=scn.nextInt();
		while((num!=pin) && (flag < 3)){
			System.out.println("You have entered wrong pin,please enter again");
			num=scn.nextInt();
			flag++;
			System.out.println(flag);
		}
			if(num==pin){
				System.out.println("You have entered correct pin");
				System.out.println("Welcome to bank ABC");
			}
			else if(num!=pin)	
			System.out.println("You have exceeded max no of choices,your card is blocked ");
	}

}
