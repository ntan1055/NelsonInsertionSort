package com.company;

public class InsertionSort extends SortingUtil
{
    public static void insertionSort(int[] arr)
    {
        int sub = 0;
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    intSwap(arr, j, sub);
                }
            }
        }
    }
}
