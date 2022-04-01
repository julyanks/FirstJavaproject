package Unit_01;
/*
 - Variables in Java is a data container that saves the values during program execution.
  Types of Variables
 - There are 3 types of variables in java 
     
     * Local variables -: - They are declared inside the body of the method
     
     * Instance variables -: -They are defined without  the static keyword.
                        - They are defined outside a method declaration.
                        -They are object specific.
                        
     * Static Variables -: -  They are initialized only once , at the start of the program execution.
                           - They are defined with static keyword.
   
 */

public class P3_Task01_VariablesAndDataTypesInJava {
	static int q = 11;
	  int p = 10;
	public static void main(String[] args) {
		
        //Valid Declarations
		   int a , b , c;
		   float pi;
		   double d;
		   char e;
		   
		  //Valid Initialization 
		   pi = 3.14f;
		   d = 20.22d;
		   e = 'v';
		   
		   a = 10;
		   b = 10;
		   c = 10;
		   
		   System.out.println(a);
		   System.out.println(b);
		   System.out.println(c);
		   
		   System.out.println(pi);
		   System.out.println(d);
		   System.out.println(e);
		   
		   int myNum = 5 ; // Integer (Whole Number)
		   float myFloatNum = 5.99f ;// Floating Point Number
		   char myLetter = 'D'; //Character
		   boolean myBool = true; //Boolean
		   String myText = "Hello"; //String 
		   
		   System.out.println(myNum);
		   System.out.println(myFloatNum);
		   System.out.println(myLetter);
		   System.out.println(myBool);
		   System.out.println(myText);
		   
		   /* 
		    * Java Variables Type Conversion & Type Casting 
		    */
		   
		   double f;
		   int i = 10;
		   f = i ; // Type Conversion 
		   
		   double g;
		   int j = 10;
		   g = (int)j ; // Type Casting 
		   
		   System.out.println(f);
		   System.out.println(i);
		   System.out.println(g);
		   System.out.println(j);
		   
		   byte k = 10; // 1 byte
		   boolean l = true ; // 1 bit = true or false only 
		   long m =  10L;
		   float n = 1.2f;
		   double o = 1.2d;
		   
		   System.out.println(k);
		   System.out.println(l);
		   System.out.println(m);
		   System.out.println(n);
		   System.out.println(o);
		   
		   System.out.println(ABC.j); //data + function methods
		   //ABC.display();
		   
		   ABC obj1 = new ABC();
		   System.out.println(obj1.i++);
		   System.out.println(obj1.i);
		   
		   ABC obj2 = new ABC();
		   System.out.println(obj2.i);
		   
		 //System.out.println(obj1.j++);
		  // System.out.println(obj1.j);
		  // System.out.println(obj2.j);
     
		   System.out.println(ABC.j++);
		   System.out.println(ABC.j);
		   
		   ABC.typeconversionAndTypescasting();
}
	
	int r=10;
	
	void display() {
		int a=5; // local variable
		System.out.println("This IS display method");
		System.out.println(a);
	}
	
}

  class ABC{
	  static int j=10;  // class variable/static varibale
	  int i=10;
	  
	  static void display() {
		  
		  int a=5; //local variable
		  System.out.println("This is display method");
		  System.out.println(a);
	  }
	  
	  static void typeconversionAndTypescasting() {
		  /*
		   * double f ; //8bytes=64 bits/slots int i=10; // 4 bytes=32bits/slots
		   * f=i; //Type conversion  System.out,println(f);
		   * 
		   * double g=10;  int j;
		   * j=(int)g;
		   */
		  double f; //64 slots
		  int i=10; //32 slots
		  f=i;     // Type conversion
		  System.out.println(f);
		  
		  double g=10; //64 slots
		  int j; //32
		  j=(int)g;    // Type casting
		  
		  //32bits=64bits
		  
		  System.out.println(i);
		  System.out.println(j);
	  }
  }
