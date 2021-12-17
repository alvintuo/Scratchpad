package Dec2021Competition;
import java.util.Scanner;

public class TwoPoints {

    public TwoPoints(){}

    public boolean ComputePoints() {

            Scanner pt = new Scanner(System.in);
            int point1 = pt.nextInt();
            int point2 = pt.nextInt();
            int point3 = pt.nextInt();
            int point4 = pt.nextInt();
            int point5 = pt.nextInt();
            int point6 = pt.nextInt();

            double originalslope = (double) (point4 - point2)/(point3 - point1);
            double testforslope = (double) (point6 - point4)/(point5 - point3);
        return originalslope == testforslope;

    }

}
