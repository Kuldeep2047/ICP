package Day7;
public class Palindrome_Using_Recursion {
    public static void main(String[] args) {
        String s = "abbaa";
        System.out.println(isPalindrome(s, 0 ,s.length()-1));
    }
    public static boolean isPalindrome(String s , int i ,int j){
        if(i>j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return isPalindrome(s, i+1 ,j-1);
    }
}
