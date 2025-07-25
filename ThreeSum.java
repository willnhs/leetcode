class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            int target = -nums[i];

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                List<Integer> triplet = new ArrayList<>();
                int sum = nums[left] + nums[right];
                if (i == left || sum < target){
                    ++left;
                }
                else if (i == right || sum > target){
                    --right;
                }
                else {
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    if (!triplets.contains(triplet)){
                        triplets.add(triplet);
                    }
                    ++left;
                }
            }
        }
        return triplets;
    }
}
