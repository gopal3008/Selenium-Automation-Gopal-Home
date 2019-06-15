package OOPConceptsParttwo;

public class BMWInheritence extends CarInheritence{//has a 
	
	//when same method is present in parentand child class with same name and same arguments, is called as method overriding
public void start(){
	System.out.println("Special Start mehtod");
}

public void theftsafety(){
	System.out.println("Safety Method");
}
}
