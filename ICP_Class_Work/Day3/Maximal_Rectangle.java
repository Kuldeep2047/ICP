package Day3;

import java.util.Stack;

public class Maximal_Rectangle {
    public static void main(String[] args){
        char[][] matrix = {
                        {'1','0','1','0','0'},
                        {'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'}};

        int ans = 0;
        int[] count = new int[matrix[0].length];
        for(int i = 0 ;i<matrix.length ;i++){
            for(int j=0;j<matrix[0].length ;j++){
                if(matrix[i][j] == '0'){
                    count[j] = 0;
                }else{
                    count[j]++;
                }
            }
            ans = Math.max(ans, Largest_Histogram(count));
        }
        System.out.println(ans);
    }

    public static int Largest_Histogram(int[] arr){
        int n = arr.length;
        int ans =0;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            while( !st.isEmpty() && arr[i]<arr[st.peek()]){
                int h = arr[st.pop()];
                int r = i;
                if(st.isEmpty()){
                    ans = Math.max(ans , h*r);
                }else{
                    int l = st.peek();
                    ans = Math.max(ans, h*(r-l-1));
                }

            }
            st.push(i);
        }
        int r = n;
        while(!st.isEmpty()){
          int h = arr[st.pop()];
        if(st.isEmpty()){
            ans = Math.max(ans , h*r);
        }else{
            int l = st.peek();
            ans = Math.max(ans, h*(r-l-1));
        }  
        }
        return ans;
    }
}
