package OOPs;

class A
{
	void m() //method
	{
		System.out.println("hello m");
	}
	void n() //another method
	{
		this.m();
		System.out.println("hello n");
		
	}
}

public class TestThis {

	public static void main(String[] args) {
		//creating an object
		A a= new A();
		a.n();
	//	a.m();

	}

}
