package Assignment_13;

import java.util.Stack;

public class Remove_K_Digits {
    public static void main(String[] args) {
        String num = "1432219";
        int k =3;
        System.out.println(removeKdigits(num, k));
    }
    public static String removeKdigits(String num, int k) {
        return remove_digits(num, k);
    }
    public static String remove_digits(String num, int k){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length() ;i++){
            char ch = num.charAt(i);

            while(!st.isEmpty() && k>0 && (ch-'0' < st.peek()-'0')){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();

    }
}
