package com.shailu.sorting;

public class Insertion_Sort {

	public static void main(String[] args) {

		int[] arr1 = { 8, 2, 4, 9, 3, 6 };
		insertion_sort(arr1);

	}

	private static void insertion_sort(int[] arr1) {

		for (int i = 1; i < arr1.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr1[j] < arr1[j - 1]) {
					swap(j, arr1);
				}
			}
		}
		print(arr1);
	}

	private static void print(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println();
	}

	private static void swap(int j, int[] arr1) {

		int temp = 0;
		temp = arr1[j];
		arr1[j] = arr1[j - 1];
		arr1[j - 1] = temp;
	}
}
