package Day2;

public class Higher_Bound {
    public static void main(String[] args){
        int[] arr = {1,2,4,4,4,7,9};
        int item = 7;

        int low =0;
        int high = arr.length-1 ;

        while(low< high){
            int mid  = (low+high)/2;
            if(arr[mid]<=item){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        System.out.println(low);

    }
}
