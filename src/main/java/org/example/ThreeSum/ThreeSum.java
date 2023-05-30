package org.example.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    int[] nums;

    public ThreeSum(int[] nums) {
        this.nums = nums;
    }

    public List<List<Integer>> bruteForceMethod() {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < n-2 ; i++){

            if(i > 0 && nums[i] == nums[i-1])
                continue; // Skip duplicate elements

            for(int j = i + 1 ; j < n-1 ; j++){

                if(j > i + 1 && nums[j] == nums[j-1])
                    continue; // Skip duplicate elements

                for(int k = j + 1 ; k < n ; k++){

                    if(k > j + 1 && nums[k] == nums[k-1])
                        continue;

                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.add(triplet);
                    }

                }
            }
        }

        return result;
    }


    public List<List<Integer>> efficientMethod() {
        List<List<Integer>> result = new ArrayList<>();

        // Sorting the input array
        Arrays.sort(nums);

        // Fixing one element and using two pointers to find the other two elements
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // Skip duplicate elements

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate elements
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;

    }
}
