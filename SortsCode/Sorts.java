public class Sorts
{
   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void selectionSort (int[] numbers)
   {
      int min, temp;

      for (int index = 0; index < numbers.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++)
            if (numbers[scan] < numbers[min])
               min = scan;

         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void insertionSort (int[] numbers)
   {
      for (int index = 1; index < numbers.length; index++)
      {
         int key = numbers[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && numbers[position-1] > key)
         {
            numbers[position] = numbers[position-1];
            position--;
         }
            
         numbers[position] = key;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void insertionSort (Comparable[] objects)
   {
      for (int index = 1; index < objects.length; index++)
      {
         Comparable key = objects[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && objects[position-1].compareTo(key) > 0)
         {
            objects[position] = objects[position-1];
            position--;
         }
            
         objects[position] = key;
      }
   }
   
   public static void mergeSort (int[] numbers)
   {
      doMergeSort(numbers, 0, numbers.length - 1);
   }

   //-----------------------------------------------------------------
   //  Recursively sorts the the portion of the given array beginning
   //  at start and ending at end.
   //-----------------------------------------------------------------
   private static void doMergeSort (int[] numbers, int start, int end)
   {
      if (start < end)
      {
         int middle = (start + end) / 2;
         doMergeSort (numbers, start, middle);
         doMergeSort (numbers, middle + 1, end);
         merge (numbers, start, middle, end);
      }
   }

   //-----------------------------------------------------------------
   //  Merges in sorted order the two sorted subarrays
   //  [start, middle] and [middle + 1, end].
   //-----------------------------------------------------------------
   private static void merge (int[] numbers, int start, int middle,
                     int end)
   {
      // This temporary array will be used to build the merged list.
      int[] tmp = new int[end - start + 1];

      int index1 = start;
      int index2 = middle + 1;
      int indexTmp = 0;

      // Loop until one of the sublists is exhausted, adding the smaller
      // of the first elements of each sublist to the merged list.
      while (index1 <= middle && index2 <= end)
      {
         if (numbers[index1] < numbers[index2])
         {
             tmp[indexTmp] = numbers[index1];
             index1++;
         }
         else
         {
             tmp[indexTmp] = numbers[index2];
             index2++;
         }
          indexTmp++;
      }

      // Add to the merged list the remaining elements of whichever sublist
      // is not yet exhausted.
      while (index1 <= middle)
      {
         tmp[indexTmp] = numbers[index1];
         index1++;
         indexTmp++;
      }
      while (index2 <= end)
      {
         tmp[indexTmp] = numbers[index2];
         index2++;
         indexTmp++;
      }

      // Copy the merged list from tmp into numbers.
      for (indexTmp = 0; indexTmp < tmp.length; indexTmp++)
      {
         numbers[start + indexTmp] = tmp[indexTmp];
      }
   }
}