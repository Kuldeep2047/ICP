import java.util.Scanner;

public class Binary_String_Minimizing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            String s = sc.next();
            sb.append(answer(n, k, s)).append('\n');
        }

        System.out.print(sb);
    }
    
    public static String answer(int n, long k, String s) {
        char[] a = s.toCharArray();
        int zeros = 0;

        for(int i = 0; i < n; i++){
            if (a[i] == '0'){
                long move = Math.min(k, i - zeros);
                k -= move;
                int pos = (int)(i - move);

                a[i] = '1';
                a[pos] = '0';

                zeros++;
            }
        }

        return new String(a);
    }

    
    
}
