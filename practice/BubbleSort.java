package com.kokila.practice;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		System.out.println("Enter the values");
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		bubbleSort(a);
		System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
	}

	public  static void bubbleSort(int[] a) {
		int n = a.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                    swapped = true;
                }
            }
            n--;
		}while(swapped);
	}

}
