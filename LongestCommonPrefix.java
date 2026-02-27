public class LongestCommonPrefix{
  public static void main(String[] args){
    String[] strs1 = {"flower", "flow", "flight"};
    String[] strs2 = {"dog", "racecar", "car"};

    System.out.println(longestCommonPrefix1(strs1));
    System.out.println(longestCommonPrefix1(strs2));
  }

  public static String longestCommonPrefix1(String[] args){
    // Assume first element is longest common prefix
    String prefix = args[0];

    // Compare the prefix with every other string in the array
    // The prefix can either shrink, stay the same, or grow in size
    for (int i = 1; i < args.length; ++i){
      int j = 0;
      // take the smallest common prefix
      while (j < Math.min(prefix.length(), args[i].length())){
        if (prefix.charAt(j) != args[i].charAt(j)){
          break;
        }
        ++j;
      }
      prefix = args[i].substring(0, j);
    }

    return prefix.isEmpty() ? "empty string" : prefix;
  }
}