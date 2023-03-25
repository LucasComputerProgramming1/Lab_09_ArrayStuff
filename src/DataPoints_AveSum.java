import java.util.Random;
public class DataPoints_AveSum {
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
        //Getting Average
        int sum = 0;
        for(int e = 0; e < dataPoints.length; e++)
        {
            sum = sum + dataPoints[e];
        }
        int ave = sum / dataPoints.length;
        //Output
        System.out.println("");
        System.out.println("");
        System.out.println("The sum if this data is "+sum+" and the average is "+ave);
    }
}

