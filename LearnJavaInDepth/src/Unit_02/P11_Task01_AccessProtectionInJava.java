package Unit_02;

public class P11_Task01_AccessProtectionInJava {

	int a=10;
	
	public static void main(String[] args) {
		
       ChildClass obj =new ChildClass();
       obj.showData();
       obj.accessData();
	}

}
 class ParentClass {
	  int a=10; //default protection!
	  public int b=20;  // can be accessed outside Unit_02 package but within same project
	  protected int c=30; // can only be accessed within Unit_02 Package
	  private int d=40; // within Parent class only, not even in this sub-class
	  
	  void showData() {
		  System.out.println("Inside ParentClass");
		  System.out.println("a ="+ a);
		  System.out.println("b = "+ b);
		  System.out.println("c = "+ c);
		  //System.out.println("d = "+ d);//private member can not be accessed
		  
	  }
 }
 
 class ChildClass  extends ParentClass{
	 void accessData() {
		 System.out.println("Inside ChilClass");
		 System.out.println("a = "+ a);
		 System.out.println("b = "+ b);
		 System.out.println("c = "+ c);
		// System.out.println("d = "+ d);
	 }
	 
 }
 class AnotherClass {
	 void display() {
		 ParentClass obj =new ParentClass();
		 System.out.println(obj.a);
		 System.out.println(obj.b);
		 System.out.println(obj.c);
	 }
 }
