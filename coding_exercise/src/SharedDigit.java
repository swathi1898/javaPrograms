public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));

    }
    public static boolean hasSharedDigit(int one,int two){
        if((one>=10 && one<=99)&&(two>=10 && two<=99)){

                int digitOne = one %10;
                int digitTwo = two%10;
                one /=10;
                two /= 10;
                if(digitOne == digitTwo || digitOne == two || digitTwo == one || one == two){
                    return true;
                }


        }return false;
    }
}
