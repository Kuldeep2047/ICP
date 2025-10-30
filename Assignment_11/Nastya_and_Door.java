import java.util.Scanner;

public class Nastya_and_Door {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            answer(sc);
        }
    }

    
    public static void answer(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int[] peaks = new int[n];
        for(int i = 1; i < n - 1; i++){
            if(a[i] > a[i - 1] && a[i] > a[i + 1]){
                 peaks[i] = 1;
            }
        }

        int[] prefix = new int[n];
        prefix[0] = peaks[0];
        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] + peaks[i];

        int max = 0, best = 0;
        for(int l = 0; l + k - 1 < n; l++){
            int r = l + k - 1;
            int cnt = prefix[r - 1] - prefix[l];
            if(cnt > max){
                max = cnt;
                best = l;
            }
        }

        System.out.println((max + 1)+ " " + (best + 1));
    }

    

}
