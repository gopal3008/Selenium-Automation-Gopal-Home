package OOPConceptPart1;

public class Callbyrefereneandcallbyvalueconcepts {

	
	int p;
	int q;
	public static void main(String[] args) {
	Callbyrefereneandcallbyvalueconcepts obj = new Callbyrefereneandcallbyvalueconcepts();
	int i = obj.testsum(10, 20);
	System.out.println(i);
	
	obj.p = 40;
	obj.q = 50;
	//before swapping numbers
	System.out.println(obj.p);
	System.out.println(obj.q);
	obj.swap(obj);//Call by reference we give pass the obj reference to the method
	// after swapping the numbers
	System.out.println(obj.p);
	System.out.println(obj.q);
	//call by value/Pass by value we pass the variable(m and n) value to function/method only once
	int m =10;
	int n = 20;
	int o = obj.testsum(m, n);
	System.out.println(o);
	}
	public int testsum(int a,int b){
		//changing the a and b values on purpose even though there will not be any change in values of m and n
		a=30;
		b=40;
		int c = a+b;
		return c;
	}
	public void  swap(Callbyrefereneandcallbyvalueconcepts t){
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q= temp;
	}

}
