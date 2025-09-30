package Day4;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
       String s = "abcabcbb";
       System.out.println(LongestSubstring(s)); 

    }
    
    public static int LongestSubstring(String s){
        int ans =0;

        int si =0;
        int ei =0;
        int[] arr = new int[255];
        while(ei < s.length()){
            while(arr[s.charAt(ei)]>0){
                arr[s.charAt(si)]--;
                si++;
            }
            arr[s.charAt(ei)]++;
            
            ans = Math.max(ans , ei-si+1);
            ei++;
        }
        return ans;
    }
}
