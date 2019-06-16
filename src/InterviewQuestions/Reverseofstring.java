package InterviewQuestions;

import java.util.Scanner;

public class Reverseofstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed");
		String Str = sc.nextLine();
		System.out.println(Str);
		boolean a = Str.contains(" ");
		System.out.println(a);
if(a){
	String[] StringArray = Str.split(" ");
	System.out.println(StringArray.length);
	String space = "";
	for(int i=0;i<StringArray.length;i++){
		char[] d = StringArray[i].toCharArray();
		
		for (int j=StringArray[i].length()-1;j>=0;j--){
			space =space+d[j];
		}
		space = space+" ";
	}
	System.out.println(space);
}
		
if(Str.contains(" ")){
		System.out.println("String contains spaces ");	
		}


char[] c = Str.toCharArray();
System.out.println(c.length);

String output = "";
for (int i=(Str.length()-1);i>=0;i--){
	output = output+c[i];
//	System.out.println(output);
		}

System.out.println("reverse Of "+Str+" is :"+output);

String rev = "";

for (int i = output.length()-1;i>=0;i--){
	rev= rev+output.charAt(i) ; 
}
System.out.println("Again reverse is " + rev);


if(output.equals(Str)){
	System.out.println("String is also a palindrome");
	}
else{
	System.out.println("String is not a palindrome");
}

	}

}
