/******************************************************************************
 *  Purpose: Program is written for finding prime anagram number between\
 *  		 given range and put this prime numbers into Stack
 *
 *  @author  Ranjith G C
 *  @version 1.0
 *  @since   12-06-2021
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

public class PrimeAnagramUsingStack {

	public static void main(String[] args) {
		int start = 0;
		int end = 1000;

		StackImplementUsingLinkedList<Integer> stack = new StackImplementUsingLinkedList<Integer>();

		// putting values in array

		for (int j = start; j <= end; j++) {
			if (DataStructureUtility.isPrime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (DataStructureUtility.isPrime(k)) {
						if (DataStructureUtility.isAnagram(String.valueOf(j), String.valueOf(k))) {
							stack.push(j);
							stack.push(k);

						}
					}
				}

			}

		}
		// stack.show();

		int tempSize = stack.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(stack.peek() + " ");
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}

	}

}