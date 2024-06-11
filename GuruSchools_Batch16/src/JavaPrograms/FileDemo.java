package JavaPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// Read the data from a file
		try
		{
			FileReader fr=new FileReader("D:\\Java\\Demo.java");    
			int i;    
			while((i=fr.read())!=-1)    
			System.out.print((char)i);    
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Specified file name is not correct");
		}
		finally
		{
			System.out.println("Done");
		}
	}

}
