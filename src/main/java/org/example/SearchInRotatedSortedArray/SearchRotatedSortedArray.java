package org.example.SearchInRotatedSortedArray;

public class SearchRotatedSortedArray {
    int[] nums;
    int target;

    public SearchRotatedSortedArray(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int bruteForceMethod() {
        int index = 0;


        for (int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == target){
                index = i;
            }
        }

        return index;
    }

    public int efficientMethod() {
        int left = 0;
        int right = nums.length-1;

        while (left <= right){

            int mid = left + (right - left) / 2 ;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[left] <= nums[mid]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
