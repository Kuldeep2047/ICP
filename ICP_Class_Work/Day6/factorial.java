package Day6;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fn = fact(n-1);
        return n*fn;
    }
}
