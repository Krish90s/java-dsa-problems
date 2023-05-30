package org.example.MinimumInRotatedSortedArray;

public class MinimumInRotatedSortedArray {
    int[] nums;

    public MinimumInRotatedSortedArray(int[] nums) {
        this.nums = nums;
    }


    public int bruteForceMethod () {
        int minValue = nums[0];

        for(int i = 1; i < nums.length ; i++){

            if(minValue > nums[i]){
                minValue = nums[i];
            }

        }

        return minValue;
    }

    public int efficientMethod () {
        int left = 0;
        int right = nums.length -1 ;

        while (left < right) {

            int mid = left + (right -left) / 2 ;

            if (nums[mid] > nums[right]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }

        return nums[left];
    }
}
