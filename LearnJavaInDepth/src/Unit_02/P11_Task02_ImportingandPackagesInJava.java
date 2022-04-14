package Unit_02;  //Inside this package we can create many classes
/*
  - a java package is a group of similar types of classes, interface and sub-packages.
  -Package in java can be categorized in two forms
    - built-in package {lang,awt,javax,swing,net,io,util,sql}
    -user-defined package
    
  -Package also helps to avoid class name collection
  -Package also helps us to maintain access protection in Java
  -Packages are named in reverse order of domain names
   -unit01.javaproject.com-> "com.javaproject.unit01"
   
 import java.util.vector; //import the Vector class from util package
 import java.util.*; //import all the classes from util package
 
 Static import:
   -Static import is a feature introduced in Java programming language(version>=5)
   -it allows members defined in class as public static
   -to be used in java code without specifying the class in which the field is defined
    
 */
import static java.lang.System.*;

import static java.lang.Math.*;
import Unit_01.SampleClass1;

public class P11_Task02_ImportingandPackagesInJava {

	public static void main(String[] args) {
		out.println("Welcome to the package");
		System.out.println(pow(2,3));
		System.out.println(abs(6.3));
		
		SampleClass1 obj =new SampleClass1();
		

	}

}
