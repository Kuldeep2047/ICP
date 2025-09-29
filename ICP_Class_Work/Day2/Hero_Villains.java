package Day2;

import java.util.Scanner;

public class Hero_Villains {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int h = sc.nextInt();
        int[] villain = new int[n];
        int tvillain =0;
        int theroes = m*h;

        for(int i=0;i<n;i++){
            villain[i] = sc.nextInt();
            tvillain += villain[i];
        }
        if(theroes < tvillain){
            int sum =0; //sum of strength of villains from back
            for(int i=villain.length ; i>=0;i--){
                sum += villain[i];
                if(sum >= theroes){
                    System.out.println(i);
                    return;
                }
            }

        }else{
            System.out.println(0);
        }



    }
}
