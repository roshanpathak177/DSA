class BasicCalculator {
    public int calculate(String s) {
        int len = s.length();
        if(s == null || (len == 0)) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char sign = '+';
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if((!Character.isDigit(s.charAt(i)) && ' '!=s.charAt(i)) || i == len-1){
                if(sign == '-') stack.push(-num);
                if(sign == '+') stack.push(num);
                if(sign == '*') stack.push(stack.pop()*num);
                if(sign == '/') {
                    if (num != 0) {
                        int val = stack.pop() / num;
                        stack.push(val);
                    } else {
                        // Handle division by zero
                        // You can choose to throw an exception or return some default value
                        // For example:
                        throw new ArithmeticException("Division by zero");
                        // Or: return 0;
                    }
                }
                sign = c;
                num = 0;
            }
        }

        int result = 0;
        for( int i: stack){
            result += i;
        }
        return result;
    }
}