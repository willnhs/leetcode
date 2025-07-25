class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                for (int k = j + 1; k < nums.length; k++){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        ArrayList<Integer> triplet = new ArrayList<>();
                        
                        /*
                        // ijk
                        if (nums[i] <= nums[j] && nums[j] <= nums[k] && nums[i] <= nums[k]) {
                            triplet.add(nums[i]);
                            triplet.add(nums[j]);
                            triplet.add(nums[k]);
                        }
                        // ikj
                        else if (nums[i] <= nums[k] && nums[k] <= nums[j] && nums[i] <= nums[j]){
                            triplet.add(nums[i]);
                            triplet.add(nums[k]);
                            triplet.add(nums[j]);
                        }
                        // jik
                        else if (nums[j] <= nums[i] && nums[i] <= nums[k] && nums[j] <= nums[k]){
                            triplet.add(nums[j]);
                            triplet.add(nums[i]);
                            triplet.add(nums[k]);
                        }
                        // jki
                        else if (nums[j] <= nums[k] && nums[k] <= nums[i] && nums[j] <= nums[i]) {
                            triplet.add(nums[j]);
                            triplet.add(nums[k]);
                            triplet.add(nums[i]);
                        }
                        // kji
                        else if (nums[k] <= nums[j] && nums[j] <= nums[i] && nums[k] <= nums[i]) {
                            triplet.add(nums[k]);
                            triplet.add(nums[j]);
                            triplet.add(nums[i]);
                        }
                        // kij
                        else if (nums[k] <= nums[i] && nums[i] <= nums[j] && nums[k] <= nums[j]) {
                            triplet.add(nums[k]);
                            triplet.add(nums[i]);
                            triplet.add(nums[j]);
                        }
                        */

                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        if (!triplets.contains(triplet)) {
                            triplets.add(triplet);
                        }  
                    }
                }
            }
        }
        
        return triplets;
    }
}
