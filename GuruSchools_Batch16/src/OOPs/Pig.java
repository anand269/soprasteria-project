package OOPs;

//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	
	public static void main(String args[])
	{
		Pig p = new Pig();
		p.animalSound();//calling this method
		p.sleep();
	}
}
