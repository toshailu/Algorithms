package com.searching.binarysearch;

import java.util.Arrays;

public class IterativeBinarySearch {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 8, 1, 6, 9, 23, 66 };
		Arrays.sort(arr);
		System.out.println("Sorted Array :");
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
		int index = doBinarySearch(arr, 23);

		if (index == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + index);
	}

	private static int doBinarySearch(int[] arr, int element) {

		int low = 0, high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == element)
				return mid;

			if (arr[mid] < element) {

				low = mid + 1;
			} else
				high = mid - 1;

		}

		return -1;
	}

}
