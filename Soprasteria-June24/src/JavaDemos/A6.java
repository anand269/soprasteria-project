package JavaDemos;

interface printable{  
	static void print()
	{
		System.out.println("Hello");
	}
} 

class A6 extends JavaDemo1 implements printable,interface2{  
	
	public void print()
	{
		System.out.println("Hi");
	}  

	public static void main(String args[]){  
		A6 obj = new A6();  //object
		obj.print(); 
		obj.play();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I love to play cricket");
	}  
}  