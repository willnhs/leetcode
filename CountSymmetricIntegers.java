/* Problem Statement
- Given: two positive integers, low and high
- An integer x consisting of 2 * n digits is symmetric if:
  The sum of the first n digits of x is equal to the sum of the last n digits of x.
- Numbers with an odd number of digits are never symmetric
- Return: the number of symmetric integers in the range [low, high]
You are given two positive integers low and high.
 */

/*
- 2 * n digits => a symmetric integer must consist of an even # of digits
- sum of the first half (n) of its digits == sum of the second half of its digits (n digits)
 */
public class CountSymmetricIntegers{
  public static void main(String[] args){

    // input: low = 1, high = 100
    // output: 9
    // explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.

    // input: low = 1200, high = 1230
    // output: 4
    // explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
    System.out.println(countSymmetricIntegers(1200, 1230));
  }

  public static int countSymmetricIntegers(int low, int high){
    int count = 0;
    while (low <= high){
      if (isSymmetric(low)){
        ++count;
      }
      ++low;
    }
    return count;
  }

  public static boolean isSymmetric(int num){
    if (!isEvenLength(num)){
      return false;
    }

    String numString = String.valueOf(num);
    char[] numChar = numString.toCharArray();

    int ptr1 = 0;
    int ptr2 = numString.length() - 1;
    int firstHalf = 0;
    int secondHalf = 0;
    while (ptr1 < ptr2){
      firstHalf += numChar[ptr1] - '0';
      secondHalf += numChar[ptr2] - '0';
      ++ptr1;
      --ptr2;
    }

    return firstHalf == secondHalf;
  }

  public static boolean isEvenLength(int num){
    return String.valueOf(num).length() % 2 == 0;
  }
}