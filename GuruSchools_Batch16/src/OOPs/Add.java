package OOPs;

public class Add extends MathDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add s = new Add();
		s.sum();//calls for the method which is there in parent class
		sum();
		System.out.println("Test");
	}


	
	
	  //method over-riding 
	public static void sum() {
	  System.out.println("This is child method sum: "+(23+45)); 
	  }
	 
	 
 
}
