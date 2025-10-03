package Day6;

public class Sum_of_Array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3};
        System.out.println(answer(arr ,0));
    }
    public static int answer(int[] arr ,int i){
        
        if(i>= arr.length){
            return 0;
        }
        int a = answer(arr, i+1);
        return arr[i] + a;
    }
}
