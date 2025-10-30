import java.util.Scanner;

public class Recursive_Queries {

    static final int MAX = 1000000;
    static int[] g = new int[MAX + 1];
    static int[][] p = new int[10][MAX + 1];

    public static void main(String[] args){
        preprocess();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(q-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            sb.append(p[k][r] - p[k][l - 1]).append("\n");
        }

        System.out.print(sb);
    }
    
    public static void preprocess(){
        for (int i = 1; i <= MAX; i++) {
            g[i] = findG(i);
            for (int k = 1; k <= 9; k++) {
                p[k][i] = p[k][i - 1] + (g[i] == k ? 1 : 0);
            }
        }
    }

    
    public static int findG(int x){
        if (x < 10) return x;
        int product = 1;
        while (x > 0) {
            int d = x % 10;
            if (d != 0) product *= d;
            x /= 10;
        }
        return findG(product);
    }

    
}
