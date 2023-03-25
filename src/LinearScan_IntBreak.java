import java.util.Random;
import java.util.Scanner;

public class LinearScan_IntBreak {
    public static void main(String[] args) {
        //Declare Variables
        int intValue = 0;
        int intValBreak = 0;
        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE];
        int e = 0;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        intValue = SafeInput.getRangedInt(in, "Enter an int from ", 1, 100);

        //For Loops
        do {
        for (e = 0; e < dataPoints.length; e++) {
            dataPoints[e] = rnd.nextInt(100) + 1;
            if (dataPoints[e] == intValue) {
                intValBreak = 1;
                break;
            }
        }
        for (e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e]==0)
            {
                break;
            }
            System.out.print(dataPoints[e] + " | ");
            if (e % 20 == 0 && e != 0) {
                System.out.println("");
            }
        }
        }
        while (intValBreak !=1);
        //Output
        if (intValBreak==1)
        {
            System.out.println("");
            System.out.println("Your int "+intValue+" was found at position " + e);
        }
        else
        {
            System.out.println("");
            System.out.println("Your int "+intValue+" was not found within this data set");
        }
    }
}