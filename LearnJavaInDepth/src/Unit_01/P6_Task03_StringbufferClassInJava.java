package Unit_01;
/* 3ways:
 * - StringBuffer()
 * - StringBuffer(String str)
 * - StringBuffer(int capacity)
 * 
 * - StringBuffer in mutable unlike string
 * 
 */

public class P6_Task03_StringbufferClassInJava {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello ");
		sb.append("java");
		System.out.println(sb.charAt(0));
		
		//StringBuffer class append() method, now original string is changed
		System.out.println(sb);
		
		//stringBuffer insert() Method
		StringBuffer sb2=new StringBuffer("Hello ");
		sb2.insert(1,"Java");//now original string is changed
		System.out.println(sb2);//print HJavaello
		
		//strinBuffer replace() method
		StringBuffer sb3=new StringBuffer("Hello ");
		sb3.replace(1,3,"Java");
		System.out.println(sb3); //prints HJavalo
		
		//stringBuffer delete() method
		StringBuffer sb4=new StringBuffer("Hello");
		sb4.delete(1,3);
		System.out.println(sb4); //prints Hlo

	}


	}