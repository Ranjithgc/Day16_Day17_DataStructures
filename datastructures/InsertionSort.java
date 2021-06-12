package datastructures;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		String[] words = {"bharath", "arun", "dog", "chethan"};
		for(int i = 1; i <= words.length; i++) {
			String temp = words[i];
			int j = i - 1;
			while(j >= 0) {
				if(temp.compareTo(words[j]) > 0) {
					break;
				}
				words[j+1] = words[j];
				j--;
			}
			words[j+1] = temp;
			System.out.println(Arrays.toString(words));
		}
		System.out.println(Arrays.toString(words));
	}
}
