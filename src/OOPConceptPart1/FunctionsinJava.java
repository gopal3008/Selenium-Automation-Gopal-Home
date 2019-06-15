package OOPConceptPart1;

public class FunctionsinJava {

	int a = 8;
	int b = 4;
	//Non Static methods
	// Types of function
	// 1. No input no output
	// 2. No input but some output
	// 3. some input some output
	public static void main(String[] args) {
		//Main method is always static and void
		// Main method we never write return type. we never return anything
		// The below functions/methods are non static (No static keyword)
		// the object created for the class can refer all the non static methods
		
		
		// First of all there was nothing in  main method and we didn't call any of the below method
		// when we run the code there is nothing in console
		// now we need to call the methods below
		// to call the methods we need to create the obj of class
		FunctionsinJava obj = new FunctionsinJava();
		int c = obj.division(10, 5);
		System.out.println(c);
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		String q = obj.qa();
		System.out.println(q);
		
		
	}
	public void test(){// test() is the method
		// void means we can't return any value from the method
		System.out.println("test Method");
		//No input No output
	}
	public int pqr(){
		// instead of void we are writing int because we are returning 'C' which is an integer.
		// That means we write the datatype of the values which we are expecting the function to return
		System.out.println("PQR Method");
		int a  = 10;
		int b =20;
		int c = a+b;
		return c;
	//No input some output
	}
	
	public String qa(){
		System.out.println("QA MEthod");
		String s = "Gopal";
		return s;
		//No input some output
	}
	public int division(int a, int b){ //a and b are input arguments/parameters
		System.out.println("Division Method");
//		int a  = 10;
//		int b  = 5;
		int c = a/b;
		System.out.println(c);
		return c;
		// some input some output
		
	}

}
