package inheritance;

public class Cc1{

	public String username(String s){
		return s;
		
		
	}
	public static void main(String args[]){
		
		Cc1 obj1=new Cc1();
		System.out.println("You have entered your name as: "+obj1.username("Ram"));
		System.out.println("You have entered your name as: "+obj1.username("Sham"));
		System.out.println("You have entered your name as: "+obj1.username("Steve"));
		System.out.println("You have entered your name as: "+obj1.username("Tim"));
		System.out.println("You have entered your name as: "+obj1.username("James"));
		System.out.println("You have entered your name as: "+obj1.username("Pizza"));
	}
}
