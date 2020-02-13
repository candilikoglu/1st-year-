// can dilikoglu
// computer science major 
// 15 october 2019 8pm
import java.util.Scanner;
public class practice_midterm
{
 public static void main(String[]args)
 {
  System.out.println(" Lab 3 Part A:\"Combined assignment operators\" ");
  double x,y,z;
  x=0;
  y=9;
  z=0.6;
  int i,j,k;
  i=15;
  j=15;
  k=7;
  x+=5;
  y-=5;
  z*=5;
  i/=k;
  j%=k;
  System.out.println("x= " + x+ ", y=" + y + ", z= " +z);
  System.out.println("i= " +i + ", j=" + j + " \n");
  System.out.println(" Part B:\" Primitive Data Typea \" ");
  long longLow=-9223372036854775807L;
  long longHigh=9223372036854775807L;
  System.out.println(" The range of a long variable is from " + longLow + "to" + longHigh);
  float floatLow=3.4E-38f;
  float floatHigh=3.4E38f;
  System.out.println(" The range of a float variable is from" + floatLow+ "to" + floatHigh);
  double doubleLow=1.7E-308;
  double doubleHigh=1.7E308;
  System.out.println(" The range of a double variable is from"+ doubleLow+"to" +doubleHigh);
  char charA='A';
  char charZ='Z';
  System.out.println(" Uppercase alphabet runs from" + charA + "to" + charZ);
  String name="can";
  String school="hampton";
  String combine= name+" attends " +school;
  System.out.println(combine);
  Scanner keyboard=new Scanner(System.in);
  System.out.println("enter your name ");
  String name1=keyboard.nextLine();
  System.out.println(" enter your favorite number");
  int fav=keyboard.nextInt(); 
  System.out.println( name1 +" favorite number is "+ fav);
  String name2="can dilikoglu";
  String uni="hamptonu";
  int size=name2.length();
  String upper=name2.toUpperCase();
  String lower=name2.toLowerCase();
  char firstletter=name2.charAt(4);
  char lastletter=(12);
  System.out.println(name2+" attends"+ uni);
  System.out.println(" my name contains " + size +" characters with space");
  System.out.println(" my name in uppercase is " + upper);
  System.out.println(" my name in lowercase is " + lower);
  System.out.println(" my last name begins with " + firstletter +"\n");
  String first= "dobroyutro";
  String second=" laku noc ";
  String myNewString=first.concat(second);
  System.out.println(myNewString);
  System.out.println(first);
  System.out.println(first.replace('o','g')+"\n");
  System.out.println(" Lab4 PartB : Methods on String");
  String myuniversity= " attends  Hampton university";
  String myname="cann";
  String myvar1=myuniversity.toLowerCase();
  System.out.println(" myvar1 in lower case is " + myvar1);
  String myvar2,myvar3;
  myvar2=myvar1.replace('i','&');
  System.out.println(" myvar1 letter i to & " + myvar2);
  myvar3=myname.concat(myuniversity);
  System.out.println(myvar3);
  System.out.println(" character at location 3 is " + myvar3.charAt(2));
  System.out.println(" the index of first \"m\" is " + myuniversity.indexOf('m'));
  String myvar4=myuniversity.substring(10,17);
  System.out.println(myvar4);
  System.out.println("\n");
  byte byte1=123;
  double double1;
  double1=byte1;
  System.out.println(double1);
  double1=123.456;
  System.out.println(double1);
  System.out.println(myuniversity.replaceAll("attends","hola"));
  
  
  }
 } 