package JavaPrograms;

public class LoopDemo {

	public static void main(String[] args) {
		// Loops -> for, while, do while

		
		  System.out.println("1"); 
		  System.out.println("2"); 
		  System.out.println("3");
		 

		
		  for(int i=1;i<=10;i++) //initialization;condition;increment {
		  System.out.println(i);//print for 3 times }
		 
		int num1=1;
		
		  while(num1<5) //1<5 
		  { 
			  System.out.println(num1); 
			  num1++;//post incrementing the value by 1 
		  }
		 

		
		  do { 
			  System.out.println(num1); num1++;//increment by 1 num1=num1+2;
		  }
		  //increment by 2 } 
		  while(num1<=5);
		 

		
		  for (int i = 0; i < 10; i++) 
		  { //loop - repeated task 
			  if (i == 8) {
		  }
		  //condition continue;//break } System.out.println(i); }
		 
		
		System.out.println((Math.random() * 101));
		int randomNum = (int)(Math.random() * 101);
		System.out.println(randomNum);
	}

}
