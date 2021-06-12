package datastructures;

class BubbleSort {	
	public	static	void	sortdown(int[]a) {	
	 	 int n = a.length;	
	 	 for(int i = 0; i < n ‐ 1; i++) {	
	 	 	 for(int j = i+1; j < n; j++) {	
	 	 	 	 if(a[i] > a[j]) {	
	 	 	 	 	 T temp = a[i];	
	 	 	 	 	 a[i] = a[j];	
	 	 	 	 	 a[j] = temp;	
	 	 	 	 }	
	 	 	 }	
	 	 }	
	 }	
	 public	static void main(String[] args)	{	
	 	 int []a = {5,8,1,6,9,2};
	 	 sortdown(a);	
	 	 for(int x: a) {	
	 	 	System.out.println(x);	
	 	 }	
	 }	
}
