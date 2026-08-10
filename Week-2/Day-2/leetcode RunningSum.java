class Solution {
    public int[] runningSum(int[] nums) {
    int initial = 0;
    for (int i = 0; i < nums.length; i++){
        initial = initial + nums[i];
        nums[i] = initial;
        
    }
    return nums;
    }
}