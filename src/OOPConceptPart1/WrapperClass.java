package OOPConceptPart1;

public class WrapperClass {
// Wrapper classes are used to change the datatype conversions
	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//different wrapper class --> integer,Double, Boolean
		String y = "12.12";
		double a = Double.parseDouble(y);
		System.out.println(a+12.34);
		
		String h = "True";
		boolean b = Boolean.parseBoolean(h);
		System.out.println(b);
		
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		String m = "100A";
		Integer.parseInt(m);//code will give number format exception; for input string 100A
				
		
				

	}

}
