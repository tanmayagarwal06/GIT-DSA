package Strings;

public class Reversewordsinastring {
    public String reverseWordss(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int n = sb.length();

        for(int i = 0; i <= n ; i++){
            if (i == n || sb.charAt(i) == ' ') {
                reverse(sb, start, i-1);
                start = i + 1;
            }
        }
        return sb.toString();
    }

    private void reverse(StringBuilder sb, int left, int right){
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }

   
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString());
            result.append(" ");
        }

        return result.toString().trim();
    }
}
