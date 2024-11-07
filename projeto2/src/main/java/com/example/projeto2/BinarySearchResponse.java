package com.example.projeto2;

import com.example.appdependecy.algorithms.BinarySearch;

public class BinarySearchResponse {
	int atIndex;

	public int getAtIndex() {
		return atIndex;
	}

	public void setAtIndex(int atIndex) {
		this.atIndex = atIndex;
	}

	public static BinarySearchResponse build(int[] sortedArray, int key) {
		BinarySearchResponse binarySearchResponse = new BinarySearchResponse();
		binarySearchResponse.setAtIndex(BinarySearch.binarySearch(sortedArray, key));
		return binarySearchResponse;
	}

}
