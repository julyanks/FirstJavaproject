package Unit_01;

public class P5_Task01_ClassAndObjectInJava {

	public static void main(String[] args) {
	abc2 obj=new abc2();
	obj.display2();
	
	abc2.display();

	}

}
class abc2{
	 int a =10;
	 static int b=10;
	 
	 static void display() {
		 int b=10;
		 b++;
		 
		 //System.out.println(a);
		 System.out.println(b);
		 
	 }
	 
	 void display2() {
		 System.out.println(a);
		 
		 //As a was local variable so we can not acess it outside the method
		 //System.out.println(b);
	 }
	
}