package bloomberg;

public class BalancedParanthesis {
	
	static class stack{
		int top = -1;
		char[] items = new char[100];
		public void push(char x){
			if(top==99){
				System.out.println("stack full");
			}else{
				items[++top]=x;
			}
		}
		
		public char pop(){
			if(top==-1){
				System.out.println("Stack empty");
				return '\0';
			}else{
				char element = items[top];
				top--;
				return element;
			}
		}
		
		boolean isEmpty(){
			return (top==-1) ? true : false;
		}
	}
	static boolean isMatchingPair(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
         return true;
       else if (character1 == '{' && character2 == '}')
         return true;
       else if (character1 == '[' && character2 == ']')
         return true;
       else
         return false;
    }
	
	private static boolean areParenthesisBalanced(char[] exp) {
		// TODO Auto-generated method stub
		
		stack st = new stack();
		
		for(int i =0;i<exp.length;i++){
			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
				st.push(exp[i]);
			
			if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']'){
				if(st.isEmpty())
					return false;
				
				if(!isMatchingPair(st.pop(), exp[i]))
					return false;
			}
			
		}
		if(st.isEmpty())
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char exp[] = {'{','(',')','}','[',']'};
        if (areParenthesisBalanced(exp))
          System.out.println("Balanced ");
        else
          System.out.println("Not Balanced "); 
	}


	

	

}
