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
        int maxProduct = Integer.MIN_VALUE;
        int n = nums.length;



        return maxProduct;
    }
}
