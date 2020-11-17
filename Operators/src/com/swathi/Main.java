package com.swathi;

public class Main {

    public static void main(String[] args) {
	int result = 1+2;
        System.out.println("1+2 = "+result);
    int prevresult = result -1;
        System.out.println("3-1 = "+prevresult);
    result = (2 * 2) + (10/5);

        System.out.println("(2*2)+(10/5) = "+result);


        boolean isDone = true;
        if (isDone == true)
            System.out.println("its done=======>");
        else
            System.out.println("its not done");

        int mark = 80;
        if(mark != 100)
            System.out.println("not 100");
        if(mark > 30)
            System.out.println("pass");
        if(mark<100 && mark >= 80)
            System.out.println("mark lesser than 100 AND mark is greater than or equal to 80");

        boolean wasDone = isDone? true : false;
        if (wasDone)
            System.out.println("wasDone is true");
        isDone = false;
        wasDone = isDone? true : false;
        if (wasDone==false)
            System.out.println("wasDone is false");
        // == equal
        // != not equal
        // > greater than
        // >= greater than or equal
        // < lesser than
        // <= lesser than or equal
        // && AND
        double firstValue = 20;
        double secondValue = 80;
        double totalValue = (firstValue + secondValue)*25;
        double finalValue = totalValue % 40;
        
        if(finalValue<=20)
            System.out.println("this value is over limit");


    }


}
