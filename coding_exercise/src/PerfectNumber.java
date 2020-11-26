public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int factors = 0;
        for(int i =1; i<number;++i){
            if(number%i == 0){
                factors=factors+i;
                if(factors==number){
                   return true;
                }
            }
        }
       return false;
    }
}
