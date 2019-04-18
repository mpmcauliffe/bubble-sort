package com.company;

public class Main {

    public static void main(String[] args) {

        //  initialize unsorted array with assigned elements
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        //  for printing only
        for (int num: intArray) {
            System.out.print(num + "  ");
        }
        System.out.print("\n");

        /**
        *   OUTER LOOP
        *       lastUnsortedIndex is initialized to last element's index
        *           this decrements on each iteration
        *           terminates loop when it equals 0
        *
        *       this loop "bubbles" the sorted portion of the array at the end of the array and is
        *       always one index smaller than the sorted section
        */
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            /**
             *    INNER LOOP
             *        i is initialized at 0
             *            terminates loop when i = lastUnsortedIndex
             *
             *        this loop compares one index to the very next index
             *        if the element in the first index is greater than the element in the second
             *        index swap() is called
             * */
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        //  for printing only
        for (int num: intArray) {
            System.out.print(num + "  ");
        }
    }

    /**
     *     called from main() within nested for loop
     *
     *     arguments:
     *         int array[]: the array which is being sorted
     *         int i: the position of the larger element
     *         int j: the position of the smaller element
     *
     *     return
     *          when the positions of the smaller and larger elements are the same
     *
     *     initializes a temp variable to facilitate the swap
     */
    public static void swap(int[] array, int i, int j) {
        if(i == j) { return; }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
