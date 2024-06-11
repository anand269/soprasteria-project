package OOPs;

public class ThisDemo {
	int rollNo;
	String name;
	float fee;
	//parameter constructor 
	public ThisDemo(int rollNo,String name, float fee)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.fee=fee;
		
	}
	
	void display()//method
	{
		System.out.println(rollNo+" "+name+" "+fee);
	}
	
	public static void main(String[] args) {
		// creating an object
		ThisDemo td = new ThisDemo(1,"Ankit",5000f);
		td.display(); //calling the method
	}

}
