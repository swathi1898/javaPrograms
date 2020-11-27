public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(1,0,6));

    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        bigCount *= 5;
        int total = bigCount+smallCount;
       if(bigCount<0 || smallCount<0 ||goal<0){
           return false;
       }
       if(goal>total){
           return false;
        }
       if((goal%5 >smallCount)){
           return false;
       }
       return true;
    }
}
