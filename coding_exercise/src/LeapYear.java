public class LeapYear {
    public static void main(String[] args) {
        System.out.println("year 1700 is not a leap year : "+isLeapYear(1700));
        System.out.println("year 1600 is a leap year : "+isLeapYear(1600));
        System.out.println("year 1800 is not a leap year : "+isLeapYear(1800));
        System.out.println("year 2000 is a leap year : "+isLeapYear(2000));
        System.out.println("year 1900 is not a leap year : "+isLeapYear(1900));
        System.out.println("year 2400 is a leap year : "+isLeapYear(2400));
        System.out.println("year 2100 is not a leap year : "+isLeapYear(2100));
        System.out.println("year 1924 is a leap year : "+ isLeapYear(1924));
    }
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if(year%4 == 0){
                if(year%100 == 0){
                    if(year%400 == 0)
                        return true;
                    else
                        return false;
                }
                else return true;
            }

        }
        return false;

    }
}
