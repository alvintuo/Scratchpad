package FileTest;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAverage {

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("/Users/alvintuo/Desktop/apcs/APCSDataFile.txt"));
        double total = 0.0;
        int index = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            int newline = Integer.parseInt(line);
            total += newline;
            index++;
        }
        in.close();
        System.out.println("The average is: " + (total/index));
    }
}