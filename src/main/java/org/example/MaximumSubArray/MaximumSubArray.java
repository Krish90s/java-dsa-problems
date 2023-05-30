package org.example.MaximumSubArray;

public class MaximumSubArray {
    int[] nums;


    public MaximumSubArray(int[] nums) {
        setNums(nums);
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int bruteForceMethod () {
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            int currentSum = 0;
            for(int j = i ; j < nums.length ; j++){
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);

            }
        }
        return maxSum;
    }


    public int efficientMethod () {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
