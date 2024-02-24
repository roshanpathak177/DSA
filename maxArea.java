class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
        
        //my code
        // int j = height.length;
        // int[] areaStore = new int[j];
        // int start = 0;
        // int end = height.length -1;
        // while(start < end){
        //     int pos = 0;
        //     areaStore[pos++] = calcArea(height[start], height[end]);
        //     start++;
        //     end--;
        // }
        // return findMax(areaStore);

    }
    // //public static int findMax(int[] array) {
    //     if (array == null || array.length == 0) {
    //         throw new IllegalArgumentException("Array is empty or null");
    //     }
        
    //     int max = array[0]; // Initialize max with the first element
        
    //     for (int i = 1; i < array.length; i++) {
    //         if (array[i] > max) {
    //             max = array[i]; // Update max if a larger element is found
    //         }
    //     }
        
    //     return max;
    // //}

    // //public int calcArea(int start, int end){
    //     int indexDiff = Math.abs(end - start);
    //     int minValue = Math.min(start, end);
    //     return indexDiff * minValue;
    // //}
}