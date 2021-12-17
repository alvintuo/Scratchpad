package Dec2021Competition;
import java.util.Scanner;

public class Fives {

    public Fives() {}

    public int Compute() {
        boolean stop = false;
        int total = 0;
        System.out.println("Dice Rolls: ");
        for (int i = 1; i < 4; i++) {
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 5) stop = true;
            if (!stop) {
                total += input;
            }

        }

        return total;

    }
}
