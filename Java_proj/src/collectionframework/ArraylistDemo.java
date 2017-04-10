package collectionframework;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<>();
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
