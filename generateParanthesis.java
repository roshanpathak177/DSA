class generateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        int open = n;
        int close = n;
        String OP = "";
        solve(open, close, OP, res);
        return res;
    }
    public void solve(int a, int b, String s, List<String> res){
        if( a==0 && b==0){
            res.add(s);
            return;
        }
        if( a != 0){
            StringBuilder sb = new StringBuilder(s);
            sb.append("(");
            String st = sb.toString();
            solve(a -1, b, st, res);
        }
        if( b > a){
            StringBuilder sb2 = new StringBuilder(s);
            sb2.append(")");
            String st2 = sb2.toString();
            solve(a, b-1, st2, res);
        }
        return;
    }
}