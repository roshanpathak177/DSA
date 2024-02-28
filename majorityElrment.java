class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mpp = new HashMap<>();

        for(int num: nums){
            mpp.put(num, mpp.getOrDefault(num, 0)+1);
        }

        for(int num: mpp.keySet()){
            if (mpp.get(num)> n/2){
                return num;
            }
        }

        return -1;
    }
}