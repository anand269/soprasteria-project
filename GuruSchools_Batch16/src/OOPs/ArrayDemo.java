package OOPs;

public class ArrayDemo {

	public static void main(String[] args) {
		// String array declaration
		String cars[] = {"Volvo", "BMW", "Ford", "Mazda","Tesla"};
		String[] places = {"India", "USA", "Bazil","UK"};
		int[] numbers = {1,2,3,4,34};
		/*
		 * System.out.println(places[0]); System.out.println(cars[3]);
		 * System.out.println(cars[4]); System.out.println(numbers[0]);
		 * System.out.println(numbers[1]); System.out.println(numbers[2]);
		 * System.out.println(numbers[3]);
		 */

		//loop ?
		for(int i=0;i<places.length;i++)
		{
			System.out.println(places[i]);//0
		}

		//for each loop
		for(String c:cars)
		{
			System.out.println(c);
		}

		//for each loop
		for(int n:numbers)
		{
			System.out.println(n);
		}


	}

}
