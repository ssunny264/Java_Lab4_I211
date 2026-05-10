/*
 * Sara Sunny
 * Lab 4 - Problem 2 - Main
 */
package sunny_lab4_prob2;

/**
 *
 * @author slbru
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Sunny_Lab4_Prob2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int value = 0;
        
        System.out.println("Enter number: ");
        value = in.nextInt();
        
        DisplayNum(value);
    }
    
    public static void DisplayNum (int num) {
        
        
        if ((num / 10) == 0){
            if (num==0) {
                System.out.printf("%s ", "zero");
            }
            else if (num==1) {
                System.out.printf("%s ", "one");
            }
            else if (num==2) {
                System.out.printf("%s ", "two");
            }
            else if (num==3) {
                System.out.printf("%s ", "three");
            }
            else if (num==4) {
                System.out.printf("%s ", "four");
            }
            else if (num==5) {
                System.out.printf("%s ", "five");
            }
            else if (num==6) {
                System.out.printf("%s ", "six");
            }
            else if (num==7) {
                System.out.printf("%s ", "seven");
            }
            else if (num==8) {
                System.out.printf("%s ", "eight");
            }
            else if (num==9) {
                System.out.printf("%s ", "nine");
            }  
        }
        else {
        DisplayNum(num / 10);
            if (num%10==0) {
                System.out.printf("%s ", "zero");
            }
            else if (num%10==1) {
                System.out.printf("%s ", "one");
            }
            else if (num%10==2) {
                System.out.printf("%s ", "two");
            }
            else if (num%10==3) {
                System.out.printf("%s ", "three");
            }
            else if (num%10==4) {
                System.out.printf("%s ", "four");
            }
            else if (num%10==5) {
                System.out.printf("%s ", "five");
            }
            else if (num%10==6) {
                System.out.printf("%s ", "six");
            }
            else if (num%10==7) {
                System.out.printf("%s ", "seven");
            }
            else if (num%10==8) {
                System.out.printf("%s ", "eight");
            }
            else if (num%10==9) {
                System.out.printf("%s ", "nine");
            }
        }
    }
}
