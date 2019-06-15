package OOPConceptsParttwo;

public class Car {

//	Can't override static method when parent method is static and child is non static

//	public  void start(){
//		System.out.println("Start car");
//			}
//	Method Hiding
	public static void start(){
		System.out.println("Start car");
			}
	public static void start(String price){
		System.out.println("Start car");
			}
	public void stop(){
		System.out.println("stop car");
			}
	public void refuel(){
		System.out.println("refuel car");
			}
	
	
	
	
	
	
	
	
}
