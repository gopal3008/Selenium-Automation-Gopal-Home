package Topics;

public class Multidimensionalarrays {

	public static void main(String[] args) {
		String x[][] = new String[3][5];
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		x[0][0] = "Ram";
		x[2][3] = "Gopal";
		System.out.println(x[2][3]);
		for(int i=0;i<x.length;i++){
			for (int j=0; j<x[0].length;j++){
				System.out.println(x[i][j]);
			}
		}

	}

}
