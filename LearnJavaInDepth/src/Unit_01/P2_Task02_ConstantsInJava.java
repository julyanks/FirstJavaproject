
package Unit_01;
/* -Constants never Change once a value is assigned
* private:"Inside Class Only"
* protected:Class+Same Package
* public Class+Within the Package+Outside the Package
* Default:No Keywords,Package-private{Not Outside the Package }
* 
*/
public class P2_Task02_ConstantsInJava {
	public static final double pi=3.14;
	//pi=3.18;
	public static void main(String[] args) {
	      
		System.out.println(pi);
		main("Ankita");
	}
	public static void main(String args)
	{
		System.out.println(pi);
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(pi);
	}

}
class NewClass{
	final double pi=3.14;
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(pi);
	}
}