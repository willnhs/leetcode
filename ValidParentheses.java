public class ValidParentheses{
  public static void main(String[] args){
    String s1 = "([{}])"; // true
    String s2 = "()[]{}"; // true
    System.out.println(isValid(s1));
    System.out.println(isValid(s2));
  }

  public boolean isValid(String s){
    Stack<Character> stack = new Stack<>();
    
    for (int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);
      
      if (ch == '{' || ch == '(' || ch == '['){
        stack.push(ch);
      }
      else if (ch == '}' || ch == ')' || ch == ']'){
        if (stack.isEmpty()){
          return false;
        }
        char match = stack.pop();

        switch (ch){
          case '}' -> {
            if (match != '{'){
              return false;
            }
          }
          case ')' -> {
            if (match != '('){
              return false;
            }
          }
          case ']' -> {
            if (match != '['){
              return false;
            }
          }
        }
      }
    }
    
    if (!stack.isEmpty()){
      return false;
    }
    
    return true;
  }
}
