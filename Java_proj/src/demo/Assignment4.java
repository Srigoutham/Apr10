package demo;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String month;
		Scanner sn=new Scanner(System.in);
		System.out.println("Please enter a number between 1-12");
		num=sn.nextInt();
		
		switch(num){
		
		case 1:month="January";
		break;
		case 2:month="Febraury";
		break;
		case 3:month="March";
		break;
		case 4:month="April";
		break;
		case 5:month="May";
		break;
		case 6:month="June";
		break;
		case 7:month="July";
		break;
		case 8:month="August";
		break;
		case 9:month="September";
		break;
		case 10:month="October";
		break;
		case 11:month="November";
		break;
		case 12:month="December";
		break;
		default: month = "Invalid month";
        break;
		}
		System.out.println(month);
	}

}