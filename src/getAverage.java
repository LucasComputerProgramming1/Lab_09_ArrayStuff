import java.util.Random;
import java.util.Scanner;

public class getAverage {
    //Get Average Method
    public static double getAverage(double values[]) {
        int sum = 0;
        int ave = 0;
        for (int e = 0; e < values.length; e++) {
            sum += values[e];
            ave = sum / values.length;
        }
        return ave;
    }

    //Doubles Average
    public static void main(String[] args) {
        //Declare Variables
        double[] dataPoints = {1.1, 2.2, 3.3, 4.4, 5.5};
        Scanner in = new Scanner(System.in);
        //Output
        System.out.println("Average of this data is: " + getAverage(dataPoints));
    }
}



