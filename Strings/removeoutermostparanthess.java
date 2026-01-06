package Strings;

class removeoutermostparanthess{
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    ans.append(ch);   // not outermost
                }
                depth++;
            } else { // ')'
                depth--;
                if (depth > 0) {
                    ans.append(ch);   // not outermost
                }
            }
        }
        return ans.toString();
    }
}
