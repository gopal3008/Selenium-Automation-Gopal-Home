package OOPConceptPart1;

public class Methdoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methdoverriding obj = new Methdoverriding();
		obj.sum();
		obj.sum(2);
		obj.sum("GOPAL");
		obj.sum(1, 2);
		obj.main(1);
	}
	public static void main(int a){
		System.out.println("main method overloading");
	}
	// Method overloading -->  when the method name is same with different argument or same argument with different datatype
	// we can't create method inside method
	// duplicate method is not allowed --> same method name with same arguments and all
	// main method can as well be overloaded
	public void sum(){
		System.out.println("sum method with no input");
	}
	public void sum(int i){
		System.out.println("sum method with one argument and int data type");
		System.out.println(i);
	}
	public void sum(String s){
		System.out.println("sum method with one argument and different datatype");
		System.out.println(s);
	}
	public void sum(int i,int k){
		System.out.println("sum method with multiple argument with same datatype");
		System.out.println("fuck off");
	}

}
