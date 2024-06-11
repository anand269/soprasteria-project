package JavaPrograms;

public class ConstructorDemo {
	int num;//class level variable
	//constructor overloading example
	public ConstructorDemo() //constructor without parameter
	{
		num=10;
	}
	
	public ConstructorDemo(int res) //constructor with parameter
	{
		num=res;
	}
	
	public static void main(String[] args) {
		// create the object of the class
		//<Class-Name> obj = new <Class-Name>(); 
		ConstructorDemo cd1 = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(50);
		System.out.println(cd1.num);//10
		System.out.println(cd2.num);//50
	}

}
