public class FirstClass {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
        System.out.println("Total number of prime numbers between 10 and 50 is " + count);
        SumNumbers();

        displayHighScorePosition("Tim",2);
        int highScore = calculateHighScorePosition(-1000);
        System.out.println("Players score: "+ highScore);
    }

    public static boolean isPrime(int num) {

        if (num <= 2)
            return (num == 2);
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void SumNumbers() {
        int count = 0;
        int sum=0;
        for (int i = 1; i <= 10000; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("The write number" + i);
                sum=sum+i;
                count++;
            }
            if(count==5)
                break;
        }

        System.out.println("the sum: "+sum);
    }

    public static void displayHighScorePosition(String playername, int position){
        System.out.println(playername+" managed to get into position " +position+ " on the high score list");
    }

    public static int calculateHighScorePosition(int playerscore){
        if (playerscore >= 1000)
            return 1;
        else if (playerscore >= 500 && playerscore < 1000)
            return 2;
        else if (playerscore >= 100 && playerscore < 500)
            return 3;
        else
            return 4;
    }

}