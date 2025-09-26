package Assignment_1;

import java.util.*;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array{
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] arr = {-1,-1};
        arr[0]= first_search(nums,target);
        arr[1]= last_search(nums,target);
        System.out.println(Arrays.toString(arr));

    }
    public static int first_search(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        int first=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return first;
    }
    public static int last_search(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        int sec=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                sec=mid;
                start=mid+1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return sec;
    }
}