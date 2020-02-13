import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab6
{
 public static void main (String[]args)
 {
  Scanner keyboard = new Scanner(System.in);
  DecimalFormat formatter = new DecimalFormat("#,###,##00");
  
  TestScore_Lab6 math = new TestScore_Lab6();
  TestScore_Lab6 history = new TestScore_Lab6();
  TestScore_Lab6 physics = new TestScore_Lab6();
    
  System.out.print("Enter your first course name:");
  String course1=keyboard.nextLine();
  System.out.print("Enter your first score:");
  double score1=keyboard.nextDouble();
  math.setCoursename(course1);
  math.setCoursescore(score1);
  keyboard.nextLine();
  
  System.out.print("Enter your second course name:");
  String course2=keyboard.nextLine();
  System.out.print("Enter your second course score:");
  double score2=keyboard.nextDouble();
  history.setCoursename(course2);
  history.setCoursescore(score2);
  keyboard.nextLine();
  
  System.out.print("Enter your third course name:");
  String course3=keyboard.nextLine();
  System.out.print("Enter your third score:");
  double score3=keyboard.nextDouble();
  physics.setCoursename(course3);
  physics.setCoursescore(score3);
  
  System.out.println(math.getCoursename()+"\t\t\t\t"+math.getCoursescore());
  System.out.println(history.getCoursename()+"\t\t\t"+history.getCoursescore());
  System.out.println(physics.getCoursename()+"\t\t\t"+physics.getCoursescore());
  
  
  double average = (math.getCoursescore()+history.getCoursescore()+physics.getCoursescore())/3;
  System.out.println("average is " + average);
 
  }
 } 