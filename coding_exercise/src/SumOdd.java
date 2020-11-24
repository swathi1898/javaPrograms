public class SumOdd {
    public static void main(String[] args) {
        sumOdd(1,5);
    }
    public static boolean isOdd(int number){
        if(number>0){
            if(number%2 == 0){
                return false;
            }else {
                return true;
            }
        }return false;
    }
    public static int sumOdd(int start, int end){
        for(int i=start; i<=end;i++){
            if(isOdd(i)){
                if(end>=start && (start>0) &&(end>0)){

                }return -1;
                }
            }
        return -1;

    }
}
