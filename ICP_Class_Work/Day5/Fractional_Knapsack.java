package Day5;

import java.util.Arrays;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;
        System.out.println(fractionalKnapsack(val, wt, capacity));
    }    

    public static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = wt.length;
        int[][] item = new int[n][2];
        for(int i=0;i<n;i++){
            item[i][0] = wt[i];
            item[i][1] = val[i];
        }
        Arrays.sort(item , (a,b)-> Double.compare(
            (double)b[1]/b[0],
            (double)a[1]/a[0]
            ));
            
        int currCap = 0;
        double ans =0;
        int i=0;
        while(i<n && currCap<capacity){
            if(currCap + item[i][0] <= capacity){
                currCap += item[i][0];
                ans+= item[i][1];
            }else{
                int remain = capacity - currCap;
                ans += (double)item[i][1] * ((double)remain / item[i][0]);
                currCap = capacity;
            }
            i++;
        }
        return ans;
    }
}

//==>  https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
