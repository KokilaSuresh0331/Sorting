package com.kokila.practice;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		System.out.println("Enter the values");
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		insertionSort(a);
		System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
	}

	public static void insertionSort(int[] a) {
		int n=a.length;
		for(int i=1;i<n;++i)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
	}
}
