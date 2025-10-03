package Assignment_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {
    public static void main(String[] args) {
        
        int[] candidates = {10,1,2,7,6,1,5};
        int target =8;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        Arrays.sort(candidates);
        int start =0;
        Combination(ans, ll, candidates, target, start);
        System.out.println(ans);
    }

    public static void Combination(List<List<Integer>> ans, List<Integer> ll, int[] candidates, int amount, int start){
        if(amount == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i= start ;i<candidates.length ;i++){
            if(i > start && candidates[i] == candidates[i - 1]) continue;

            if(amount>= candidates[i]){
                ll.add(candidates[i]);
                Combination(ans, ll, candidates, amount - candidates[i], i+1);

                ll.remove(ll.size()-1);
            }
        }
    }
}
