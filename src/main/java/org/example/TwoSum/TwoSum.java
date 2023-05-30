package org.example.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    int[] nums;
    int target;

    public TwoSum(int[] nums, int target) {
        setNums(nums);
        setTarget(target);
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int[] twoSumBruteForce(int[] nums, int target) {
        int[] indices = new int[2];

        for(int i = 0; i < nums.length ; i++){
            for (int j = 1; j < nums.length ; j++){
                if(nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    public int[] twoSumEfficient(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) { // Check if the complement exists in the map
                return new int[] { numMap.get(complement), i }; // Return the indices of the complement and the current element
            }
            numMap.put(nums[i], i);
        }


        throw new IllegalArgumentException("No two elements sum up to the target."); // Throw an exception if no solution is found
    }
}
