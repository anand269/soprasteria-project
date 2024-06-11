package SuperDemo;

public class Dog extends Animal{
	String color="black";
	Dog() //constructor
	{
		this.color=super.color;//value becomes brown
		System.out.println(this.color);
	}
	void printColor() //user defined method
	{
		System.out.println(this.color);//o/p
		System.out.println(super.color);//brown
	}
	
	void eat()
	{
		System.out.println("Eating meal");
		super.eat();//eating...
	}
	void bark()
	{
		System.out.println("barking...");
	}
	void work()
	{
		super.eat();//Eating...
	}
	
}
