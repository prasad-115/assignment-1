package java_project_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arrays_assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Elements :");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter Elements :");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Copying array into another and display same :");
		int arr1[]=new int[a];
		for(int i=0;i<a;i++) {
			arr1[i]=arr[i];
		}
		for(int i=0;i<a;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("sorting in ascending order :");
		Arrays.sort(arr1);
		for(int i=0;i<a;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("display sum and average of the array :");
		int s=0;
		for(int i=0;i<a;i++) {
			s+=arr[i];
		}
		System.out.println("Sum : "+s);
		System.out.println("Average : "+(s/a));
		System.out.println("square of elements of two dimensional array :");
		System.out.println("Enter Size of array :");
		System.out.println("Rows :");
		int R=sc.nextInt();
		System.out.println("Columns :");
		int C=sc.nextInt();
		int two_arr[][]=new int[R][C];
		System.out.println("Enter "+R*C+" Elements :");
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				two_arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("square of give elements of two dimensional array :");
		int res[][]=new int[R][C];
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				res[i][j]=two_arr[i][j]*two_arr[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
