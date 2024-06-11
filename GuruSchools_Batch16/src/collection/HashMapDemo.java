package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declaring Hash Map object - Key & the value pair
		HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.put("India", "Mumbai");
	    System.out.println(capitalCities);
	    String city=capitalCities.get("England");
	    System.out.println(capitalCities.get("India"));
	    boolean b = capitalCities.containsKey("USA");
	    System.out.println(b);
	    HashMap<Integer, String> capitalCities2 = new HashMap<Integer, String>();
	    capitalCities2.put(1, "Bits");
	    capitalCities2.put(2, "IISc");
	    capitalCities2.put(3, "IIT");
	    System.out.println(capitalCities2);
	    System.out.println(capitalCities2.size());
	    System.out.println(capitalCities2.remove(1));
	    System.out.println(capitalCities2.size());
	}

}
