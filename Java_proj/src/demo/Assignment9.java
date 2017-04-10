package demo;
import java.util.Random;
import java.util.Scanner;


public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn=new Random();
		
		
		System.out.println("Roll #1");
		int num1=rn.nextInt(10)+1;
		System.out.println(num1);
		System.out.println("Roll #2");
		int num2=rn.nextInt(10+1);
		System.out.println(num2);
		
		System.out.println("The total is="+(num1+num2));
		
	}

}
