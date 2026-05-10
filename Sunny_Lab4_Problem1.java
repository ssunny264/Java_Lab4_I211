/*
 * Sara Sunny
 * Lab 4 - Problem 1 - Main
 */
package sunny_lab4_problem1;

/**
 *
 * @author slbru
 */
import java.util.Random;
import java.util.Arrays;
public class Sunny_Lab4_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Level myVar;
        Random rand = new Random();
        int array[] = new int [50];
        Double zScore[] = new Double[50];
        double total = 0;
        
        //populates array with random numbers
        for(int i=0; i<array.length; i++){
            array[i] = 1+rand.nextInt(100);
            total += array[i];  
            //System.out.printf("%d \n", array[i]);
        }
        
        //section to find mean and standard deviation
        double mean = total / array.length;
        total = 0;
        for (int count = 0; count < array.length; count++) {
            total+=Math.pow((array[count]-mean),2);
        }
        double mean2 = total/(array.length-1);
        double deviation = Math.sqrt(mean2);
        
        for(int i=0; i< array.length; i++){
           zScore[i] = ((array[i]-mean) / deviation);
        }
        
        //assign enum value and display
        for(int i=0; i<zScore.length; i++){
            if(zScore[i]< -3){
                myVar = Level.very_low;
            }
            else if(zScore[i]< -1){
                myVar = Level.low;
            }
            else if(zScore[i]>-1 && zScore[i]<1){
                myVar = Level.middle;
            }
            else if(zScore[i]>1){
                myVar = Level.high;
            }
            else{
                myVar = Level.very_high;
            }
            System.out.printf("%d: z-score value: %.2f\t%s\n", (i+1), zScore[i], myVar);
        }
    }
    
}
