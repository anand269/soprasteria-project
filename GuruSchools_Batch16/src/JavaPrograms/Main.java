package JavaPrograms;

class Mini
{
	String name;
}

public class Main {
	static int x = 5;//class/gobal variable
	public static void main(String[] args) {
		// test
		int y = 10;//local variable
		System.out.println("This is my Main class");
		//class-name <objname> = new class-name();syntax
		Main obj1 = new Main();//obj1 is the instance of class -> object
		System.out.println(obj1.x);
		//System.out.println(x);
		System.out.println(y);
		
		//creating sub class
		Sub sub = new Sub();//sub obj
		int result = sub.y;
		System.out.println(sub.y);
		
		
	}

}
