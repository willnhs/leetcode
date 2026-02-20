import java.util.Arrays;

public class SquaresOfASortedArray{
  public static void main(String[] args){
    int[] ex1 = { -4, -1, 0, 3, 10 };
    System.out.println(Arrays.toString(sortedSquares(ex1)));
  }

  // Squaring each element and sorting it is O(nlogn) time
  // use two-pointer approach for O(n) time and O(n) space
  // recognize that because the original array is sorted, the largest squares come from the extreme ends of the array
  public static int[] sortedSquares(int[] nums){
    int[] sortedSquares = new int[nums.length];

    int left = 0;
    int right = nums.length - 1;
    int idx = nums.length - 1;

    while (left <= right){
      if (Math.abs(nums[left]) < Math.abs(nums[right])){
        sortedSquares[idx] = nums[right] * nums[right];
        --right;
      }
      else{
        sortedSquares[idx] = nums[left] * nums[left];
        ++left;
      }
      --idx;
    }

    return sortedSquares;
  }
}