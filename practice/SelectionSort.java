package com.kokila.practice;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		System.out.println("Enter the values");
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		selectionSortt(a);
		System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
	}

	public  static void selectionSortt(int[] a) {
int n=a.length;
for(int i=0;i<n-1;i++) {
	int min=i;
	for(int j=i+1;j<n;j++) {
		if(a[j]<a[min]) {
			min=j;
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
}
	}
}
