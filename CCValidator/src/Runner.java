import java.io.*;
import java.util.Scanner;
public class Runner
	{

		public static void main (String[] args) throws FileNotFoundException 
			   {
				   Scanner file= new Scanner(new File("CCNumbers.txt"));
			      for( int i=0; i<100; i++)
			      {
			    	 long card= file.nextLong();
			    	 System.out.println(card);
			      }
			      long num=5424180123456789l;
			   }
}