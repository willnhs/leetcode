/*
  Leetcode #128: Longest Consecutive Sequence
  -- Problem Statement:
    - Given an unsorted array of integers, return the length of the longest consecutive elements sequence.

  -- Constraints:
    - Must run in O(n) time
    - 0 <= nums.length <= 10^5
    - -10^9 <= nums[i] <= 10^9

 */

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class LongestConsecutiveSequence{
  public static void main(String[] args){
    int[] nums1 = new int[] {100, 4, 200, 1, 3, 2};
    int[] nums2 = new int[] {0,3,7,2,5,8,4,6,0,1};
    int[] nums3 = new int[] {1,0,1,2};

    System.out.println("Length of longest consecutive sequence: " + longestConsecutiveSequence(nums1));
    System.out.println("Length of longest consecutive sequence: " + longestConsecutiveSequence(nums2));
    System.out.println("Length of longest consecutive sequence: " + longestConsecutiveSequence(nums3));
  }

  public static int longestConsecutiveSequence(int[] nums){
    // we cannot supply nums as a collection type to the constructor of a HashSet
    // source: https://www.baeldung.com/java-converting-int-array-to-hashset

    // why use HashSet instead of TreeSet? Because order does not matter here
    // source: https://stackoverflow.com/questions/1463284/in-which-cases-should-i-use-a-hashset-over-a-treeset
    Set<Integer> numsSet = new HashSet<>();

    for (int num : nums){
      // no need to check for duplicates because duplicates will not be inserted into the HashSet
      // source: https://stackoverflow.com/questions/12940663/does-adding-a-duplicate-value-to-a-hashset-hashmap-replace-the-previous-value
      numsSet.add(num);
    }

    // a sequence is a list of consecutive integers
    // a sequence begins with a number that does not have a neighbor to its left (predecessor)
    // we are just interested in knowing the longest consecutive sequence, i.e. a count

    // base case - the smallest possible consecutive sequence should be a single number
    // but nums is not guaranteed to be non-empty based on constraints, so base case must be empty sequence
    int count = 0;

    for (int i = 0; i < nums.length; i++){
      int predecessor = nums[i] - 1;
      int successor = nums[i] + 1;
      if (!(numsSet.contains(predecessor))){
        int len = 1;
        while (numsSet.contains(successor)){
          ++len;
          ++successor;
        }
        count = Math.max(count, len);
      }
    }

    return count;
  }
}