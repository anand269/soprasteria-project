package JavaPrograms;

public class ArrayDemo {

	public static void main(String[] args) {
		// Array Demo
		String[] Cities = {"Bangalore","Boston","Tokyo","Paris"};
		String cars[] = {"Volvo","VW","Toyoto","Honda"};
		int score[] = {10,20,30,40,50};
		System.out.println(cars[0]);//VW
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		//System.out.println(cars[4]);
		System.out.println(Cities[0]);
		System.out.println(score[0]);
		
		for(int i=0;i<cars.length;i++) //initialize;compare;increment/decrement
		{
			System.out.println("Cars array : "+cars[i]);
		}
	}

}
