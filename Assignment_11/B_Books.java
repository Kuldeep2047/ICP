import java.util.Scanner;

public class B_Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long[] arr = new long[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int ans = maxBooks(arr, t);
        System.out.println(ans);
    }

    //ye find karega max book jo given time me read hongi
    public static int maxBooks(long[] a, long t) {
        int left = 0;
        int maxCount = 0;
        long sum = 0;

        for(int right = 0; right < a.length; right++){
            sum += a[right];

            while (sum > t) {
                sum -= a[left];
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
        }

        // System.out.println(maxCount);
        return maxCount;
    }

    
}
