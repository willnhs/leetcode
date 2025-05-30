// Leetcode #153:
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class FindMinimumInRotatedSortedArray{
  /*
    Array:        [1, 2, 3, 4, 5, 6]
    1st rotation: [6, 1, 2, 3, 4, 5]
    2nd rotation: [5, 6, 1, 2, 3, 4]
    3rd rotation: [4, 5, 6, 1, 2, 3]
    4th rotation: [3, 4, 5, 6, 1, 2]
    5th rotation: [2, 3, 4, 5, 6, 1]
    6th rotation: [1, 2, 3, 4, 5, 6]
   */
  public static void main(String[] args){
    int[] nums1 = new int[] {3, 4, 5, 6, 1, 2};
    int[] nums2 = new int[] {4, 5, 0, 1, 2, 3};
    int[] nums3 = new int[] {4, 5, 6, 7};
    int[] nums4 = new int[] {1, 2, 3, 4, 5};

    System.out.println("Min element in nums1: " + findMin(nums1));
    System.out.println("Min element in nums2: " + findMin(nums2));
    System.out.println("Min element in nums3: " + findMin(nums3));
    System.out.println("Min element in nums4: " + findMin(nums4));
  }

  public static int findMin(int[] nums){
    int min = nums[0];
    int left = 0;
    int right = nums.length - 1;

    while (left < right){
      // if the two sub arrays are already sorted, leftmost value could be the minimum
      // ex: [1, 2, 3, 4, 5, 6] or [4, 5, 6, 1, 2, 3]
      if (nums[left] < nums[right]){
        min = Math.min(min, nums[left]);
        break;
      }

      // use binary search to find the minimum value
      int mid = (left + right) / 2;
      // assume value at mid ptr is min
      min = Math.min(min, nums[mid]);

      // decide if we search to the left or right of mid
      // if left subarray is sorted and mid is part of it
      if (nums[mid] >= nums[left]){
        left = mid + 1;
      }
      // if right subarray is sorted and mid is part of it
      else{
        right = mid - 1;
      }
    }

    return min;
  }
}