package Assignment_4;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k =1;
        System.out.println(Repeating_Character_Replacement(s,k));
    }

    public static int Repeating_Character_Replacement(String s ,int k){
        int n = s.length();
        int si =0, ei=0;
        int ans =0;
        int maxf = 0 ;  //ye maximum frequency store karega
        int[] freq = new int[26];

        while(ei<n){
            freq[s.charAt(ei)-'A']++;
            maxf = Math.max(maxf, freq[s.charAt(ei)-'A']);

            // while(substring len - maxf > k) -> trim the window size
            //  no. of flip operation  = substring len - maxf
            while((ei-si+1) - maxf >k){
                freq[s.charAt(si)-'A']--;
                maxf =0;
                for(int i=0;i<26;i++){
                    maxf = Math.max(maxf, freq[i]);
                }
                si++;

            }

            if((ei-si+1)- maxf <= k){
                ans = Math.max(ans, ei-si+1);
            }
            ei++;
        }
        return ans;
    }
}
