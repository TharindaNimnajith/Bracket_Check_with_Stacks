package dsa;

public class BracketCheck {
	private String inputstr;
	
	public BracketCheck(String inputstr) {
		this.inputstr = inputstr;
	}
	
	public void check() {
		int size = inputstr.length();		
		StackX st = new StackX(size);
		
		for(int i = 0; i < size; i++) {
			if(inputstr.charAt(i) == '(')
				st.push('(');
			else if(inputstr.charAt(i) == ')')
				st.pop();
		}
		
		if(!st.isEmpty()) 
			System.out.println("Invalid String");
		else 
			System.out.println("Valid String");
	}
}
