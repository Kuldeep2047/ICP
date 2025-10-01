package Assignment_5;

import java.util. *;

public class Queue_Reconstruction_by_Height {
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] ans = Queue_Reconstruction(people);

        for(int i = 0; i< ans.length ;i++){
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
    }
    public static int[][] Queue_Reconstruction(int[][] arr){
        int n = arr.length;

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1]; // smaller k first
                } else {
                    return b[0] - a[0]; // taller person first
                }
            }
        });

        List<int[]> ordered = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int[] p = arr[i];
            ordered.add(p[1], p);     // insert person at index  k
        }
        int[][] ll = new int[n][2];
        for (int i = 0; i < n; i++) {
            ll[i] = ordered.get(i);
        }
        return ll;

    }
}
