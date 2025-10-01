package Day5;

import java.util.Arrays;
import java.util.Comparator;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(Minimum_Number_of_Arrows(points));
    }

    public static int Minimum_Number_of_Arrows(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        
        int arrow =1;
        int first_end = arr[0][1];

        for(int i=1 ;i< arr.length ;i++){
            int second_first = arr[i][0];
            if(first_end < second_first){
                arrow++;
                first_end = arr[i][1];
            }
        }
        return arrow;
    }
    
}
