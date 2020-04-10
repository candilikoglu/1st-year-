/*
* CSC 152 Program Assignment 3 – Array, Searching, Sorting
* Semester: Fall 2020
* File Name: DilikogluC_3308_P3
* Purpose: Pratice concepts of sort and search 
* Name: Can Dilikoglu
* Name: 00463308
* Major: Computer Science 
* Location: Istanbul, Turkey
*/
import java.io.*;
import java.util.Scanner;

public class DilikogluC_3308_P3
{
   public static void main(String[]args) throws IOException
   {
   
      System.out.println("I, Can Dilikoglu (TR 2pm), did not receive any assistant"
                        +"from anyone other than Dr. Boonthum-Denecke for Spring 2020\n");
   
   
      Scanner keyboard = new Scanner(System.in); // holds scanner object 
      System.out.print("Enter the name of the file:");
      String  a = keyboard.nextLine(); //holds the name of the file 
      File ff = new File (a); // created file object 
      Scanner output = new Scanner (ff); //scanner object to read input from file 
   
      int[] CD_myUnsortedIntegers = new int[output.nextInt()]; // created an array
      int subscript=0;
   
      while(output.hasNext())
      {
         int num = output.nextInt();
         CD_myUnsortedIntegers[subscript]=num; //assigns values from file to array
         subscript++;
      }
   
      System.out.println("Here is the CD_myUnsortedIntegers array:");
      for(int num : CD_myUnsortedIntegers) //enhanced for loop to print elements of the array 
         System.out.print(num+" ");
    
   
      int[] CD_mySortedIntegers1 = new int[CD_myUnsortedIntegers.length]; // created new array, same size of the CD_myUnsortedIntegers
      int[] CD_mySortedIntegers2 = new int[CD_myUnsortedIntegers.length]; // created new array, same size of the CD_myUnsortedIntegers
      int[] CD_mySortedIntegers3 = new int[CD_myUnsortedIntegers.length]; // created new array, same size of the CD_myUnsortedIntegers 
   
      for(int index=0; index<CD_myUnsortedIntegers.length;index++) // for loop to duplicate the CD_myUnsortedArray
      {
         CD_mySortedIntegers1[index] = CD_myUnsortedIntegers[index];
         CD_mySortedIntegers2[index] = CD_myUnsortedIntegers[index];
         CD_mySortedIntegers3[index] = CD_myUnsortedIntegers[index];
      }
   
      System.out.println("\n");
      System.out.println("CD_mySortedIntegers1 array before sorting:");
      for(int num : CD_mySortedIntegers1) //enhanced for loop to print out elements
         System.out.print(num+" ");
      System.out.println("\n"); 
   
      System.out.println("CD_mySortedIntegers1 array after sorting with insertion sort(algorithm efficiency is n square):");
      DilikogluC_sortNsearch.IntInsertionSort_3308_CD(CD_mySortedIntegers1); // used insertion sort to put the elements in order
      for(int num : CD_mySortedIntegers1) //enhanced for loop to print out elements after sorting 
         System.out.print(num+" ");
      System.out.println("\n"); 
   
      System.out.println("CD_mySortedIntegers2 array before sorting:");
      for(int num : CD_mySortedIntegers2)
         System.out.print(num+" ");
      System.out.println("\n"); 
   
      System.out.println("CD_mySortedIntegers2 array after sorting with selection sort(algorithm efficiency is n square):");
      DilikogluC_sortNsearch.IntSelectionSort_3308(CD_mySortedIntegers2); //used insertion sort to put the elements in order
      for(int num : CD_mySortedIntegers2)
         System.out.print(num+" "); // enhanced for loop to print out elements after sorting 
      System.out.println("\n");
   
   
      System.out.println("CD_mySortedIntegers3 array before sorting:");
      for(int num : CD_mySortedIntegers3)
         System.out.print(num+" ");
      System.out.println("\n");
   
      System.out.println("CD_mySortedIntegers3 array after sorting with bubble sort(algorithm efficiency is n square):");
      DilikogluC_sortNsearch.IntBubbleSort_CD(CD_mySortedIntegers3); // bubble sort to put the elements in ascending order 
      for(int num : CD_mySortedIntegers3) //enhanced for loop to print out elements after sorting 
         System.out.print(num+" ");
      System.out.println("\n");
   
      int pos =-1;
      int num;
      int target;
      String answer ="null";
      do{ // do-while loop to keep searching for value as long as the user wants
         System.out.println("Choose one search algorithm:");
         System.out.println("A - Sequential Search");
         System.out.println("B - Binary Search");
         String str = keyboard.nextLine();
         char choice = str.charAt(0);
         System.out.println();
         switch(choice){ //switch statement asks which array user wants to choose 
          case 'A':
           System.out.println("Choose one array (enter the number of the array):");
           System.out.println("1 - CD_myUnsortedIntegers");
           System.out.println("2 - CD_mySortedIntegers1");
           System.out.println("3 - CD_mySortedIntegers2");
           System.out.println("4 - CD_mySortedIntegers3");
           num = keyboard.nextInt();
           System.out.print("Enter the target value:");
           target = keyboard.nextInt();
           System.out.println();
           switch(num){ //switch statement 
            /* index -1 does not exist in an array, so if position is equal to -1, it means that 
             * value does not exist in the array, if the position is not equal to -1
             * searching algorithm found the target value.
             * Each case reperesents different array.
            */ 
            case 1:
             if(pos!=DilikogluC_sortNsearch.IntSequentialSearch_CD(CD_myUnsortedIntegers,target))
              {System.out.println("The value you are looking for in array myUnsortedIntegers "+
                "is in position "+(DilikogluC_sortNsearch.IntSequentialSearch_CD(CD_myUnsortedIntegers,target)+1));                    
              }
              else
              System.out.println("The value is not found in the array CD_myUnsortedIntegers");
              System.out.println();
              keyboard.nextLine();
              System.out.print("Do you want to search again (Yes or No):");
              answer = keyboard.nextLine();
              break;
             case 2:
              if(pos!=DilikogluC_sortNsearch.IntSequentialSearch_CD(CD_mySortedIntegers1,target))
               {System.out.println("The value you are looking for in array CD_mySortedIntegers1 "+
                                   "is in position "+(DilikogluC_sortNsearch.IntSequentialSearch_CD(CD_mySortedIntegers1,target)+1));                    
               }
               else
               System.out.println("The value is not found in the array CD_mySortedIntegers1");
               System.out.println();
               keyboard.nextLine();
               System.out.print("Do you want to search again (Yes or No):");
               answer = keyboard.nextLine();
               break;
              case 3:
               if(pos!=DilikogluC_sortNsearch.IntSequentialSearch_CD(CD_mySortedIntegers2,target))
                {System.out.println("The value you are looking for in array CD_mySortedIntegers2 "+
                                    "is in position "+(DilikogluC_sortNsearch.IntSequentialSearch_CD(CD_mySortedIntegers2,target)+1));                    
                }
                else
                System.out.println("The value is not found in the array CD_mySortedIntegers2");
                System.out.println();
                keyboard.nextLine();
                System.out.print("Do you want to search again (Yes or No):");
                answer = keyboard.nextLine();
                break;
               case 4:
                if(pos!=DilikogluC_sortNsearch.IntSequentialSearch_CD(CD_mySortedIntegers3,target))
                 {System.out.println("The value you are looking for in array CD_mySortedIntegers3 "+
                                     "is in position "+(DilikogluC_sortNsearch.IntSequentialSearch_CD(CD_mySortedIntegers3,target)+1));                    
                 }
                 else
                 System.out.println("The value is not found in the array CD_myUnsortedIntegers3");
                 System.out.println();
                 keyboard.nextLine();
                 System.out.print("Do you want to search again (Yes or No):");
                 answer = keyboard.nextLine();
                 break;
                 default:
                  System.out.print("You cant choose this, try again:");
                  num=keyboard.nextInt();
                 }
                 break;
               
           case'B':
            System.out.println("Choose one array (enter the number of the array):");
            System.out.println("1 - CD_mySortedIntegers1");
            System.out.println("2 - CD_mySortedIntegers2");
            System.out.println("3 - CD_mySortedIntegers3");
            num = keyboard.nextInt();
            System.out.print("Enter the target value:");
            target = keyboard.nextInt();
            System.out.println(); 
             switch(num){ // switch statement for binary search, 
             /* index -1 does not exist in an array, so if position is equal to -1, it means that 
             * value does not exist in the array, if the position is not equal to -1
             * searching algorithm found the target value.
             * Each case reperesents different array.
            */ 
             // binary search can only be used in sorted arrays.
              case 1:
               if(pos!=DilikogluC_sortNsearch.IntBinarySearch_3308(CD_mySortedIntegers1,target))
                  {System.out.println("The value you are looking for in array CD_mySortedIntegers1 "+
                                      "is in position "+(DilikogluC_sortNsearch.IntBinarySearch_3308(CD_mySortedIntegers1,target)+1));                    
                  }
                  else
                  System.out.println("The value is not found in the array CD_myUnsortedIntegers1");
                  System.out.println();
                  keyboard.nextLine();
                  System.out.print("Do you want to search again (Yes or No):");
                  answer = keyboard.nextLine();
                  break;
                case 2:
                 if(pos!=DilikogluC_sortNsearch.IntBinarySearch_3308(CD_mySortedIntegers2,target))
                   {System.out.println("The value you are looking for in array CD_mySortedIntegers2 "+
                                        "is in position "+(DilikogluC_sortNsearch.IntBinarySearch_3308(CD_mySortedIntegers2,target)+1));                    
                   }
                   else
                   System.out.println("The value is not found in the array CD_myUnsortedIntegers2");
                   System.out.println();
                   keyboard.nextLine();
                   System.out.print("Do you want to search again (Yes or No):");
                   answer = keyboard.nextLine();
                   break;
                 case 3:
                  if(pos!=DilikogluC_sortNsearch.IntBinarySearch_3308(CD_mySortedIntegers3,target))
                    {System.out.println("The value you are looking for in array CD_mySortedIntegers3 "+
                                        "is in position "+(DilikogluC_sortNsearch.IntBinarySearch_3308(CD_mySortedIntegers3,target)+1));                    
                    }
                    else
                    System.out.println("The value is not found in the array CD_myUnsortedIntegers3");
                    System.out.println();
                    keyboard.nextLine();
                    System.out.print("Do you want to search again (Yes or No):");
                    answer = keyboard.nextLine();
                    break;
                   default:
                    System.out.print("you cant choose this array, try again:");
                    num=keyboard.nextInt();
                 }
                break;
       } 
      }
      while(answer.equalsIgnoreCase("yes")); // as long as user gives "yes" as an asnwer, he will keep looking for values 
      System.out.println();
      int[] _3308_UnfilledArray = new int[2*CD_myUnsortedIntegers.length]; // created new array, double the size of the array CD_myUnsortedIntegers[ 
      int count=0;
      for(int index=0; index<CD_myUnsortedIntegers.length; index++)
       { _3308_UnfilledArray[index] = CD_myUnsortedIntegers[index];
         count++;
       } 
      
      
       int line =0;
       System.out.println("\n_3308_UnfilledArray 10 integers per line:");
       for(int val : _3308_UnfilledArray) // enhaced for loop to print out elements of the array
       { //if statements makes the code skip to a new line after every 5 elements
         if(line==10)
          System.out.println();
         else if(line==20)
          System.out.println();
         else if(line==30)
          System.out.println();   
        
        System.out.print(val+" ");
        line++;
      
       }      
      System.out.println("\n");
      System.out.println("_3308_UnfilledArray 5 Integers per line, only filled part:");
      for(int index =0; index<count;index++) //this time for loop to only print out the fille part of the array
      {
       if(index==5)
        System.out.println();
       else if(index==10)
        System.out.println();
       else if(index==15)
        System.out.println();  
       
        System.out.print(_3308_UnfilledArray[index]+" ");
      }
     
     
     System.out.println("\n");
     int limit = count+4;
     // asked user to enter 4 new elements to user 
     // used for loop to assign new 4 elements to appropriate index
     System.out.println("Enter four new integers to the array _3308_UnFilledArray:");
     for(int index =count; index<limit;index++) 
     { int new_n = keyboard.nextInt();
       _3308_UnfilledArray[index] = new_n;
       count++;
     }
     
   
     System.out.println("\n");
     System.out.println("Four new integers are added to array, 5 integers per line only filled part:");
     // for loop to print out filled part of the array after adding four new elements
     // code skips to a new line after every 5 elements
     for(int index =0; index<count;index++)
      {
       if(index==5)
        System.out.println();
       else if(index==10)
        System.out.println();
       else if(index==15)
        System.out.println();  
       else if(index==20)
        System.out.println();  
                
       System.out.print(_3308_UnfilledArray[index]+" ");
      }

      System.out.println("\n");
      System.out.println("4th element in the _3308_UnfilledArray is "+ _3308_UnfilledArray[3]);
      
      
      // deleted the 4th element of the array and shipped left the elements that are on the right side of the deleted value  
      for(int index=3;index<count;index++)
      { _3308_UnfilledArray[index]=_3308_UnfilledArray[index+1];
      }
      count--;
      System.out.println("\n");
      
      System.out.println("4th element of the array has been removed and the other elements has been moved left");
      System.out.println("_3308_UnfilledArray elements:");
      
      for(int index=0; index<count;index++) // printing out elements of the array after deleting the 4th element
      { // 5 integers per line 
       if(index==5)
        System.out.println();
       else if(index==10)
        System.out.println();
       else if(index==15)
        System.out.println();  
       else if(index==20)
        System.out.println();  
                
       System.out.print(_3308_UnfilledArray[index]+" ");
      }
         
   
      System.out.println("\n");
      // asking user the location of the element they want to delete
      System.out.print("What is the position of the element you want to delete in range(1-23):?");
      int delete = keyboard.nextInt();
      // if the position is out of range, asks user to re-enter a location 
      while(delete<=0 ||delete>count)
      {
       System.out.println("out of range, try again:");
       delete = keyboard.nextInt();
      }
      
      
      System.out.println("The element you want delete is "+ _3308_UnfilledArray[delete-1]); // the element user wants to delete 
      System.out.println("_3308_UnfilledArray after deleting "+  _3308_UnfilledArray[delete-1]+" is:");

       
      int aa = delete;
      // deleting the elements, and moving the other filling in the deleted element's spot by shipping them left
      for(aa=delete-1; aa<count; aa++) 
       {_3308_UnfilledArray[aa]=_3308_UnfilledArray[aa+1];
       } 
      
      for(int nn : _3308_UnfilledArray) // printing out the elements of the array 
       System.out.print(nn +" ");
       System.out.println("\n");
       System.out.println(--count +"elements is filled in the array");
       System.out.println("");
       System.out.println("This program is completed by Can Dilikoglu, Comuter Science,00463308 and"+
                          "I am currently in Istanbul, TURKEY during our COVID-19 emergency.");
   
   }
 }