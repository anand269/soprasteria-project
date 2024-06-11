package JavaPrograms;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myNumbers = {1, 2,3};
		try
		{
			System.out.println(myNumbers[3]); // error!
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Done with try catch block");
		}

		int age=10; 
		if (age < 18) 
		{ 
			throw new ArithmeticException("Access denied - You must be at least 18 years old."); }
		else 
		{ 
			System.out.println("Access granted - You are old enough!");
		}
		

	}

}
