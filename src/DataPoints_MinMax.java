import java.util.Random;

public class DataPoints_MinMax {
    public static void main(String[] args)
    {
        //Declare Variables
        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE];
        Random rnd = new Random();
        //For Loops
        for (int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }

        for (int e = 0; e < dataPoints.length; e++)
        {
            System.out.print(dataPoints[e] + " | ");
            if(e%20==0 && e !=0)
            {
                System.out.println("");
            }
        }
        //Getting Minimum & Maximum
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(min > dataPoints[e])
            {
                min = dataPoints[e];
            }
            if(max < dataPoints[e])
            {
                max = dataPoints[e];
            }
        }
        //Output
        System.out.println("");
        System.out.println("");
        System.out.println("The minimum if this data is "+min+" and the maximum is "+max);
    }
}

