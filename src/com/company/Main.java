package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        int[] intArr = {8,6,7,5,3,0,9,10,1,2,3};
        int[] insertionSortArr = SortingUtil.copyIntArray(intArr);

        System.out.print("Before Insertion Sorting: ");
        for(int num:insertionSortArr)
            System.out.print(num + " ");
        System.out.println();

        InsertionSort.insertionSort(insertionSortArr);

        System.out.print("After Insertion Sorting: ");
        for(int num:insertionSortArr)
            System.out.print(num + " ");
        System.out.println();
    }
}
