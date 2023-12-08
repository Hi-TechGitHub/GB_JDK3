package org.example.task3;

public class Main {
    public static void main(String[] args) {
         final ArraysComparator ARRAYS_COMPARATOR = new ArraysComparator();
         Integer[] array1;
         Integer[] array2;
         String[] array3;
         Integer[] array4;
         Short[] array5;

         array1 = new Integer[] {1, 2, 3, 4, 5};
         array2 = new Integer[] {1, 2, 3, 4, 5};
         array3 = new String[] {"1", "2", "3", "2", "5"};
         array4 = new Integer[] {1, 2, 3, 4, 6};
         array5 = new Short[] {1, 2, 3, 4, 5};

         System.out.println(ARRAYS_COMPARATOR.compareArrays(array1, array4)); // Выведет false
         System.out.println(ARRAYS_COMPARATOR.compareArrays(array1, array2)); // Выведет true
         System.out.println(ARRAYS_COMPARATOR.compareArrays(array1, array5)); // Выведет исключение <<Типы массивов отличаются>>

    }

   }

