package com.shailu.sorting;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		new Bubble_Sort().bubble_sort(input);
	}

	private  void bubble_sort(int[] input) {
		
		for(int i=0; i<input.length;i++)
		{
			for(int j=0; j<input.length-1; j++)
				
			{
				int k=j+1;
				if(input[j] > input [k])
				{
					swap(j,k,input);
				}
			}
		}
		
		print(input);
	}

	private static void print(int[] input) {

		for(int i=0; i<input.length; i++)
		{
			System.out.print(input[i] + "  ");
		}
		//System.out.println();
	}

	private static void swap(int i, int k, int[] input) {
		
		int temp=0;
		temp=input[i];
		input[i]=input[k];
		input[k]=temp;
	}
}
