package Hashmap;

import java.util.HashSet;

public class DeleteRepetation {
    public static String uniqueChar(String str){

        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
                
            }
        }

        return result.toString();
    }     
    
}
