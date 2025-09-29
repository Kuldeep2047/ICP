package Assignment_3;

public class Search_a_2D_Matrix {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 10;
        System.out.println(answer(matrix, target));
    }
    
    public static boolean answer(int[][] arr ,int target){
        
        int r =0;
        int c = arr[0].length-1;
        while(r< arr.length && c>=0){
            if(arr[r][c] == target){
                return true;
            }else if(arr[r][c]< target){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}
