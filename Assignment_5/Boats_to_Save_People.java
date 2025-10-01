package Assignment_5;

import java.util.Arrays;

public class Boats_to_Save_People {
    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;
        System.out.println(numberOfBoats(people, limit));
    }
    public static int numberOfBoats(int[] arr , int limit){

        Arrays.sort(arr);
        int boat =0;
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            if(arr[l] + arr[r] <= limit){
                boat++;
                l++;
                r--;
            }else{
                boat++;
                r--;
            }
        }
        return boat;

    }
}
