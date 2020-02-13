// can dilikoglu 
// 00463308
// this assignment is completed in my room
// this is the student class. In this class, attributes and methods will be created in order to use in the driver program

public class StudentDC
{
 private String name;
 private String major;
 private String classification;
 private float gpa;
 
 public StudentDC(String n , String m , String c , float g) // constructor which accepts parameters
 { name = n;
   major = m;
   classification = c;
   gpa = g;
 }
 
 public StudentDC() // no-arg constructor 
 { name="no";
   major="no";
   classification="no";
   gpa=0;
 }
 
 public void setName(String n) // mutator method for name
 { name = n;
 }
 
 public void changeMajor( String m) // mutator method for major
 { major=m;
 }
 
 public void updateClassification( String c) // mutator method for classification 
 { classification = c;
 }
 
 public void setGPA( float g) // mutator method for gpa
 { gpa = g ;
 }
 
 public String getName() 
 { return name;
 }
 
 public String getMajor()
 { return major;
 }
 
 public String getClassification()
 { return classification;
 }
     
 public float getGPA()
 { return gpa;
 }  

 public float calculateGPA(float scoreC1, float scoreC2, float scoreC3, float scoreC4, float scoreC5) // calculater method, calculates gpa
 { return 3*scoreC1+3*scoreC2+3*scoreC3+(4*scoreC4)+(2*scoreC5))/15;
 }

}
   