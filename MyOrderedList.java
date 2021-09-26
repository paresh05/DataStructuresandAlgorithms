package com.bridgelabz.DataStructure;

public class MyOrderedList<T extends Comparable<T>> extends MyLinkedList<T> {
	@Override
	public void add(T data) {
		
		MyNode<T> newNode = new MyNode<T>(data);
		if(head == null) {
			head = newNode;
			current = head;
		}
		else if(head.data.compareTo(data) > 0) {
			newNode.next = head;
			head = newNode;
		}
		else if(current.data.compareTo(data) < 0) {
			current.next = newNode;
			current = newNode;
		}
		else {
			MyNode<T> tempPrev = head;
			MyNode<T> tempCurrent = head.next;
			
			while((tempCurrent != current) && (tempCurrent.data.compareTo(data) < 0)) {
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
				
			}
			tempPrev.next = newNode;
			newNode.next = tempCurrent;
		}
		position++;

	}
}
