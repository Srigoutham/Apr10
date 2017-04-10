package collectionframework;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> cities=new LinkedList<>();
		cities.add("Paris");
		cities.add("New Delhi");
		cities.add("London");
		cities.add("Tokyo");

		for (String t : cities) {
			System.out.println(t);
		}
		System.out.println("Total no.of elements present:"+cities.size());
	}

}
