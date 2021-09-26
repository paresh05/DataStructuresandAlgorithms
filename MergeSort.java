package com.bridgelabz.DataStructure;

public class MergeSort {

	public static void  merge(int arr[], int beg, int mid, int end)  
	{  
		int l = mid - beg + 1;  
		int r = end - mid;  

		int leftArray[] = new int [l];  
		int rightArray[] = new int [r];  

		for (int i=0; i<l; ++i)  
			leftArray[i] = arr[beg + i];  

		for (int j=0; j<r; ++j)  
			rightArray[j] = arr[mid + 1+ j];  

		int i = 0, j = 0;  
		int k = beg;  
		while (i<l&&j<r)  
		{  
			if (leftArray[i] <= rightArray[j])  
			{  
				arr[k] = leftArray[i];  
				i++;  
			}  
			else  
			{  
				arr[k] = rightArray[j];  
				j++;  
			}  
			k++;  
		}  
		while (i<l)  
		{  
			arr[k] = leftArray[i];  
			i++;  
			k++;  
		}  

		while (j<r)  
		{  
			arr[k] = rightArray[j];  
			j++;  
			k++;  
		}  
	}  

	public static void sort(int arr[], int beg, int end)  
	{  
		if (beg<end)  
		{  
			int mid = (beg+end)/2;  
			sort(arr, beg, mid);  
			sort(arr , mid+1, end);  
			merge(arr, beg, mid, end);  
		}  
	}  
	public static void main(String[] args) {

		int arr[] = {90,23,101,45,65,23,67,89,34,23};  

		sort(arr, 0, arr.length-1);  

		System.out.println("Sorted array");  
		for(int i = 0; i < arr.length; i++)  
		{  
			System.out.println(arr[i]+"");  
		}  
	}  
}
