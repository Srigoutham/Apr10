package demo;

public class Assignment2 {

	public void swap(int a, int b) {
		
		System.out.println("Initial value a:"+a);
		System.out.println("Initial value b:"+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap value a:"+a);
		System.out.println("After swap value b:"+b);
		
	}

	//
	public static void main(String[] args) {
		
		Assignment2 nos=new Assignment2();
		nos.swap(10,20);

	}

}
