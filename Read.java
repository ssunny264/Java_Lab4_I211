/*
 * Sara Sunny
 * Lab 4 - Problem 3 - Class File
 */
package sunny_lab4_prob3;

/**
 *
 * @author slbru
 */
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class Read {
     int line, words;
     String array[][];
     
     File f = new File("File.txt");
     
     public Read(){
         line = 0; 
         words = 0;
      
     }
     public void ReadFile(){
         try(Scanner in = new Scanner(f)){
             
             
             while (in.hasNext()){
                 in.next();
                     words++;                       
             }
             in.close();
         }
        catch (Exception e){
             e.printStackTrace();
         }
             
        try(Scanner in = new Scanner(f)){
             while (in.hasNextLine()){
                 in.nextLine();
                     line++;                        
             }
             System.out.println(words + " words and " + line + " lines in the file");
         }
         catch (Exception e){
             e.printStackTrace();
         }
     }          //267 words and 22 lines
}
