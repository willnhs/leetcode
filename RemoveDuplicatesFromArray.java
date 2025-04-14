import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray{
  public static void main(String[] args){
    int[] nums = {1,1,1,2,2,3,3,3,3,4,4};

    System.out.println("Number of unique elements in nums: " + removeDuplicatesUsingTwoPointers(nums));

    System.out.println(Arrays.toString(nums));
  }

  public static int removeDuplicatesUsingSet(int[] nums){
    if (nums.length == 1){
      return 1;
    }

    HashSet<Integer> encountered = new HashSet<Integer>();
    // int unique = 0;

    for (int i = 0; i < nums.length; i++){
      if (!(encountered.contains(nums[i]))){
        encountered.add(nums[i]);
        // ++unique;
      }
			else{
        nums[i] = 101;
      }
    }

    Arrays.sort(nums);

    // return unique;
    return encountered.size();
  }

  public static int removeDuplicatesUsingTwoPointers(int[] nums){
    // set up two pointers
    int ptr1 = 0;
    int ptr2 = 1;

    int k = 1; // guaranteed that nums will have at least one unique element

    // if array has only one element, we're done
    if (nums.length == 1){
      return k;
    }

    // otherwise sort the array
    Arrays.sort(nums);

    boolean done = false;

    while (!done){
      // when duplicate is encountered
      while (nums[ptr2] == nums[ptr1]){
        // remove duplicate
        nums[ptr2] = 101;
        ++ptr2;
        if (ptr2 == nums.length){
          done = true;
          break;
        }
      }

      // sync two pointers
      ptr1 = ptr2;

      // if ptr2 has not reached out of bounds, unique element was encountered
      if (ptr2 < nums.length){
        ++k;
      }

      // check if we're done
      if (done){
        break;
      }
      else{
        ++ptr2;
        if (ptr2 == nums.length){
          done = true;
        }
      }
    }

    Arrays.sort(nums);

    return k;
  }
}
