package InterviewQuestions;


public class ReverseNumbersinArray { 

	// Reverse subarray a[0..k-1] 
	static void reverse(int []a, int n, int k) 
	{ 
		if (k > n) 
		{ 
			System.out.println( "Invalid k"); 
			return; 
		} 
	
		// One by one reverse first 
		// and last elements of a[0..k-1] 
		for (int i = 0; i < k/2 ; i++) 
		{ 
			int tempswap = a[i]; 
				a[i] = a[k - i - 1]; 
				a[k - i - 1] = tempswap;			 
		} 
	} 

	// Drive code 
	public static void main(String args[]) 
	{ 
		int []a = {1, 2, 3, 4, 5, 6}; 
		int n = a.length, k = 6; 
		System.out.println(n);
	
		reverse(a, n, k); 
		for (int i = 0; i < n; ++i) 
			System.out.print(a[i] + " "); 
	System.out.println();
		k = 3; 
		reverse(a, n, k); 
		for (int i = 0; i < n; ++i) 
			System.out.print(a[i] + " "); 
		System.out.println();
		k = 4; 
		reverse(a, n, k); 
		for (int i = 0; i < n; ++i) 
			System.out.print(a[i] + " "); 
	} 
} 

//This code is contributed by Sam007. 
