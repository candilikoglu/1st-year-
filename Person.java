/*
* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
* FileName: Person 
* Purpose: Pratice concepts of chapter 10 and 7 
* Name: Can Dilikoglu 
* Major: Computer Science 
*/
public class Person
{
 private String firstName; // to hold first name 
 private String lastName;  // to hold last name 
 private int yearOfBirth; // to hold year of birth 
 private String city = "istanbul"; // to hold city 
 private String state = "tr"; // to hold state 
 private double money = 308; // to hold momney
 
 public Person(String firstName, String lastName, int bYear) // constructor, has 3 parameters 
 {
   this.firstName = firstName; // used "this" method to avoid shadowing
   this.lastName = lastName; // used "this" method to avoid shadowing
   yearOfBirth = bYear;
 }
 
 public Person(String fName, String lName, int bYear, double aMoney) // constructor, has 4 parameters 
 {
  firstName = fName;
  lastName = lName;
  yearOfBirth = bYear;
  money = aMoney;
 } 
 
 public String getName() // returns person's first and last name 
 { return firstName+" "+lastName;
 }
 
 public int getBirthYear() // returns person's year of birth
 { return yearOfBirth;
 }
 
 public double getMoney() // returns person's money 
 { return money;
 }
 
 public String CityState() // returns person's city and state 
 { return city+", "+ state;
 }
 
 public int getAge() // returns person's age 
 { return 2020-yearOfBirth;
 }
 
 public void setMoney(double newMoney) // changes the value of money
 { money = newMoney;
 }
 
 public void setCityState(String newCity, String newState) // changes the value of city and state 
 { city = newCity;
   state = newState;
 }
 
 public void work(double amount) // adds amount to money
 { money+=amount;
 }
 
 public void work(int hours, double payRate) // calculates how much money person made
 {  
   if(hours<=40)
    money+=hours*payRate;
    
   if(hours>40)
   {
    money+=hours*payRate;
    int extra = hours-40;
    money+= extra*1.5*payRate;
   }
 }
 
 public void work(String amount) // adds amoun to money, converts string to double 
 {    
   double d = Double.parseDouble(amount);
   money+=d;
 }
 
 public void shop() // subtracts 30.00 from money
 {
  if(money-30.00>=0)
   money-=30.00;
 }
 
 public void shop(double amount) // subtracts amount from money if the amount is less than money
 {
  if(amount<=money)
   money-=amount;
  else 
   System.out.println("You cannot spend more money than you have !");
 }
 
 public void shop(String amount) // subtratcs amount fronm money, converts string to double 
 { double d = Double.parseDouble(amount);
   money-=d;
 }
 
 public String toString() // toString method displays all of the attributes
 {
  String str = firstName+" "+lastName+"\t"+yearOfBirth+"\t"+getAge()+"\t"+money;
  return str;
 }

/* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
* This file Person is created by Can Dilikoglu, 00463308
*/
}          