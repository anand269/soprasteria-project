package JavaPrograms;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20,num2=20;
		int result = Math.max(num1, num2);
		System.out.println(result);
		System.out.println(Math.max(10.5, 23.7));
		System.out.println(Math.min(10.5, 23.7));
		System.out.println(Math.PI);
		System.out.println(Math.abs(-35));
		
	}
	
	 //method over-riding 
	public void sum() {
		System.out.println("This is parent method sum: "+(50+50)); 
		}

}
