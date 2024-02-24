class TwoSum {
    // public int[] twoSum(int[] nums, int target) {
        
    //     int n = nums.length;
    //     int left = 0;
    //     int right = n - 1;
    //     while(left < right){
    //         int sum = nums[left] + nums[right];
    //         if (sum == target) {
    //             return new int[]{left, right};
    //         } else if (sum < target) left++;
    //         else right--;
    //     }
    //     return new int[]{-1,-1};
    // }
    public int[] twoSum(int[] nums, int target) {
    // Create a copy of the original array to avoid modifying it
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
     // Sort the array
        Arrays.sort(sortedNums);
    
        int left = 0;
        int right = sortedNums.length - 1;
    
        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum == target) {
            // Find the indices of the two numbers in the original array
                int index1 = indexOf(nums, sortedNums[left]);
                int index2 = indexOf(nums, sortedNums[right], index1); // Ensure index2 is different from index1
                return new int[]{Math.min(index1, index2), Math.max(index1, index2)};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // If no solution is found
    }
    
    

 // Helper method to find the index of a number in the array
    private int indexOf(int[] nums, int target, int excludeIndex) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && i != excludeIndex) {
                return i;
            }
        }
        return -1; // If the number is not found
    }

 // Overloaded helper method without excludeIndex parameter
    private int indexOf(int[] nums, int target) {
        return indexOf(nums, target, -1);
    }
}
