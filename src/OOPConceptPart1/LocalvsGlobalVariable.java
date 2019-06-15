package OOPConceptPart1;

public class LocalvsGlobalVariable {

	//below are called as Global/Class Variable as these are defined just after the class
	//Scope of the global variable is thorught out the project
	String name  = "Tom";
	int age = 25;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Local variables
		// System.out.println(name); --> Can't use directly the global variable 
		// To access global variable you have to create the class obj
		int i = 10; //i is local variable of main method
		LocalvsGlobalVariable obj = new LocalvsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(i);
		

	}
	
	public void sum(){
		//Local variables
		
		int i =15; //i is the local variable of sum() method i and j can't be used in some other method
		int  j =14;
		int age = 25;
		
	}

}
