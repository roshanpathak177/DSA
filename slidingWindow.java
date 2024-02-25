class slidingWindow {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSum = 0;
        for (int i = 0; i < k; i++) windowSum += cardPoints[i];
             
        int maxSum = windowSum;
        for (int i = k - 1, j = n - 1; i >= 0; i--, j--) {
            windowSum += cardPoints[j] - cardPoints[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }
}