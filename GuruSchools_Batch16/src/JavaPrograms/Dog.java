package JavaPrograms;

public class Dog {
	static String breed; //variable
	void barking() //methods/function
	{
		System.out.println("Dog is barking loudly");
	}
	static void hungry() 
	{ 
		System.out.println("I am hungry");
	} 
	void dogBreed(String breed) 
	{ 
		
	} 
	public static void main(String[] args) {

		int age; 
		String color; 
		breed="doberman";//variable
		
		Dog d = new Dog();
		d.barking();//?
		hungry();//static method
		System.out.println(breed);
		System.out.println(d.breed);
	}
	
	

}
