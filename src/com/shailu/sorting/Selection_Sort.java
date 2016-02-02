package com.shailu.sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		
		int[] arr1 = {10,34,2,56,7,67,88,42};
        selection_sort(arr1);
        
	}

	private static void selection_sort(int[] arr1) {
		
		for(int i=0; i< arr1.length; i++)
		{
			int index=i;
			for(int j=i+1 ; j<arr1.length; j++)
			{
				if(arr1[j] < arr1[index])
				{
					index=j;
				}
			}
			
			int smallerNumber = arr1[index]; 
            arr1[index] = arr1[i];
            arr1[i] = smallerNumber;
		}
		print(arr1);
	}

	
	
	
	private static void print(int[] input) {

		for(int i=0; i<input.length; i++)
		{
			System.out.print(input[i] + ", ");
		}
		System.out.println();
	}
}
