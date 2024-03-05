class ReverseString {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack();
        String[] words = s.split(" ");
        int n = words.length;
        for(int i = n -1; i >= 0; i--){
            if(!words[i].isEmpty()){
                stack.push(words[i]);
            }
        }
        return String.join(" ", stack);
    }
}