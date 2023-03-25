import java.util.Scanner;
import java.util.Random;
public class LinearScan_IntTimes {
    public static void main(String[] args) {
        //Declare Variables
        int intValue = 0;
        int intValTimes = 0;
        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        intValue = SafeInput.getRangedInt(in, "Enter an int from ", 1, 100);

        //For Loops
        for (int e = 0; e < dataPoints.length; e++) {
            dataPoints[e] = rnd.nextInt(100) + 1;
            if (dataPoints[e] == intValue)
            {
                intValTimes = intValTimes + 1;
            }
        }
        for (int e = 0; e < dataPoints.length; e++) {
            System.out.print(dataPoints[e] + " | ");
            if (e % 20 == 0 && e != 0) {
                System.out.println("");
            }
        }

        //Output
        System.out.println("");
        System.out.println("Your int "+intValue+" was in this data set " +intValTimes+ " times");
    }
}