class TortoiseAndHare {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
    
    // Move slow and fast pointers until they meet
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
    
    // Reset one pointer to the start and move both pointers until they meet again
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
    
        // Return the duplicate number
        return slow;
    }
}