package Day11;

import java.util.Stack;

public class Reverse_Using_Stack {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            st.push(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        while( !st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
}
