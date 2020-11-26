public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(isValid(9));
        System.out.println(hasSameLastDigit(11,21,39));
    }
    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree){
        if(isValid(numberOne) && isValid(numberTwo)&& isValid(numberThree)){
            int firstLastDigit = numberOne%10;
            int secondLastDigit = numberTwo%10;
            int thirdLastDigit = numberThree%10;
            if((firstLastDigit==secondLastDigit) || (secondLastDigit==thirdLastDigit) || (thirdLastDigit==firstLastDigit)){
                return true;
            }return false;

        }return false;
    }
    public static boolean isValid(int number){
        if(number>=10 && number<=1000){
            return true;
        }return false;
    }
}
