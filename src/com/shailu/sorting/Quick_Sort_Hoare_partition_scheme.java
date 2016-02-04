package com.shailu.sorting;

public class Quick_Sort_Hoare_partition_scheme {
	
	public static void main(String[] args) {
		
	int[] array = { 5, 12, 88, 23, 1, 12, 4, 13, 55, 32 };
	int low = 0;
	int high = array.length-1;
	quick_sort(array, low, high);
	print("Sorted Array : ",array);
	}
	

	private static void quick_sort(int[] array, int low,
			int high) {

		
		if(low < high)
		{
			int partition=partition(array,low,high);
			quick_sort(array,low,partition);
			quick_sort(array,partition+1,high);
		}
	}


	private static int partition(int[] array, int low, int high) {

		int pivot=array[low];
		int i=low-1;
		int j=high+1;
		while(true)
		{
			do
			{
				++i;
			}while(array[i]<pivot);
			
			do
			{
				--j;
			}while(array[j] > pivot);
			
			if(i>=j)
			{
				return j;
			}
			swap(array,i,j);
		}
	}


	
private static void swap(int[] array,int i, int j) {
		
	System.out.println("Swapping element : "+ array[i] + "   "+ array[j]);
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	private static void print(String string, int[] array) {
		
		System.out.print(string);
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+"   ");
		}
	}

	}

