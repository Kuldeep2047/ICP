package Day5;

import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection{
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        System.out.println(activitySelection(start, finish));
    }

    public static int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        long[][] arr = new long[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = start[i];
            arr[i][1] = finish[i];
        }
        Arrays.sort(arr , Comparator.comparingLong(a ->a[1]));

        int c =1 ;
        long first_end = arr[0][1];
        for(int i=1;i<arr.length ;i++){
            long second_start = arr[i][0];
            if(second_start > first_end){
                c++;

                first_end = arr[i][1];
            }
            
        } 
        return c;
        
        
    }
}

//==>  https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1