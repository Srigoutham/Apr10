package demo;

import java.util.Scanner;

public class Whiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enteredpin;
		
		Scanner pin=new Scanner(System.in);
		System.out.println("please enter your pin");
		enteredpin=pin.nextInt();
		System.out.println("Entered pin is:"+enteredpin);
	}

}
