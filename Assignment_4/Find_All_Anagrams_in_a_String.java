package Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = Anagrams(s, p);
        System.out.println(ans);
    }

    public static List<Integer> Anagrams(String s , String p){
        int[] arr = new int[26];
        int m = p.length();
        int n = s.length();
        List<Integer> ll = new ArrayList<>();
        for(int i=0;i<m;i++){
            arr[p.charAt(i)-'a']++;
        }
        int si =0;
        int ei =0;
        while(ei<n){
            arr[s.charAt(ei)-'a']--;

            while(ei-si+1 == m && si<n){
                if(isZero(arr)){
                    ll.add(si);
                }
                arr[s.charAt(si)-'a']++;
                si++;
            }

            ei++;

        }
        return ll;

    }

    public static boolean isZero(int[] arr){
        for(int a:arr){
            if(a != 0){
                return false;
            }
        }
        return true;
    }
}
