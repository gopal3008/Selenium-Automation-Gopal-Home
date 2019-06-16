package InterviewQuestions;

public class Occuranceofcharachter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Gopal Agarwal";
System.out.println(str.indexOf('A'));
System.out.println(str.indexOf("l A"));
System.out.println(str.indexOf('a'));
System.out.println(str.indexOf('a', str.indexOf('a')+1));
System.out.println(str.charAt(8));

int a = str.indexOf('a', str.indexOf('a')+1);
System.out.println(str.indexOf('a',a+1));

for(int i=0;i<str.length();i++){
//	if()
}





	}

}
