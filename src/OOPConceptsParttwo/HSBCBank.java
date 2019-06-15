package OOPConceptsParttwo;


public class HSBCBank implements USBank,BrazilBank{//we are achieving multiple inhertence: IS-A Relation
	// Has a relationship --> Class to class (Use keyword Extends)
	//Is a relationship --> Class to Interface relationship (use implements Keyword)
	
	
	//HSBC bank must have the methods defined in USBANK Interface otherwise system will throw error
	//HSBCBANK can have their own methods
// If a class is implementing any interface, then its mandatory to define/override all the methods of Interface
	int a = 10;
	
	public void mutualFund(){
		System.out.println("Mutual Fund");
	}
	
	public void credit(){
		System.out.println("Credit");
	}
	
	public void debit(){
		System.out.println("Debit");
	}
	
	public void tranferMoney(){
		System.out.println("transferMoney");
	}
	
	public void educationLoan(){
		System.out.println("Education Loan");	
	}
	public void carLoan(){
		System.out.println("Car Loan");
	}
	
	
	
	
	
	
	
	
	

}
