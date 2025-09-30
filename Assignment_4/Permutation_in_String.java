package Assignment_4;

public class Permutation_in_String {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(Anagrams(s2,s1));
    }
    public static boolean Anagrams(String s , String p){
        int[] arr = new int[26];
        int m = p.length();
        int n = s.length();
        
        for(int i=0;i<m;i++){
            arr[p.charAt(i)-'a']++;
        }
        int si =0;
        int ei =0;
        while(ei<n){
            arr[s.charAt(ei)-'a']--;

            while(ei-si+1 == m && si<n){
                if(isZero(arr)){
                    
                    return true;
                }
                arr[s.charAt(si)-'a']++;
                si++;
            }

            ei++;

        }
        return false;

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
