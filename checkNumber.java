public class checkNumber {
    public static void main(String[] args) {

        PosOrNega(5);
        printMegaAndKilo(2500);
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("isLeapYear? "+isLeapYear(-1600));
        System.out.println("Equal? "+areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println("Equal sum? "+hasEqualSum(1, -1, 0));
        System.out.println("Circle area: "+area(-1.0));
        System.out.println("Triangle area: "+area(5.0,4.0));
        printYearsAndDays(561600);
        isCatPlaying(true,10);
    }

    public static void PosOrNega(int number) {
        if (number > 0)
            System.out.println("The number " + number + " is positive");
        else if (number < 0)
            System.out.println("The number " + number + " is negative");
        else
            System.out.println("The number " + number + " is zero");
    }

    public static void printMegaAndKilo(int kiloBytes) {
        int megaBytes;
        float kilo;
        if (kiloBytes > 0) {
            megaBytes = kiloBytes / 1024;
            kilo = kiloBytes % 1024;
            System.out.println(+kiloBytes + "KB = " + megaBytes + " MB and " + kilo + " KB");
        } else
            System.out.println("Invalid Value");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean goodhour=true;
        if (hourOfDay < 0 || hourOfDay < 23)
            goodhour = false;
        else {
            if (hourOfDay > 8 || hourOfDay < 22)
                goodhour = true;
            else
                goodhour = false;
        }

        if (goodhour == true && barking == true)
            return true;
        else
            return false;


    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true; // It's a leap year
            } else {
                return false; // It's not a leap year
            }
        } else {
            return false; // Year is not in the valid range
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int intnum1= (int) (num1*1000);
        int intnum2= (int) (num2*1000);
        if (intnum1==intnum2)
            return true;
        else
             return false;
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        int sum=num1+num2;
        if (sum==num3)
            return true;
        else
            return false;
    }

    public static double area(double radius){
        if (radius <0)
            return -1.0;
        else
            return radius*radius*Math.PI;
    }

    public static double area(double x, double y){
        if (x<0 || y<0)
            return -1.0;
        else
            return x*y;
    }

    public static void printYearsAndDays(long minutes){
        int years;
        int days;
        int originalminutes;
        int originalmin2;
        if (minutes<0)
            System.out.println("Invalid Value");
        else {
            years =(int) (minutes / (365 * 24 * 60));
            originalminutes =(int) (minutes % (365 * 24 * 60));
            days =(int) (originalminutes / (60*24));
            originalmin2= (int) (originalminutes % 60);
            System.out.println(years + " Years and " + days + " Days and " + originalmin2 + " Minutes");
        }
    }

    public static void isCatPlaying(boolean summer, int temperature) {
        if (summer==true) {
            if (temperature >= 25 && temperature <= 45)
                System.out.println("The cat is playing");
            else
                System.out.println("The cat is not playing");
        }
        else {
            if (temperature >= 25 && temperature <= 35)
                System.out.println("The cat is playing");
            else
                System.out.println("The cat is not playing");
        }
    }

}