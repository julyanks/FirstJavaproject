package Unit_01;
import java.util.Scanner;
/*
 * When user takes input from the console!!
 nextLine()    Read user input (to read strings)
 next()       Read next token from the input entered by the user
 
 nextBoolean()       Read a boolean value from the user
 nextByte()          Read a byte value from the user
 nextDouble()        Read a double value from the user
 nextFloat()         Read a float value from the user
 nextInt()           Read a integer value from the integer
 nextLine()          Read a String value from the user
 nextLong()          Read a long value from the user
 nextShort()         Read a short value from the user
 
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		
		Scanner myobj1=new Scanner(System.in);    //create a scanner object
		Scanner myobj2=new Scanner(System.in);
		
		//Read the First-Token:(_space bar)
		String firstname = myobj1.next();
		System.out.println("Name is : " + firstname + "\n");
		
		String name=myobj2.nextLine(); //(\n)
		String name2=myobj2.nextLine(); //(\n)
		
		System.out.println("Name is : " + name + "\n");
		System.out.println("Name is : " + name2 + "\n");
		
		boolean b=myobj2.nextBoolean();
		System.out.println(b + "\n");
		
		myobj1.close();
		myobj2.close();

	}

}
