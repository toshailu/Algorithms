package com.searching.binarysearch;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Shailendra Yadav
 *
 */
public class RecursiveBinarySearch {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 8, 1, 6, 9, 23, 66 };
		Arrays.sort(arr);
		int index = doBinaraySearch(arr, 0, arr.length-1, 9);

		if (index == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + index);
	}

	private static int doBinaraySearch(int[] arr, int low, int high, int element) {

		if (high >= 1) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == element)
				return mid;

			if (arr[mid] > element)
				return doBinaraySearch(arr, low, mid - 1, element);

			return doBinaraySearch(arr, mid + 1, high, element);

		}
		return -1;

	}
}
