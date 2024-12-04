package org.arraylogicalprograms;

public class Array3ReverseArray {
	public static void main(String[] args) {
		int a[] = new int[] {1, 2, 3, 4, 5, 6};
		int rev[] = new int[6];
		System.out.println("Elements in Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
	
		}
		//reverse order
		System.out.println("Elements in reverse order:");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
			
		}
		
	}

}
