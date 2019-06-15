package OOPConceptsParttwo;




public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// static polymorphism or compile time polimorishm compile time because during compile it select which method to pick if the same method is present in parent and child	
		BMWInheritence b = new BMWInheritence();
	
b.start();
b.theftsafety();
b.start();
b.refuel();
b.refuel();
//b.vehicle();
//inheriting properites from grand parents
b.engine();


//no parent class can have child properties or method.
	 CarInheritence c = new CarInheritence();
	 c.start();
	 c.refuel();
	 c.stop();
	 
// 	child class object can be refered by parent class obj reference --> Called as dynamic polymorphism or Run time polymorphism
	 //Top Casting -- child class object can be refered by parent class obj reference 
	 CarInheritence C1 = new BMWInheritence();
C1.start();//Child method will be given priority
//Only parent class method or Overridden methods can be used during dynamic polymorphism
C1.stop();
C1.refuel();

//Down Casting is not allowed
//Parent class object can't be referred by child class obj reference below is the example which is not allowed
//BMWInheritence b1 = new CarInheritence(); --> Not allowed
BMWInheritence b1 = (BMWInheritence)new CarInheritence(); // --> Now we are casting the parent class by child class object but this 
//is only to remove compile time error it will fail during run time with compile class cast error(ClassCastException:)




	}

}
