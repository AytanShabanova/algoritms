package stackexample;

import java.util.Stack;

public class StackExample {
     boolean  isOpen(Character character){
        return character=='{' || character=='[' || character=='(';
    }
    boolean isPair(Character open,Character close){
        return open=='{' && close=='}' || open=='[' && close==']' || open=='(' && close==')';}

    public  Boolean stackMethod(String  s){
        Stack<Character>st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (isOpen(currentChar)){
                st.push(currentChar);
            }else if (! st.empty() && isPair(st.peek(),currentChar)){
                st.pop();

            }else {
                return false;
            }
        }
        return st.isEmpty(); //if stack empty return true else return false
    }






}
