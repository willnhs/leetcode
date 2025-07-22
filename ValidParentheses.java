public class ValidParentheses{
  public static void main(String[] args){
    String s1 = "([{}])"; // true
    String s2 = "()[]{}"; // true
    System.out.println(isValid(s1));
    System.out.println(isValid(s2));
  }

  public static boolean isValid(String s){
    if (s.length() % 2 == 1){
      return false;
    }

    int left = 0;
    int right = s.length() - 1;

    while (left < right){
      char lChar = s.charAt(left);
      char rChar = s.charAt(right);

      switch (lChar){
        case '(' -> {
          if (rChar != ')'){
            return false;
          }
        }
        case '{' -> {
          if (rChar != '}'){
            return false;
          }
        }
        case '[' -> {
          if (rChar != ']'){
            return false;
          }
        }
      }
      ++left;
      --right;
    }

    return true;
  }
}