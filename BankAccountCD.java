// can dilikoglu
//00463308  
// this assignment is completed in my room
// this is a bank account class which has several methods like deposit withdraw 
import java.util.Scanner;
import java.text.DecimalFormat;
public class BankAccountCD
{ 
   private String name;
   private double rate;
   private double balance;
   private Scanner keyboard = new Scanner(System.in);
  //private DecimalFormat decimalFormat = new DecimalFormat("##,###.##000");
 
 
   public BankAccountCD( String aName, double aBalance)
   { name=aName;
      balance=aBalance;
   }  
 

   public void executeMenuCD()
   {  
      double deposit1;
      double withdraw1;
      
   
      System.out.println("Bank Menu:");
      System.out.println("\t\t[D]: Deposit");
      System.out.println("\t\t[W]: Withdraw");
      System.out.println("\t\t[B]: Balance");
      System.out.print("Choose an option:");
      String user_input=keyboard.nextLine();
      char option =user_input.charAt(0);
         
      switch (option)
      { 
         case 'D':
         case 'd':
            System.out.print("How much would you like to deposit?");
            deposit1=keyboard.nextDouble();
            keyboard.nextLine();
            deposit(deposit1);  
            System.out.println("Balance before interest: $" + decimalFormat.format(balance));
            calculateRate();             
            System.out.println("Amount of interest added:$" + decimalFormat.format(rate*balance));
            addInterest();
            System.out.println("NEW BALANCE:$" +decimalFormat.format(balance));
            break;
         
         case 'W':
         case 'w': 
            System.out.print("How much would you like to withdraw?");
            withdraw1=keyboard.nextDouble();
            keyboard.nextLine();
            withdraw(withdraw1);
            System.out.println("Balance before interest:$" +decimalFormat.format(balance));
            calculateRate();
            System.out.println("Amount of interest added:$"+decimalFormat.format(rate*balance));
            addInterest();
            System.out.println("NEW BALANCE:$"+ decimalFormat.format(balance));
            break;
         
         case 'B':
         case 'b':
            System.out.println(name+" your current balance is " + decimalFormat.format(balance));
              
      }
             
        
   } 
 
   private double calculateRate()
   { 
      if(balance>=10000)
         rate=0.15  ; 
      else if(balance>1000)
         rate=0.07;
      else if(balance<1000 && balance>0)
         rate=0.02;
      else 
         rate=0;
    
      return rate;
    
   }  
      
       
 
   public void addInterest()
   {
   
      balance=(rate*balance)+balance;
   } 
 
   private void deposit(double amount)
   {  
      balance+=amount;
      if(balance>0)
      {
         addInterest();
         
      } 
   }
   
 
   private void withdraw(double amount)
   {  
      balance-=amount;
       addInterest();
       if(balance>0)
        { 
          addInterest();
        }  
   }
 
 
 
 
 
}