package InterviewQuestions;

public class PrimeNumbers {
static int i;
	public static boolean primeNumbers(int num){
		if (num <=1){
			return false;
		}
		for (i=2;i<num/2;i++){
	if(num%i==0){
		return false;
	}
		}
		return true;
}

	public static void numberofprimenumbers(int num){
//		int temp = 0;
		for(i=2;i<=num;i++){
		if(primeNumbers(i)){
			System.out.println(i);
		}
		
		}
//		return temp;
	}
	public static void main(String[] args) {
System.out.println(primeNumbers(24));
//numberofprimenumbers(4);
//System.out.println(i);
	}

}
