package com.bridgelabz.DataStructure;


public class PrimeNumbersStack {

	MyStack<Integer> myStack;	//	stack to store prime anagrams
	PrimeNumber2DArray object;
	
	public static void main(String[] args) {

		//	class object
		PrimeNumbersStack primeAnagramStack = new PrimeNumbersStack();
		primeAnagramStack.fillStack();
	}

	
	/**
	 * fills prime anagrams in the stack
	 */
	void fillStack() {
		object = new PrimeNumber2DArray();
		object.findPrimes();
		myStack = new MyStack<Integer>();

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < object.primeNumbers[i].length; j++) {
				int num = object.primeNumbers[i][j];
				for(int k = j+1; k < object.primeNumbers[i].length; k++) {
					if(isAnagram(num, object.primeNumbers[i][k])){
						myStack.push(num);
						myStack.push(object.primeNumbers[i][k]);
						break;
					}
				}
			}
		}
		
		print();
	}
		
	/**
	 * @param firstInterger - first number 
	 * @param secondInteger - second number
	 * @returns true if numbers are anagram else returns false
	 */
	boolean isAnagram(int firstInterger, int secondInteger) {
		if(firstInterger < 10) {
			return false;
		}
		AnagramDetection anagram = new AnagramDetection();
		return anagram.isAnagram(String.valueOf(firstInterger), String.valueOf(secondInteger));
	}
	
	/**
	 * prints stack elements
	 */
	void print() {
		while(!myStack.isEmpty())
			System.out.println(myStack.pop() + " " + myStack.pop());
	}
}
