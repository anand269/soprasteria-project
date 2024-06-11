package OOPs;

public class Person {
	//private increases the security of data 
	private String name; //private - restricted access within the same class
	private int num;
	private double dbl;
	
	//Getter method
	public String getName()
	{
		return name;
	}
	
	public double getNum()
	{
		return dbl;
	}
	
	//setter method with parameter/argument
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public static void main(String args[])
	{
		Person myObj = new Person();//creating an object
		myObj.name="Ganesh";
		System.out.println(myObj.name);//output
		
	}
}
