package com.bridgelabz.DataStructure;

public class BinarySearch {

	public static int binarySearch(String[] arr, String x)
	{
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int res = x.compareTo(arr[m]);
			if (res == 0)
				return m;
			if (res > 0)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		String[] arrayOfElements = { "Android", "Ios", "java", "Kotlin", "NodeJS", "React", "Web"};
		String findWord = "Kotlin";
		int result = binarySearch(arrayOfElements, findWord);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at "
					+ "index " + result);
	}
}
