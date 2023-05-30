package org.example;


import org.example.ContainsDuplicate.ContainsDuplicate;
import org.example.MaximumProductSubarray.MaximumProductSubarray;
import org.example.MaximumSubArray.MaximumSubArray;
import org.example.MinimumInRotatedSortedArray.MinimumInRotatedSortedArray;
import org.example.ProductOfArrayExceptSelf.ProductOfArrayExceptSelf;
import org.example.StockProfit.StockProfit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};

        MinimumInRotatedSortedArray minimumInRotatedSortedArray = new MinimumInRotatedSortedArray(nums);

        int result = minimumInRotatedSortedArray.efficientMethod();
        System.out.println(result);
    }


}

