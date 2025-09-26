package Assignment_1;

import java.util.Arrays;
import java.util.Comparator;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args){
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(answer(points));
    }
 
    public static int answer(int[][] points){
        Arrays.sort(points,Comparator.comparingInt(arr->arr[1]));
        
        int c=1;
        int pre = points[0][1];
        for(int i=1;i<points.length;i++){
            int ele = points[i][0];
            if(ele>pre){
                c++;
                pre = points[i][1];
            }
            
        }
        return c;

    }
}
