package Assignment_13;

import java.util.HashMap;
import java.util.Stack;

public class Remove_Duplicate_Letters {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));

    }

    public static String removeDuplicateLetters(String s) {
        return answer(s);
    }
    public static String answer(String s){
        Stack<Character> st = new Stack<>();
        HashMap<Character, Integer> map = new HashMap<>();
        boolean[] visited = new boolean[26];

        //first make a frequency map
        for(int i=0 ;i<s.length() ;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0 ;i< s.length() ;i++){
            char ch = s.charAt(i);

            map.put(ch, map.get(ch)-1);
            if(visited[ch-'a']){
                continue;
            }

                while(!st.isEmpty() && st.peek()>ch && map.get(st.peek())>0){
                    visited[st.peek()-'a']=  false;
                    st.pop();
                    
                }
                st.push(ch);
                visited[ch - 'a'] = true;
            
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);

        return sb.toString();

    }
}
