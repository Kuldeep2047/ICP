package Assignment_2;

public class Valid_Perfect_Square {
    
    public static void main(String[] args){
        int num =16;
        System.out.println(answer(num));
    }
    public static boolean answer(int n){
        int low =1;
        int high = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            long square = (long)mid*mid;

            if(square == n){
                return true;
            }else if(square<n){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}
