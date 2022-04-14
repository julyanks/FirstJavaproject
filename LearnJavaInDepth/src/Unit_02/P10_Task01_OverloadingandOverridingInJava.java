package Unit_02;

public class P10_Task01_OverloadingandOverridingInJava {

	public static void main(String[] args) {
		OverloadingandOverridingInJava obj = new OverloadingandOverridingInJava();
		
		 System.out.println("add() with 2 parameters");
		 System.out.println(obj.add(4,6));
		 
		 System.out.println("add() with 3 parameters");
		 System.out.println(obj.add(4,6,7));
		 
		 InheritFirstOne obj2 = new InheritFirstOne();
		 System.out.println(obj2.add(1,2));
	  System.out.println(obj2.add(1,2,4));
		 	 

	}

}

class OverloadingandOverridingInJava{
	 //within the same class: Method overloading
	int add(int a, int b) {
		System.out.println("Inside, OverloadingandOverridingInJava!:");
		return a+b;
	}
	
	int add(int a, int b,int c) {
		System.out.println("Inside , OverloadingandOverridingInJava!:");
		return a+b+c;
	}
}

//Overriding in Java : Required Inheritance
class InheritFirstOne extends OverloadingandOverridingInJava {
	
	int add(int a, int b) {
		System.out.println("Inside, InheritFirstOne !:");
		return a+b+1;
	}
	
	int add(int a, int b, int c) {
		System.out.println("Inside, InheritFirstOne!:");
		return a+b+c;
	}
	
}
