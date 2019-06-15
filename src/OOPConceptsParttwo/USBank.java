package OOPConceptsParttwo;

public interface USBank {

	int min_bal = 100;
	
	//only declaration of method; no need to write body
	// In interface we can declare the variables and Variables are by default static in nature
	// Variable values can't be changed;
	// no static methods in interface;
	// no main method;
	// No object for Interface
	//Interface is abstract(no object creation) in nature
	
	public void credit();
		
	public void debit();
	
	public void tranferMoney();
	
	
	
	
	
	
}
