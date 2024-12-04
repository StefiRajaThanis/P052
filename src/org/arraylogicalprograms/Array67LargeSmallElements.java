package org.arraylogicalprograms;

public class Array67LargeSmallElements {
	public static void main(String[] args) {
		int a[] = new int[] {55, 66, 77, 88};
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Largest element present in array: "+max);
		
		//To find minimum element
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Small element: "+min);
	}
	
}
