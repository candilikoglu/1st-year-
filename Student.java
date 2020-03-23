/*
* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
* FileName: Student 
* Purpose: Pratice concepts of chapter 10 and 7 
* Name: Can Dilikoglu 
* Major: Computer Science 
*/
public class Student extends Person
{
 private String major = "Undeclared"; // to hold value of major 
 private String minor = "No Minor"; // to hold value of minor 
 private double gpa = 0.00; // to hold value of gpa 
 
 public Student(String firstName, String lastName, int bYear, double money) // constructor, has 4 parameters
 { super(firstName,lastName,bYear,money); //  super method
   major = "Undeclared";
   minor = "No Minor";
   gpa = 0.00;
 }
 
 public Student(String firstName, String lastName, int bYear, double money, String major, double gpa) // constructor, has 6 parameters
 { super(firstName,lastName,bYear,money); // super method 
   this.major = major; // used "this" method to avoid shadowing 
   this.gpa = gpa;  // used "this" method to avoid shadowing 
   minor = "No Minor";
 }
 
 public String getMajor() // returns the value of major 
 { return major;
 }
 
 public void switchMajor(String newMajor) // changes the value of major 
 { major = newMajor;
 }
 
 public String getMinor() // returns the value of minor 
 { return minor;
 }
 
 public void changeMinor(String newMinor) // changes the value of minor 
 { minor = newMinor;
 }
 
 public double getGPA() // returns the value of gpa
 { return gpa;
 }
 
 public void setGPA(double newGPA) // changes the value of gpa 
 { gpa = newGPA;
 }
 
 public String toString() // toString method to display all of the attributes of a student object
 {  String str = super.toString()+"\t\t";
   if(major.equals("Undeclared"))
     str+="n/a"+"\t"+minor+"\t"+gpa;
   else 
     str+=major+"\t"+minor+"\t"+gpa;
  
   return str;
 }
 
 /* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
 * This file Student is created by Can Dilikoglu, 00463308
 */
}   