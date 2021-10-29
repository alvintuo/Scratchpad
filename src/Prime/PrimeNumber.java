package Prime;

// import java.util.concurrent.TimeUnit;

public class PrimeNumber {

    static int num = 0;

    public static boolean Prime(int num) {
        // Anything less than or equal to 1 is prime.
        if (num <= 1)
            return false;

        // Check from 2 to num
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) throws InterruptedException {

        while (true) {

            if (Prime(num)) {
                System.out.println("The number " + num + " is prime.");
                // TimeUnit.SECONDS.sleep(1);
                // comment out above line to not print number if not prime
            } else {
                // System.out.println("The number " + num + " is not prime.");
                // TimeUnit.SECONDS.sleep(1);
                // comment out above line to not print number if not prime
            }

            num++;
            // comment out above function to add delay when necessary
        }


    }
}