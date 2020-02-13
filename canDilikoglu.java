import java.util.Scanner;
import java.io.*;
public class canDilikoglu
{
   public static void main (String[]args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      int num=0;
      int num2=0;
   
      System.out.println("exercise one: for loop");
   
      for(int i=0;i<=50;i++)
      {
         if(i%3==0)
            System.out.println(i);
      }  
      System.out.println();
      System.out.println("exercise two: do-while loop");
   
      do
      {  
         if(num%3==0)
         { System.out.println(num);
         }
         num++;
      }           
      while(num<=50);
   
      System.out.println();
      System.out.println("exercise three: while loop");
      while(num2<=50)
      {
         if(num2%3==0)
         {System.out.println(num2);
         }
       
         num2++;
      }   
    
      System.out.println();
      System.out.println("exercise four: validate loop \n");
      System.out.print("Enter a number in the range (2-30):");
      double num3 = keyboard.nextDouble();
    
      while((num<2) || (num3>30))
      {
         System.out.print("Wrong number, try again (2-30):");
         num3 = keyboard.nextDouble();
      
      }
     
      System.out.println();
      System.out.println("exercise five: printwriter \n");
    
      PrintWriter output = new PrintWriter("dilikoglu.txt");
       
       output.println(1);  
       output.println(2); 
       output.println(3); 
       output.println(4); 
       output.println(5); 
       output.println(6); 
       output.println(7); 
       output.println(8); 
       output.println(9); 
       output.println(10); 
       output.println(11); 
       output.println(12); 
       output.println(13); 
       output.println(14); 
       output.println(15);
       output.println(16); 
       output.println(17); 
       output.println(18); 
       output.println(19); 
       output.println(20); 
       output.close();
    
   
    
      File file = new File("dilikoglu.txt");
      Scanner obj = new Scanner(file);
    
      double sum =0;
      int count=0;
    
      System.out.println("the numbers of the \"dilikoglu.txt\" file are:");
      while(obj.hasNext())
      {
         double num4 = obj.nextDouble();
         System.out.println(num4);
         sum+=num4;
         count++;
      }
      obj.close();
     
      double average = sum/count;
      System.out.println("the average of the numbers is: "+average+"\n");  
    
    
      System.out.println("exercise six: file writer \n");
    
      FileWriter file2 = new FileWriter ("can.txt", true);
      PrintWriter outputFile = new PrintWriter (file2);
    
      outputFile.println(2);  
      outputFile.println(4); 
      outputFile.println(6); 
      outputFile.println(8); 
      outputFile.println(10); 
      outputFile.println(12);        
      outputFile.println(14); 
      outputFile.println(16); 
      outputFile.println(18); 
      outputFile.println(20); 
      outputFile.println(22); 
      outputFile.println(24); 
      outputFile.println(26); 
      outputFile.println(28); 
      outputFile.println(30); 
      outputFile.println(32); 
      outputFile.println(34); 
      outputFile.println(36); 
      outputFile.println(38); 
      outputFile.println(40); 
      outputFile.close();
    
      File file3 = new File("can.txt");
      Scanner obj2 = new Scanner (file3);
    
      double sum2=0;
      int count2=0;
   
      System.out.println("the number of the \"can.txt\" file are:");
      while(obj2.hasNext())
      {
         double num5 = obj2.nextDouble();
         System.out.println(num5);
         sum2+=num5;
         count2++;
      }
      obj2.close();
      double average2 = sum2/count2;
      System.out.println("the average of the numbers is: "+average2);
    
   
   
   }
}