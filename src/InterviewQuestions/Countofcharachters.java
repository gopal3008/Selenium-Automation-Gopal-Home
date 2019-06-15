package InterviewQuestions;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Countofcharachters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed");
		String Str = sc.nextLine();
		System.out.println(Str);
		char[] c = Str.toCharArray();
//		List<String> aList = new ArrayList<String>(); 
//		List<String> animals = new ArrayList<String>();
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i=0;i<c.length;i++){
		list.add(c[i]);
		}
		System.out.println(list);
//		int count = 0;
		Set<Character> set = new HashSet<Character>(list);
		System.out.println(set);
			Iterator<Character> it=set.iterator();
//			int count= 0;
			while(it.hasNext()){
				int count = 0;
				Character c1 = it.next();
//				System.out.println(c1);
				for(int i=0;i<c.length;i++){
					if(c1==c[i]){
						count++;
					}
					
				}
				System.out.println("count of "+c1+" is :"+count);
								
			}
			
//			System.out.println(count);
		
		
//		for(int i=0;i<Str.length();i++){
//			set.add(Str.charAt(i));
//		}
//		System.out.println(set);

	}

}
