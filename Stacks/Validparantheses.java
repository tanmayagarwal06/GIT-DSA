package Stacks;

import java.util.Stack;

public class Validparantheses {
    public boolean isValid(String s){
        Stack<Character> input = new Stack<>();
            for(char chars : s.toCharArray()){
                if (chars == '[' || chars == '{' || chars == '(') {
                    input.push(chars);
                    
                }
                else{
                    if (input.isEmpty()) {
                        return false;
                    }
                    char top = input.pop();
                    if (chars == ']' && top != '[' || chars == '}' && top != '{' || chars == ')' && top != '(') {
                        return false;
                        
                    }
                }
            }
            return input.isEmpty();
        }
    }

