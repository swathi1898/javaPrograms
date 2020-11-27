public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));

    }
    public static int getLargestPrime(int number){
        if(number==1||number<=0){
            return -1;
        }
        while (number % 2 == 0)
        {
            if(number==2){
                break;
            }
            number = number / 2;
            // remove all the multiples of 2
        }
        while (number % 3 == 0)
        {
            if(number==3){
                break;

            }
            number = number / 3;

        }

        // remove multiples of prime numbers other than 2 and 3
        while (number >= 5)
        {
            boolean isDivisionComplete = true;
            for (int i = 5; i < Math.ceil(Math.sqrt(number)); i++)
            {
                if (number % i == 0)
                {
                    number = number / i;
                    isDivisionComplete = false;
                    break;
                }
            }
            if (isDivisionComplete)
            {
                break;
            }
        }

        return number;

    }




//        if(number == 1 || number<=0 ){
//            return -1;
//        }
//        boolean isPrime = true;
//            for(int i =2 ; i<= number/2; ++i){
//                if(number%i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                return 1000;
//            }else{
//                return -1;
//            }


}
