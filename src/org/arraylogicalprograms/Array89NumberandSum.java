package org.arraylogicalprograms;

public class Array89NumberandSum {
	public static void main(String[] args) {
		int a[] = new int [] {5,6,9,12,18,20};
		System.out.println("Number of elements: "+a.length);
		//To find sum of elements
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println("Sum of elements: "+sum);
	}

}
