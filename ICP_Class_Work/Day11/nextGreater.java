package Day11;

import java.util.*;

public class nextGreater {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2};
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;

        int[] nge = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            
            if(stack.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = arr[stack.peek()];
            }

            
            stack.push(i);
        }

        
        System.out.println(Arrays.toString(nge));
    }
}
