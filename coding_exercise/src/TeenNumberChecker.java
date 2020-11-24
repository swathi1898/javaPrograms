public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(22,40,34));

    }
    public static boolean hasTeen(int teenOne, int teenTwo, int teenThree){
        if((teenOne>=13 && teenOne<=19)||(teenTwo>=13 && teenTwo<=19)||(teenThree>=13 && teenThree<=19)){
            return true;
        }return false;
    }

    public static boolean isTeen(int teen){
        if(teen>=13 && teen<=19){
            return true;
        }
            return false;

    }
}
