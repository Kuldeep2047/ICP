package Assignment_5;

import java.util.Arrays;
import java.util.Comparator;

public class Non_overlapping_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(non_Overlapping(intervals));
    }
    
    public static int non_Overlapping(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr , Comparator.comparingInt(a -> a[1]));
        int c=0;

        int first_end = arr[0][1];
        for(int i =1; i<n;i++){
            int sec_start = arr[i][0];
            if(sec_start < first_end){
                c++;
            }else{
                first_end = arr[i][1];
            }
        }
        return c;
    }
}
