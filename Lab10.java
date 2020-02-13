import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
public class Lab10
{
 public static void main(String[]args)
 {
  Random rand = new Random();
  Scanner keyboard = new Scanner(System.in);
  DecimalFormat format = new DecimalFormat("#,###,##,0.000");
  int dice1=0;
  int dice2=0;
  int sum=0;
  
  while(!(sum=8))
  {  
   dice1=rand.nextInt(6)+1;
   dice2=rand.nextInt(6)+1;
   System.out.println("dice are "+dice1+" "+dice2+" (sum = " +(dice1+dice2)+" )");
   sum = dice1+dice2;
  }
  
  System.out.println("Eight rolled\n");
  System.out.println("please enter an integer number:");
  int limit = keyboard.nextInt();
  int totalSquare=0;
  int totalCube=0;
  double totalSqrt=0;

  System.out.println("number\t\tsquare\t\tcube\t\tsquare root");
  
  for(int i=1;i<=limit;i++)
  {System.out.println(i+"\t\t\t\t"+i*i+"\t\t\t\t"+i*i*i+"\t\t"+format.format(Math.sqrt(i)));
   totalSquare+=i*i;
   totalCube+=i*i*i;
   totalSqrt+=Math.sqrt(i);
  
  }
  
  System.out.println("");
  System.out.println(totalSquare);
  System.out.println(totalCube);
  System.out.println(format.format(totalSqrt));
  System.out.println(""); 
 
  int digit=7;
  System.out.println("guess my favorite integer:");
  int guess=keyboard.nextInt();
  


    do
    { 
      while(guess!=digit)
      {
         if(guess<0 || guess>9)
         { System.out.println("not in the range, please reenter a number (0-9)");
           guess=keyboard.nextInt();

         }
         else
         { System.out.println("incorrect, please try again, (0-9)");  
           guess=keyboard.nextInt();

         }
     
       }
     }    
    
     while(guess!=digit);        
     System.out.println("good guess");        








 }

}   

