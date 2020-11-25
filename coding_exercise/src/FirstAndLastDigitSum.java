public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int num = number;
        while(true){

            int lastDigit = number%10;
            int digit = num%10;

            if(num<10){
                digit += lastDigit;
                return digit;
            }
            num /= 10;

        }

    }
}
