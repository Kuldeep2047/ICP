package Day3;

public class two_D_Array {
    
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    
            //row wise traversal
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // columnWise(arr);
        // diagonalWise(arr);
        reverseOrder(arr);
        spiral(arr);
    }

    public static void columnWise(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void diagonalWise(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j || i+j ==arr.length-1){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void reverseOrder(int[][] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[0].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void ZigZag(int[][] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j = arr[0].length ;j>=0 ;j--){
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println(" ");
        }
        
    }

    public static void spiral(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int te = n*m;
        int minr = 0 , maxc = m-1;
        int maxr = n-1, minc =0;
        int c =0;
        while(te>0){
            for(int i= minc ;i<=maxc && c != te ;i++){
                System.out.print(arr[minr][i]+" ");
                c++;
            }
            minr++;

            for(int i = minr ;i<=maxr && c != te;i++){
                System.out.print(arr[i][maxc]+" ");
                c++;
            }
            maxc--;

            for(int i = maxc ;i>=minc && c != te ;i--){
                System.out.print(arr[maxr][i]+" ");
                c++;
            }
            maxr--;

            for(int i = maxr ;i>=minr && c != te ;i--){
                System.out.print(arr[i][minc]+" ");
                c++;
            }
            minc++;
        }


    }

    
    
}
