import java.util.Random;
import java.util.Scanner;
/*
* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
* FileName: DilikogluC_3308_P2 
* Purpose: Pratice concepts of chapter 10 and 7 
* Name: Can Dilikoglu 
* Major: Computer Science 
*/
public class DilikogluC_3308_P2
{ 
 public static void main(String[]args)
 { 
   System.out.println("I, Can Dilikoglu (TR 2-3:15), did not receive any assistant \n"+
                      "from anyone other than Dr. Boonthum-Denecke or assigned "+
                      "tutors for Spring 2020.\n\n");
   
   Random rd = new Random(); //random object
   Scanner keyboard = new Scanner (System.in);
   
   int money1=rd.nextInt(501)+300; 
   int money2=rd.nextInt(501)+300;
   int money3=rd.nextInt(501)+300;
   int money4=rd.nextInt(501)+300;
   
   Person DilikogluC_3308_Per1 = new Person("David","Johnson",1988); //constructor to create person object 
   Student DilikogluC_3308_Stu1 = new Student("Can","Dilikoglu",2000,money1); //constructor to create Student object
   Student DilikogluC_3308_Stu2 = new Student("Filip","Stevanovic",1996,money2,"psychology",4.04);//constructor to create student object
   Faculty DilikogluC_3308_Fac1 = new Faculty("Arun","Verma",1960,money3);//constructor create faculty object 
   Faculty DilikogluC_3308_Fac2 = new Faculty("Lauren","DeLaCruz",1990,money4,"English","Professor");//constructor to create faculty object
   
   System.out.println("Here is the informartion of person 1: \n");
   System.out.println("The information contains:first name,last name,year of birth,age,and money respectively");
   System.out.println(DilikogluC_3308_Per1+"\n"); //called toString method to print person object information
   
   System.out.println("Here is the information of student 1 and 2 respectively:\n");
   System.out.println("The information contains:first name,last name,year of birth,age"+
                      ", money,major,minor,and gpa respectively");
   System.out.println(DilikogluC_3308_Stu1); //called toString method to print student object information
   System.out.println(DilikogluC_3308_Stu2+"\n");//called toString method to print student object information
   
   System.out.println("Here is the information of faculty 1 and 2 respectively:\n");
   System.out.println("The information contains: first name,last name,year of birth,age,money"
                      +",department,and position respectively");
   System.out.println(DilikogluC_3308_Fac1); //called toString method to print faculty object information
   System.out.println(DilikogluC_3308_Fac2+"\n"); //called toString method to print faculty object information

  
  System.out.print("Enter the new major of "+DilikogluC_3308_Stu2.getName()+":");
  String major = keyboard.nextLine();
  DilikogluC_3308_Stu2.switchMajor(major); // called swithc major method to change major  
  
  DilikogluC_3308_Stu2.shop(8); // last 2 digits of my ID is 08
  System.out.println("New student2 information after changing major:");
  System.out.println(DilikogluC_3308_Stu2+"\n"); //prints new student2 object information
  
  int hours = rd.nextInt(31)+20;
  System.out.println("After working, new information of student 2:");
  DilikogluC_3308_Stu2.work(hours,12.50); // called work method, and adds the amount of money earned to current money
  System.out.println(DilikogluC_3308_Stu2+"\n"); //prints new student2 object information

  
  System.out.println("This program is completed by Can Dilikoglu, Computer Science, 00463308");
 }
}  