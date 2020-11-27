import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average =0;
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                double sums = sum;
                double counts = count;
                average =  (sums/counts);

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = "+sum+" AVG = "+Math.round(average));
        scanner.close();
    }

}
