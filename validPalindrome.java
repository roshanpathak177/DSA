class ValidPalindrome {
    public boolean validPalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        char[] word = s.toCharArray();
        int left = 0;
        int right = word.length - 1;

        while (left < right) {
            if (word[left] != word[right]) {
                return (isPalindrome(word, left + 1, right)) || (isPalindrome(word, left, right - 1));
            }
            
            // Move the pointers towards each other
            left++;
            right--;
        }
        
        // If the entire string is a palindrome
        return true;

    }

    private boolean isPalindrome(char[] word, int start, int end) {
        while (start < end) {
            if (word[start] != word[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}