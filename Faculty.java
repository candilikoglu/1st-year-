/*
* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
* FileName: Faculty 
* Purpose: Pratice concepts of chapter 10 and 7 
* Name: Can Dilikoglu 
* Major: Computer Science 
*/
public class Faculty extends Person
{
 private String department = "Unknown"; // to hold the value of department 
 private String position = "Unknown"; // to hold the value of psoition 
 
 public Faculty(String firstName, String lastName, int bYear, double money) //constructor. has 4 parameters 
 { super(firstName,lastName,bYear,money); // super method 
   department = "Unknown";
   position = "Unknown";
 }
 
 public Faculty(String firstName, String lastName, int bYear, double money, String department, String position) // constructor, has 6 parameters
 { super(firstName,lastName,bYear,money); // super method 
   this.department = department; // "this" method to avoid shadowing 
   this.position = position; //"this" method t oavoid shadowing 
 }
 
 public String getDepartment() // returns the value of department 
 { return department;
 }
 
 public void changeDepartment(String newDept) // changes the value of department 
 { department = newDept;
 } 
 
 public String getPosiiton() // returns the value of position 
 { return position;
 }
 
 public void updatePosition(String newPos) // changes the value of position
 { position = newPos;
 }
 
 public String toString() // toString method to display all of the attributes of faculty object
 { String str = super.toString();
   if(position.equals("Unknown")&& department.equals("Unknown"))
    str+="\tn/a\tn/a";
   else
    str+="\t"+department+"\t"+position;
   return str;
 }
 
 /* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
 * This file Student is created by Can Dilikoglu, 00463308
 */
}        