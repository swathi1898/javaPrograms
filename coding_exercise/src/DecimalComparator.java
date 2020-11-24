public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1234,3.1235));
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if((int)(num1 *1000)==(int)(num2 *1000)){
            return true;
        }return false;
    }
}
