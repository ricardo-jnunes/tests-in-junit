package com.example.appdependecy.algorithms;

public class BinarySearch {

	public static int binarySearch(int[] sortedArray, int key) {
		return binarySearchRecursively(sortedArray, key, 0, sortedArray.length);
	}

	public static int binarySearchRecursively(int[] sortedArray, int key, int low, int high) {
		int middle = low + ((high - low) / 2);

		if (high < low) {
			return -1;
		}

		if (key == sortedArray[middle]) {
			return middle;
		} else if (key < sortedArray[middle]) {
			return binarySearchRecursively(sortedArray, key, low, middle - 1);
		} else {
			return binarySearchRecursively(sortedArray, key, middle + 1, high);
		}
	}
}
