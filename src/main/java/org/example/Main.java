package org.example;


import org.example.ContainsDuplicate.ContainsDuplicate;
import org.example.MaximumProductSubarray.MaximumProductSubarray;
import org.example.MaximumSubArray.MaximumSubArray;
import org.example.ProductOfArrayExceptSelf.ProductOfArrayExceptSelf;
import org.example.StockProfit.StockProfit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};

        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray(nums);

        int result = maximumProductSubarray.bruteForceMethod();
        System.out.println(result);


    }


}

