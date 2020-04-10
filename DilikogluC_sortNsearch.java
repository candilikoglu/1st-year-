/*
* CSC 152 Program Assignment 3 – Array, Searching, Sorting
* Semester: Fall 2020
* File Name:  DilikogluC_sortNsearch
* Purpose: Pratice concepts of sort and search 
* Name: Can Dilikoglu
* Name: 00463308
* Major: Computer Science 
* Location: Istanbul, Turkey
*/
public class DilikogluC_sortNsearch
{
  
  public static int IntSequentialSearch_CD(int[] array, int value)
   {
      int index;        // Loop control variable
      int position;     // Position the value is found at
      boolean found;    // Flag indicating search results

      // Element 0 is the starting point of the search.
      index = 0;

      // Store the default values position and found.
      position = -1;
      found = false;

      // Search the array.
      while (!found && index < array.length)
      {
         if (array[index] == value)
         {
            found = true;
            position = index;
         }
         index++;
      }

      // Return the found element's position,
      // or -1 if not found.
      return position;
   }
   
   
   public static int IntBinarySearch_3308(int[] array, int value)
   {
      int first;       // First array element
      int last;        // Last array element
      int middle;      // Mid point of search
      int position;    // Position of search value
      boolean found;   // Flag

      // Set the inital values.
      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;

      // Search for the value.
      while (!found && first <= last)
      {
         // Calculate mid point
         middle = (first + last) / 2;
         
         // If value is found at midpoint...
         if (array[middle] == value)
         {
            found = true;
            position = middle;
         }
         // else if value is in lower half...
         else if (array[middle] > value)
            last = middle - 1;
         // else if value is in upper half....
         else
            first = middle + 1;
      }

      // Return the position of the item, or -1
      // if it was not found.
      return position;
   }
   

   public static void IntBubbleSort_CD(int[] array)
   {
      int lastPos;     // Position of last element to compare
      int index;       // Index of an element to compare
      int temp;        // Used to swap to elements
      
      // The outer loop positions lastPos at the last element
      // to compare during each pass through the array. Initially
      // lastPos is the index of the last element in the array.
      // During each iteration, it is decreased by one.
      for (lastPos = array.length - 1; lastPos >= 0; lastPos--)
      {
         // The inner loop steps through the array, comparing
         // each element with its neighbor. All of the elements
         // from index 0 thrugh lastPos are involved in the
         // comparison. If two elements are out of order, they
         // are swapped.
         for (index = 0; index <= lastPos - 1; index++)
         {
            // Compare an element with its neighbor.
            if (array[index] > array[index + 1])
            {
               // Swap the two elements.
               temp = array[index];
               array[index] = array[index + 1];
               array[index + 1] = temp;
            }
         }
      }
   }

   
   public static void IntSelectionSort_3308(int[] array)
   {
      int startScan;   // Starting position of the scan
      int index;       // To hold a subscript value
      int minIndex;    // Element with smallest value in the scan
      int minValue;    // The smallest value found in the scan

      // The outer loop iterates once for each element in the
      // array. The startScan variable marks the position where
      // the scan should begin.
      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         // Assume the first element in the scannable area
         // is the smallest value.
         minIndex = startScan;
         minValue = array[startScan];
         
         // Scan the array, starting at the 2nd element in
         // the scannable area. We are looking for the smallest
         // value in the scannable area. 
         for(index = startScan + 1; index < array.length; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
            }
         }

         // Swap the element with the smallest value 
         // with the first element in the scannable area.
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }

     public static void IntInsertionSort_3308_CD(int[] array)
   {
      int unsortedValue;  // The first unsorted value
      int scan;           // Used to scan the array
      
      // The outer loop steps the index variable through 
      // each subscript in the array, starting at 1. The portion of
      // the array containing element 0  by itself is already sorted.
      for (int index = 1; index < array.length; index++)
      {
         // The first element outside the sorted portion is
         // array[index]. Store the value of this element
         // in unsortedValue.
         unsortedValue = array[index];
         
         // Start scan at the subscript of the first element
         // outside the sorted part.
         scan = index;
         
         // Move the first element in the still unsorted part
         // into its proper position within the sorted part.
         while (scan > 0 && array[scan-1] > unsortedValue)
         {
            array[scan] = array[scan - 1];
            scan--;
         }
         
         // Insert the unsorted value in its proper position
         // within the sorted subset.
         array[scan] = unsortedValue;
      }
   }
}

/* 
* CSC 152 Program Assignment 3 – Array, Searching, Sorting
* Semester: Spring 2020 - 1
* This file DilikogluC_sortNsearch is created by Can Dilikoglu, 00463308
*/