package OOPConceptPart1;

public class Staticandnonstaticconcepts {
	//global variable --> Scope is across all the function with some conditions based on static non static
	String name = "Tom";
	static int age = 25;
	public static void main(String[] args) {
// To access static method there are two ways
		// 1. directly call the method
		sum();
		//2. second way is using the class
		Staticandnonstaticconcepts.sum();
		// to access static variables you can directly call them
		System.out.println(age);
		System.out.println(Staticandnonstaticconcepts.age);
		
		// to access non static var you need to create the obj
		//non static var and methods can't be accessed directly like below
		//`System.out.println(name);
		//static method can be access using the class obj with a warning saying the use the static method in the way it is supposed to be used
		
		
	
		// seperate memory allocation is given to all these static variable and methods in java memory
		
		
		Staticandnonstaticconcepts obj = new Staticandnonstaticconcepts();
		System.out.println(obj.name);
		obj.sendmail();
		obj.sum();
		
		
		
	}
	public void sendmail(){//Non static method
		System.out.println("send mail method");
	}
	public static void sum(){ //static method
		System.out.println("sum mehod");
	}

}
