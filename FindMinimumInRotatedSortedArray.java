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

    System.out.println("Min element in nums1: " + findMin(nums1));
    System.out.println("Min element in nums2: " + findMin(nums2));
    System.out.println("Min element in nums3: " + findMin(nums3));
  }

  public static int findMin(int[] nums){
    int min = nums[0];

    for (int num : nums){
      min = Math.min(min, num);
    }

    return min;
  }
}