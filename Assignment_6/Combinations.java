package Assignment_6;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {

        int  n= 4;
        int  k=3;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        int start =1;
        combinators(ans, ll, n, k, start);
        System.out.println(ans);
        
    }

    public static void combinators(List<List<Integer>> ans, List<Integer> ll, int n, int k, int start){
        if(k == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i = start ;i<=n ;i++){
            ll.add(i);
            combinators(ans, ll, n, k-1, i+1);

            ll.remove(ll.size()-1);
        }
    }
}
