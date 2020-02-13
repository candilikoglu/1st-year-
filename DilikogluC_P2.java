// can dilikoglu 
// 00463308
// this assignment has been completed in my room 
// going to create a driver class and going to use the methods that I created in the StudentDC class 

import java.util.Scanner; // imports scanne class
public class DilikogluC_P2
{
 public static void main (String[]args)
 {
  Scanner keyboard = new Scanner(System.in); // new object for scanner class 
  
  String Studentname;
  String Major;
  String Year;
  float Gpa;
  float score1;
  float score2;
  float score3;
  float score4;
  float score5;
  
  // prompting user to learn information about student
  System.out.print("Enter your name");
  Studentname=keyboard.nextLine(); 
  System.out.print("Enter your major");
  Major=keyboard.nextLine();
  System.out.print("Enter your classification");
  Year=keyboard.nextLine();
  System.out.print("Enter your gpa");
  Gpa=keyboard.nextFloat();
  keyboard.nextLine();
  System.out.println("\n");
  
  StudentDC firstStudent_DC = new StudentDC ( Studentname,Major,Year,Gpa); // new object for StudentDC class
  firstStudent_DC.setGPA(Gpa);
    
  // using accessor methods to get value 
  System.out.println("First student's name is " + firstStudent_DC.getName());
  System.out.println("Student's major is " + firstStudent_DC.getMajor());
  System.out.println("Student's classification is " + firstStudent_DC.getClassification());
  System.out.println("Student's gpa is " + firstStudent_DC.getGPA() + "\n");
  
  
  StudentDC secondStudent_DC = new StudentDC(); // second object for StudentDC class
  // prompting user to learn information about student
  System.out.print("Enter your name");
  Studentname=keyboard.nextLine();
  System.out.print("Enter your major");
  Major=keyboard.nextLine();
  System.out.print("Enter your classification");
  Year=keyboard.nextLine();
    
  // using mutator methods to set value 
  secondStudent_DC.setName(Studentname);
  secondStudent_DC.changeMajor(Major);
  secondStudent_DC.updateClassification(Year);
  
   
  // going to promp user to get user's scores in order to calculate gpa
  System.out.print("Enter your first 3 credit class score");
  score1=keyboard.nextFloat();
  System.out.print("Enter yout second 3 credit class score");
  score2=keyboard.nextFloat();
  System.out.print("Enter your third 3 credit class score");
  score3=keyboard.nextFloat();
  System.out.print("Enter your 4 credit MAT class score");
  score4=keyboard.nextFloat();
  System.out.print("Enter your 2 credit HEA class score ");
  score5=keyboard.nextFloat();
  keyboard.nextLine();
  System.out.println();
  
  // using accessor methods to get value
  System.out.println("Second student's name is " + secondStudent_DC.getName());
  System.out.println("Student's major is " + secondStudent_DC.getMajor());
  System.out.println("Student's classification is " + secondStudent_DC.getClassification());
  System.out.println("Student's GPA is " + secondStudent_DC.calculateGPA(score1,score2,score3,score4,score5)+"\n");// used calculator method to calculate gpa    
  
  // reading from keyboard 
  System.out.print("Enter your new major");
  Major=keyboard.nextLine();
  secondStudent_DC.changeMajor(Major);
  System.out.println("Student's new major is " + secondStudent_DC.getMajor()+"\n");
  

  StudentDC thirdStudent_DC = new StudentDC(); // third object for StudentDC class
  // using mutator methods to set value 
  thirdStudent_DC.setName("leo");
  thirdStudent_DC.changeMajor("aviation");
  thirdStudent_DC.updateClassification("senior");
  thirdStudent_DC.setGPA(3.5f);
  
  
  //using accessor methods to retrieve information 
  System.out.println("Third student's name is " + thirdStudent_DC.getName());
  System.out.println("Student's major is " + thirdStudent_DC.getMajor());
  System.out.println("Student's classification is " + thirdStudent_DC.getClassification());
  System.out.println("Student's GPA is " + thirdStudent_DC.getGPA());
  
  
  }
 } 