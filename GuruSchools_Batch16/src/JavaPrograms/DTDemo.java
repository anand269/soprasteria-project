package JavaPrograms;

public class DTDemo {

	public static void main(String[] args) {
		// to declare multiple variable in a single line
		int num1=10;
		int num2=20;
		int num3=30;
		int n1=34,n2=45,n3=56;
		int n4,n5,n6;
		System.out.println(n1);
		
		char myVar1 = 65, myVar2 = 66, myVar3 = 'c';
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);
		String greeting = "Guru";//String data type
		System.out.println(greeting);
		System.out.println(greeting.length());// o/p ?
		System.out.println("Character position at nth index is "+greeting.charAt(2));
		System.out.println(greeting.toLowerCase()+" "+greeting.toUpperCase());
		
		//convert from int to double (Type casting)
		int myInt = 9;
	    float myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt); 
	    System.out.println(myDouble);
	    
	    double myDouble2 = 9.78d;//assigning value to double
	    int myInt2 = (int) myDouble;//narrowing of casting
	    final boolean b1=true;
	    System.out.println(b1);
	   // b1=true;
	   // System.out.println(b1);
	}

}
