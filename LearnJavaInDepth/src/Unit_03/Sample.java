package Unit_03;

import java.io.IOException;
import java.util.InputMismatchException;

public class Sample {

	public static void main(String[] args)  {
		try {
			int a=100/0;
			System.out.println(a);
		}
		catch( InputMismatchException e) {
			System.out.println(e.getMessage());
		}
//		catch(Exception E) {
//			System.out.println(E.getMessage());
//			
//		}
		//    "Finally always runs"
		//if there is no exception still finally is run
		//if there is an exception finally would always run
		//if there is an exception in try block but there is no appropriate catch block to catch that exception still finally would run
		finally {
		System.out.println("hello");
		}
	}

}
