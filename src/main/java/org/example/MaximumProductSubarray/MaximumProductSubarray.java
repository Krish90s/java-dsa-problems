package org.example.MaximumProductSubarray;

public class MaximumProductSubarray {
    int[] nums;

    public MaximumProductSubarray(int[] nums) {
        this.nums = nums;
    }

    public int bruteForceMethod () {
        int maxProduct = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0 ; i < n ; i++){
            int product = 1;

            for(int j = i ; j < n ; j++){

                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);

            }
        }

        return maxProduct;
    }

    public int efficientMethod() {
        int maxProduct = nums[0];
        int currentMaxValue = nums[0];
        int currentMinValue = nums[0];

        for (int i = 1 ; i < nums.length ; i++){

            if(nums[i] < 0){
                int temp = currentMaxValue;
                currentMaxValue = currentMinValue;
                currentMinValue = temp;
            }

            currentMaxValue = Math.max(nums[i], currentMaxValue * nums[i]);
            currentMinValue = Math.max(nums[i], currentMinValue * nums[i]);

            maxProduct = Math.max(maxProduct, currentMaxValue);
        }

        return maxProduct;
    }
}
