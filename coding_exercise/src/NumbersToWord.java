public class NumbersToWord {
    public static void main(String[] args) {
        numberToWords(500);

//        System.out.println("count"+getDigitCount(5244));
    }
    public static void numberToWords(int num){
        int number = reverse(num);
        int count = getDigitCount(num)-getDigitCount(number);


        if(number<0){
            System.out.println("Invalid Value");
        }

        while (true){
             int lastDigit = number % 10;


             switch (lastDigit) {
                 case 0:
                     System.out.println("Zero");
                     break;
                 case 1:
                     System.out.println("One");
                     break;
                 case 2:
                     System.out.println("Two");
                     break;
                 case 3:
                     System.out.println("Three");
                     break;
                 case 4:
                     System.out.println("Four");
                     break;
                 case 5:
                     System.out.println("Five");
                     break;
                 case 6:
                     System.out.println("Six");
                     break;
                 case 7:
                     System.out.println("Seven");
                     break;
                 case 8:
                     System.out.println("Eight");
                     break;
                 case 9:
                     System.out.println("Nine");
                     break;

             }
             number /= 10;
             if (number == 0) {
                 break;
             }

        }   while(count>0){
            System.out.println("Zero");
            count--;

        }

    }

    public static int reverse(int number){
        int reverseNum = 0;
       if(number==0){
           return 0;
       }
        while (number!=0){
            int lastDigit = number%10;
            reverseNum *= 10;
            reverseNum += lastDigit;
            number /= 10;
            if(number==0){

                    return reverseNum;
            }
        }
        return -1;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count = 0;
        while (true){
            int lastDigit = number%10;
            count++;
            number /= 10;
            if(number==0){
                break;
            }
        }
        return count;
    }
}
