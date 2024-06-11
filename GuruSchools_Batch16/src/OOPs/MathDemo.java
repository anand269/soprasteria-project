package OOPs;

public class MathDemo {
	static int num1=10,num2=20,sum;
	public static void main(String[] args) {
		// Method overloading
		sum();//calling directly
		sum(34,44);//o/p
		sum(10,23.5);
		sum(12.5,45.7);
	}
	
	//method overloading example
	public static void sum()//user defined method
	{
		System.out.println(num1+num2);
	}
	
	static public void sum(int a, int b)//user defined method
	{
		System.out.println(a+b);
	}
	
	static public void sum(int a, double b)//user defined method
	{
		System.out.println(a+b);
	}
	
	static public double sum(double a, double b)//user defined method
	{
		System.out.println(a+b);
		return sum;
	}
}
