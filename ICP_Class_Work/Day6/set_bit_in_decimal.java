package Day6;

public class set_bit_in_decimal {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun(n));
    }

    public static int fun(int n){
        if(n == 0){
            return 0;
        }

        if(n % 2 ==0){
            return fun(n/2);
        }else{
            return 1 + fun(n/2);
        }
    }
}
