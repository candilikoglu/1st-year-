// can dilikoglu
//00463308  
// this assignment is completed in my room
// this is the driver for bank account class.

import java.util.Scanner;
public class CDilikoglu_P3
{
 public static void main(String[]args)
 {
  Scanner keyboard = new Scanner(System.in);
  
  String verification;
  String name;
  double amount;
  
  
  System.out.print("Enter your name:");
  name=keyboard.nextLine();
  System.out.print("How much money would you like to deposit, initially:");
  amount=keyboard.nextDouble();
  keyboard.nextLine();
  System.out.println("Thank for creating an account with us ! \n");
  
  BankAccountCD account1 = new BankAccountCD(name,amount);
 
  System.out.print("Please enter the name associated with this account for verification:");
  verification=keyboard.nextLine();
  
  if(name.equals(verification))
   {
      account1.executeMenuCD(); 
      System.out.println();
     
      account1.executeMenuCD();
      System.out.println();
     
      account1.executeMenuCD(); 
      System.out.println();
      
      account1.executeMenuCD();
      System.out.println();
      
      account1.executeMenuCD(); 
      System.out.println();
 
      account1.executeMenuCD();
      System.out.println();
      
      account1.executeMenuCD(); 
      System.out.println();
      
   }
   else
   {System.out.println("Incorrect user.System exiting...");
   }
   
 
 
    }
 }                  