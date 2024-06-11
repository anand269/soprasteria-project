package JavaPrograms;

public class ConditionDemo {

	public static void main(String[] args) {
		// if (cond) is true -> the block of code, if not, it goes to the else block
		/*
		 * if (20 < 18) //cond is false { System.out.println("20 is less than 18");
		 * System.out.println("20 is less than 18"); } else if (20 > 21)//cond is true
		 * System.out.println("20 is greater than 18"); else
		 * System.out.println("none of the condition is true");
		 */
		int day = 4;
		String dayName = "Monday";
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;//continue
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		   break;
		  case 5:
			System.out.println("Friday");
			break;
		   default:
		   	System.out.println("all conditions are wrong");
		}
	}

}
