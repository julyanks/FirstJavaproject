package Unit_01;
/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {
	
		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		//obj.reverseOfAString(s1);
		//obj.stringEqualOrNot(s1, s2);

	}

}
class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		int strlength=s.length();
	int i=0,j=strlength-1,c=0;
	while(i<j) {
		if(s.charAt(i) == s.charAt(j)) {
			c++;
		}
		else {
			c=0;
		}
	}
	if(c>0) {
		System.out.println("String is palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
		

	}

	void reverseOfAString(String s) {
		// Write Logic Here!
		int strlength=s.length();
		int i;
		String reverse="";
		for(i=strlength-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Reverse of a string is "+reverse);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		int l1=s1.length();
		int l2=s2.length();
		if(l1==l2) {
			for(int i=0;i<l1-1;i++) {	
			if(s1.charAt(i)!=s2.charAt(i)) {
				System.out.println("Strings are not equal");
			}
			else {
				System.out.println("Strings are equal");
			}
		}
		}
		
	}
}