public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-122));
    }
    public static boolean isPalindrome(int number){
        int num =number;
        int reverse = 0;
        while(num!=0){
            int lastDigit=num%10;
            reverse *=10;
            reverse +=lastDigit;
            num = num/10;
            if(reverse==number){
                return true;
            }
        }
        return false;

    }
}
