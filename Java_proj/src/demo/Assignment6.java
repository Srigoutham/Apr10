package demo;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner snr=new Scanner(System.in);
		System.out.println("Enter a day");
		String day=snr.nextLine().toLowerCase();
		
		switch(day){
		
		case "monday": 
			System.out.println("I will wear white dress");
			break;
		case "tuesday": 
			System.out.println("I will wear blue dress");
			break;
		case "wednesday": 
			System.out.println("I will wear green dress");
			break;
		case "thursday": 
			System.out.println("I will wear red dress");
			break;
		case "friday": 
			System.out.println("I will wear purple dress");
			break;
		case "saturday": 
			System.out.println("I will wear pink dress");
			break;
		case "sunday": 
			System.out.println("I will wear orange dress");
			break;
		}
	}

}
