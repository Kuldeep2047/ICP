package Day3;

public class oneD_to_twoD {
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int c =3;
        int r = 3;
        int idx =0;
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = arr[idx++];
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
