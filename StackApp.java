package dsa;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		StackX s = new StackX(5);
		
		
		System.out.println(s.peek());
		System.out.println();
		
		System.out.println(s.pop());
		System.out.println();
			
		
		s.push('S');
		System.out.println(s.peek());
		
		s.push('T');
		System.out.println(s.peek());
		
		s.push('A');
		System.out.println(s.peek());
		
		s.push('C');		
		System.out.println(s.peek());
		
		s.push('K');		
		System.out.println(s.peek());
		
		
		System.out.println();
		
		
		s.push('X');
		
		
		System.out.println();
			
		
		while(!s.isEmpty())
			System.out.println(s.pop());
			
		
		System.out.println();
			
		
		System.out.println(s.peek());
		System.out.println();
		
		System.out.println(s.pop());
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String inputstr = sc.next();
		
		sc.close();
		
		
		BracketCheck bc = new BracketCheck(inputstr);
		bc.check();
	}
}
