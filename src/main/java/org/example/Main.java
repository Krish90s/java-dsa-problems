package org.example;


import org.example.ThreeSum.ThreeSum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        ThreeSum threeSum = new ThreeSum(nums);

        System.out.println(threeSum.efficientMethod());
    }


}

