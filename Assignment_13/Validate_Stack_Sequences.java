package Assignment_13;

import java.util.Stack;

public class Validate_Stack_Sequences {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        System.err.println(answer(pushed, popped));;
    }

    public static boolean answer(int[] pushed,int[] popped){
        
        int j=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
