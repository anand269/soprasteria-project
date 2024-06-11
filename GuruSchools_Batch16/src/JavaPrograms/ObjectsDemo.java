package JavaPrograms;

public class ObjectsDemo {
	int x = 10,y=20,z=x+y;//global level
	String fname = "Guru";
	String lname = " Schools";
	int age = 24;
	public static void main(String[] args) {
		ObjectsDemo myObj1 = new ObjectsDemo();  // Object 1
		ObjectsDemo myObj2 = new ObjectsDemo();  // Object 2
		myObj2.x=30;
		System.out.println(myObj1.x);  // Outputs 5
		//myObj2.x = 25;
		System.out.println(myObj2.x);  // Outputs 25
		
		System.out.println("Name: " + myObj1.fname + " " + myObj1.lname);
		myObj1.sum();//calling the method method overloading 
		myObj1.sum(67,67);
		sum(23,23);
		
	}
	//user defined method
	public void sum()
	{
		System.out.println(x+y);
		System.out.println(z);
	}
	
	//user defined method
		static public void sum(int n1,int n2) //method with arguments/parameters
		{
			System.out.println(n1+n2);
			//System.out.println(z);
		}
}
