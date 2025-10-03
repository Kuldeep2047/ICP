package Day6;

import java.util.ArrayList;
import java.util.Arrays;

public class Job_Sequencing_Problem {
    public static void main(String[] args) {
        int[] deadline = {2, 1, 2, 1, 1};
        int[] profit = {100, 19, 27, 25, 15};

        ArrayList<Integer> ans = jobSequencing(deadline, profit);
        System.out.println(ans);
    }
    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = deadline.length;

        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }
        
        Arrays.sort(jobs , (a,b) -> b[1]-a[1]);
        int max =0;
        for(int i=0;i<n;i++){
            max=Math.max(max,jobs[i][0]);
        }
        
        boolean arr[]= new boolean[max+1];
        int c=0,p=0;
        for(int[] j:jobs){
            int dl=j[0];
            int pp=j[1];
            for(int i=dl;i>0;i--){
                if(!arr[i]){
                    arr[i]=true;
                    c++;
                    p=p+pp;
                    break;
                }
            }
        }
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(c);
        ll.add(p);
        return ll;
    }
}
