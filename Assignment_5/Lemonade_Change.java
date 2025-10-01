package Assignment_5;

public class Lemonade_Change {
    public static void main(String[] args) {
        
        int[] bills = {5,5,5,10,20};
        System.out.println(LemonadeChange(bills));
    }
    public static boolean LemonadeChange(int[] arr){
        int n = arr.length;
        int five =0;
        int ten =0;
        for(int i = 0;i<n ;i++){
            if(arr[i] == 5){
                five++;
            }
            else if(arr[i] == 10){
                if(five > 0){
                    five --;
                    ten++;
                }else{
                    return false;
                }
            }
            else if(arr[i] == 20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five >=3){
                    five -= 3;

                }else{
                    return false;
                }
            }
        }
        return true;

    }
}
