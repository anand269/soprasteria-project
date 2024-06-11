package OOPs;

public class Pig1 extends Animal implements Animal1,Animal2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig1 p1 = new Pig1();//object
		p1.animalSound();
		p1.sleep();
		p1.run();
	}
	
	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("Pig says - wee wee");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Pig sleep well");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Pig runs moderately");
	}

}
