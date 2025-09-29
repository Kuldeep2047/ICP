package Day2;
import java.util.*;
public class Lower_Bound {
    
    public static void main(String[] args){
        int[] arr = {1,2,4,4,4,7,9};
        int item = 4;

        int low =0;
        int high = arr.length-1 ;
        
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>=item){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        System.out.println(low);
    }


}
