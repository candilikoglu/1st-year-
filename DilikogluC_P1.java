import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class DilikogluC_P1
{ 
 public static void main(String[]args) throws IOException
 { 
   Random rand = new Random();
   
   File std = new File("StudentListScores.txt");
   Scanner output = new Scanner(std);
   
   while(output.hasNext())
   {
    String line =output.nextLine();
    System.out.println(line);
   }
 }
}    
 