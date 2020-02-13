// this program is a review of CSC 151 class concepts.
// this progran is created by can dilikoglu, computer science major


import java.io.*; // class for reading from and writing to a file
import java.util.Random; // class to generate random numbers
import java.util.Scanner; // scanner class
import java.text.DecimalFormat;

public class DilikogluC_P1
{ 
 public static void main(String[]args) throws IOException
 { 
   DecimalFormat df_CD = new DecimalFormat("00.00"); // created decimal format object
   Random rand_CD = new Random(); // created an object for random class
   
   File fl_CD = new File("StudentListScores.txt"); // created an object for file class 
   Scanner fileScan_CD = new Scanner(fl_CD);
   
 
   int count_CD=0; // variable to count the number of the students on the list
  
   System.out.println(" I, Can Dilikoglu, did not receive any assistant"+
                      " from anyone other than Dr. Boonthum-Denecke Spring 2020. \n");   
   
   System.out.println("Name\t\t\t\tScores\t\tAvergae\t\t\tMessage \n");
       
    while(fileScan_CD.hasNext()) // used while loop and ".hasNext" method to read the file until the end
   
    {
     count_CD++;
     String StudentInfo_CD = fileScan_CD.nextLine();
     Scanner StudentInfoScan_CD = new Scanner (StudentInfo_CD);
      
     // reading the information from the line one at a time. 
     String fname = StudentInfoScan_CD.next();
     String lname = StudentInfoScan_CD.next();
     int score1 = StudentInfoScan_CD.nextInt();
     int score2 = StudentInfoScan_CD.nextInt();
     int score3 = rand_CD.nextInt(16)+15;
     
     // created an object for Student_CD class with the information read from the data file.
     Student_CD aStudent_CD = new Student_CD(fname,lname,score1,score2,score3);
     
     System.out.print(aStudent_CD); // used toString method
     System.out.print("\t\t\t\t"+df_CD.format(aStudent_CD.getAverage())+"\t\t\t");
     avg(aStudent_CD); // used the method to display appropriate message according to the average
     System.out.println();
    }
     
     fileScan_CD.close();
 
     System.out.println("There are " + count_CD +" students on the list\n");
     System.out.println("END - CAN DILIKOGLU");
     System.out.println("01/28/2020 - 6:00 pm");
     
         
  }

  // "avg" method. It is created to display the approriate message based on the avergae of the scores.
  
  public static String avg(Student_CD score)
  {
    
   if(score.getAverage()>=27)
     System.out.println("Exellence, A");
    else if((score.getAverage()>=24)&&(score.getAverage()<27))
     System.out.println("Good, B");
    else if((score.getAverage()>=19)&&(score.getAverage()<24))
     System.out.println("Okay, C");
    else
     System.out.println("Need Improvement");
  
    return " ";
   
   }  
 
    // DilikogluC_P1, created by CAN DILIKOGLU and ID: 00463308, Spring 2020”
 
 }
 
 
 


