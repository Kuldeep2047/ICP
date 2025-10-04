package Assignment_7;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int[] dp = new int[nums.length];
        Arrays.fill(dp ,-1);
        System.out.println(Max_Rob(nums, 0, dp));

    }

    public static int Max_Rob(int[] arr, int idx, int[] dp){
        if(idx >= arr.length){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int not_rob = Max_Rob(arr, idx +1, dp);
        int rob = arr[idx] + Max_Rob(arr, idx +2, dp);
        return dp[idx] = Math.max(not_rob, rob);
    }
}
