package org.example.ProductOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    int[] nums;

    public ProductOfArrayExceptSelf(int[] nums) {
        this.nums = nums;
    }

    public int[] bruteForceMethod () {
        int[] newArray = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0 ; j < nums.length ; j ++){
               if(nums[i] != nums[j]){
                   product *= nums[j];
               }
            }
            newArray[i] = product;
        }

        return newArray;
    }

    public int[] efficientMethod () {
        int n = nums.length;
        int[] newArray = new int[n];

        int[] productLeftElements = new int[n];
        productLeftElements[0] = 1;

        for (int i = 1; i < n ; i++) {
            productLeftElements[i] = productLeftElements[i-1] * nums[i-1];
        }

        int[] productOfRightElements = new int[n];
        productOfRightElements[n-1] = 1;

        for (int i = n-2; i >= 0 ; i--) {
            productOfRightElements[i] = productOfRightElements[i+1] * nums[i+1];
        }

        for (int i = 0 ; i < n ; i++) {
            newArray[i] = productLeftElements[i] * productOfRightElements[i];
        }

        System.out.println("productLeftElements" + Arrays.toString(productLeftElements));
        System.out.println("productOfRightElements" + Arrays.toString(productOfRightElements));

        return newArray;
    }

}
