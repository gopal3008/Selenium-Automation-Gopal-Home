package OOPConceptPart1;

public class Car {

	//Class/Global variable
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		// 	new Car() is the object of Car Class
		//	a/b/c is the reference of these objects
		Car a = new Car();  //--> Right hand side is the object and left side is object reference variable
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 23;
		a.wheel = 21;
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println("********************************************************************");
		b.mod = 24;
		b.wheel = 22;
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println("********************************************************************");
		c.mod = 25;
		c.wheel = 23;
		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println("********************************************************************");
		a=b;
		b=c;
		c=a;
		a.mod = 23;
		a.wheel = 21;
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println("********************************************************************");
		b.mod = 24;
		b.wheel = 22;
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println("********************************************************************");
		c.mod = 25;
		c.wheel = 23;
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		
		a.mod = 10;
		System.out.println(a.mod);
		c.mod =20;
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		
		
		
		
	}

}
