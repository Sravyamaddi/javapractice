package com.javapractice;

import java.util.Arrays;

public class QuickSortAlgo {

	
	public static void quickSort(int[] arr,int low, int high){
		
		if(low  < high){
			int j = partition(arr, low, high);
			quickSort(arr, low, j-1);
			quickSort(arr ,j+1, high);
				
		}
	}
	
	public static int partition(int[] arr, int low, int high){
		
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
		/*
		 * int pivot = arr[low]; int i = low -1 ; int j = high; if(i < j ){ do { i++;
		 * }while(arr[i]<= pivot); do{ j++; }while(arr[j] > pivot); if(i<j)
		 * swap(arr,arr[i],arr[j]); } swap(arr,arr[i],arr[j]); return j;
		 */
	}
	public static void main(String args[]){
		 int[] arr = { 10, 7, 8, 9, 1, 5 };
		    int n = arr.length;
		    quickSort(arr, 0, n - 1);
		    System.out.println("Sorted array: "+ Arrays.toString(arr));
		
	}
	
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
}
