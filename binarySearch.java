class BinarySearch {
    public int search(int[] nums, int target) {
        int s=0;
        int e= nums.length -1;
        return binSearch(nums, s, e, target);
    }
    public int binSearch(int[] nums, int s, int e, int target){
        int mid;
        if(e >= s){
            mid =(e+s)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                return binSearch(nums, mid+1, e, target);
            } 
            else{
                return binSearch(nums, s, mid-1, target);
            }
        }
        return -1;
    }
}