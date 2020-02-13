import java.util.Scanner;
public class Lab9
{
  public static void main(String[]args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter your numeric assignment score (0-100):");
   int score=keyboard.nextInt();
   System.out.println(evaluateScore(score));
   
   System.out.println("enter 3 digit area code:");
   int code=keyboard.nextInt();
   getAreacode(code);
  
   System.out.println("enter the dollar amount purchased in the last month");
   int purchase=keyboard.nextInt();
   Storepoint(purchase);
  } 
  
  
  
  
  public static String evaluateScore(int Score)
  {
    int score = Score;
    String answer;
    
    if(score <60)
     { answer="your score is " + score + "need to improve more.";
     } 
     else if(score <=69)
     { answer=" your score is "+score+" Poor, with room to improve.";
     }
     else if(score <=79)
     {answer="your score is "+score+" Just enoguh, but you can do more.";
     }
     else if(score <=89)
     {answer="your score is "+score+ "Good Job.";
     }
     else if(score <=99)
      {answer="your score is "+score+" Exellence.";
      }
     else
      {answer="your score is "+score+" outdstanding";
      }
  
   return answer;
  }



  public static String getAreacode(int areacode)
  {
   int Areacode=areacode;
   switch(Areacode)
   {
    case 212:
     System.out.println("You entered area code "+Areacode+", which for Hampton,VA");
     break;
     
    case 202:
     System.out.println("You entered area code "+Areacode+", which for Washington,DC");
     break;
     
    case 213:
     System.out.println("You entered area code "+Areacode+", which for Los Angeles,CA");
     break;
     
    case 305:
     System.out.println("You entered area code "+Areacode+", which for miami, FL");
     break;
     
    default:
     System.out.println("no area code found");
    }
   return "";
   
   }
   
        
   public static String Storepoint(int point)
   {
    int purch=point;
    
    if(purch==0)
     {System.out.println("you purchased "+purch+" last month, 0 points awarded.");
     }
     else if( purch <=50)
     {System.out.println("you purchased "+purch+" last month, 2 points awarded.");
     }
     else if(purch <=100)
     {System.out.println("you purchased "+purch+" last month, 4 points awarded.");
     }
     else if(purch <=150)
     {System.out.println("you purchased "+purch+" last month, 6 points awarded.");
     }
     else
     {System.out.println("you purchased "+purch+" last month, 8 points awarded.");
     }
 
    return "";
 }












}

       
     