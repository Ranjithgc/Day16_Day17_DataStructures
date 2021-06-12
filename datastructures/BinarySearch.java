package datastructures;

public class BinarySearch {
	public static int binarySearch(int[] inputArr, int key) {
        	int start = 0;
        	int end = inputArr.length - 1;
        	while (start <= end) {
            		int mid = (start + end) / 2;
            		if (key == inputArr[mid]) {
                		return mid;
            		}
           	 	if (key < inputArr[mid]) {
               			end = mid - 1;
            		} else {
               			start = mid + 1;
            		}
        	}
        	return -1;
   	 }
	
	public static void main(String[] args) {
		int arr[] = {1,5,6,8,9};
		int pos = binarySearch(arr, 6);
		System.out.println("key found at " + pos);
	}
}