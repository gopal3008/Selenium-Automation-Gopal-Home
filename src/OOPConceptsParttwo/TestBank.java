package OOPConceptsParttwo;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HSBCBank hs = new HSBCBank();

hs.credit();//override of USBANK
hs.debit();//override of USBANK
hs.tranferMoney();//override of USBANK
hs.carLoan();//Seperate methods for HSBC Bank
hs.educationLoan();//Seperate methods for HSBC Bank
System.out.println(USBank.min_bal);
int c = USBank.min_bal;
System.out.println(c);
hs.mutualFund();//override of Brazilbank

//dynamic Polymorphism
//Child class object can be referred by parent Interface Var
USBank b = new HSBCBank();
b.credit();
b.debit();
b.tranferMoney();
System.out.println(b.min_bal);
//System.out.println(b.a);



	}

}
