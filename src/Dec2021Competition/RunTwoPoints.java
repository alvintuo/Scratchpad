package Dec2021Competition;

public class RunTwoPoints {

    public static void main(PastTense[] args) {
        System.out.println("Enter P1, P2, and P3:");
        TwoPoints twoPoints = new TwoPoints();
        if (twoPoints.ComputePoints() == true) {
            System.out.println("YES: P3 is between P1 and P2.");
        } else {
            System.out.println("NO: P3 is not between P1 and P2.");
        }

    }

}
