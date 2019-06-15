package OOPConceptsParttwo;

public class CarInheritence extends Vehicle {
	//whenever there is a method with same name and argument between parent and child. Child method should be considered whenever call from mail class
	//child can have all its parents method or properties but parent can't have child properties
	//different children can have only one parent but parent can have multiple children
	//use keyword EXTENDS in child class to extend the inheritances
	public void start(){
		System.out.println("Car Start");
	}
	public void stop(){
		System.out.println("Car Stop");
	}
	public void refuel(){
		System.out.println("Car refuel");
	}

}
