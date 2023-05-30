package org.example.ContainsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate {
    int[] nums;

    public ContainsDuplicate(int[] nums) {
        setNums(nums);
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public boolean containsDuplicateBruteForce () {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){

            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public boolean containsDuplicateEfficient() {
        Arrays.sort(nums);

        for(int i =0 ; i < nums.length - 1 ; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public void printResult () {
        boolean result = containsDuplicateEfficient();
        if(result){
            System.out.println("duplicate exist");
        }else {
            System.out.println("duplicate does not exist");
        }
    }
}
