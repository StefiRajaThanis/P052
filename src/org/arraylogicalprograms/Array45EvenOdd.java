package org.arraylogicalprograms;

public class Array45EvenOdd {
	public static void main(String[] args) {
		int a [] = new int[] {1,2,3,4,5};
		System.out.println("Elements in even position: ");
		for (int i = 1; i < a.length; i=i+2) {
			System.out.println(a[i]);	
		}
		System.out.println("Elements in odd position: ");
		for (int i = 0; i < a.length; i=i+2) {
			System.out.println(a[i]);
			
		}
	}

}
