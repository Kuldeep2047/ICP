package Assignment_4;

public class Max_Consecutive_Ones_III {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        System.out.println(Consecutive_Ones_III(nums, k));
    }

    public static int Consecutive_Ones_III(int[] arr ,int k){
        int n = arr.length;
        int si =0;
        int ei =0;
        int ans =0;
        int c=0;

        while(ei<n){
            if(arr[ei]==0){
                c++;
            }
            while(c>k && si<=ei){
                if(arr[si] == 0){
                    c--;
                    
                }
                si++;
            }

            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}
