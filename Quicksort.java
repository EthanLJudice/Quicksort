/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;
import java.io.*;
import java.util.*;
/**
 *
 * @author Ethan
 */
public class Quicksort
{
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is now at right place */
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        Quicksort ob = new Quicksort();
        
        // Testcase 1
        int TC1[] = {4, 7, 14, 4, 5, 9, 19};
        ob.sort(TC1, 0, TC1.length-1);
        System.out.print("Positive case: sorted array: ");
        printArray(TC1);
        
        // Testcase 2
        int TC2[] = {4, 7, 14, -431421345, 1182182119, -1};
        ob.sort(TC2, 0, TC2.length-1);
        System.out.print("Negative case: sorted array: ");
        printArray(TC2);
        
        // Testcase 3 Performace Case
        int TC3[] = {4};
        ob.sort(TC3, 0, TC3.length-1);
        System.out.print("Performance case 1: sorted array: ");
        printArray(TC3);
        int TC4[] = {4, 7, 14, -43, 11, -1, 542, 52566, 241, 134, 42532, 17, -14318};
        ob.sort(TC4, 0, TC4.length-1);
        System.out.print("Performance case 2: sorted array: ");
        printArray(TC4);
        
        // Testcase 4 Boundary Case
        int TC5[] = {};
        ob.sort(TC5, 0, TC5.length-1);
        System.out.print("Boundary case 1: sorted array: ");
        printArray(TC5);
        int TC6[] = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        ob.sort(TC6, 0, TC6.length-1);
        System.out.print("Boundary case 2: sorted array: ");
        printArray(TC6);
        
        // Testcase 5 Impodency Case
        int TC7[] = {8, 4, 2, 6, 7, 7, 11, 2, 9, 0, -3, 20};
        ob.sort(TC7, 0, TC7.length-1);
        System.out.print("Impodency case 1: sorted array: ");
        printArray(TC7);
        int TC8[] = {8, 4, 2, 6, 7, 7, 11, 2, 9, 0, -3, 20};
        ob.sort(TC8, 0, TC8.length-1);
        System.out.print("Impodency case 2: sorted array: ");
        printArray(TC8);
    }
}
/*This qucksort code is contributed by Rajat Mishra */
