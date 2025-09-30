package Day3;

import java.util.Stack;

public class Help_Classmates {
    
    public static void main(String[] args){
        int[] arr = {3, 8, 5, 2, 25};
        int n = 5;
        int[] ans = help_classmate(arr, n);
        for(int i=0;i<ans.length ;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1 ;i>=0;i--){
            
            while( !st.isEmpty() && arr[i]<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}

//->  https://www.geeksforgeeks.org/problems/help-classmates--141631/1