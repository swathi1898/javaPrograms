public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(54));

    }
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        while(true){
            int digits = number%10;
            if(digits%2 == 0) {
                sum += digits;
            }
            number /= 10;
            if(number==0){
                break;
            }
        }return sum;

    }

}
