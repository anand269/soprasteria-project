package JavaPrograms;

public class JavaDemo1 {
	
	public static void main(String[] args) {
		//My First Java program
		/*
		 * System.out.println("Welcome to Java");//end of line
		 * System.out.print("My next line"); System.out.print("This my 3rd line");
		 */
		
		//ClassName objName = new ClassName();
		Dog dog = new Dog();//I create the instance of the class
		dog.barking(); //behavior
		System.out.println(dog.breed);
		
		int i=10;
		System.out.println(i++);//post increment
		System.out.println(i);//?
		System.out.println(++i);//pre increment
	}

}
