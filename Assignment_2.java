package java_project_1;

import java.util.*;

public class Assignment_2 {
	public static int calculateSum(int a) {
		int s=0;
		for(int i=1;i<=a;i++) {
			s+=i;
		}
		return s;
	}
	public static int calculateDifference(int a) {
		int m=0;
		int n=0;
		for(int i=1;i<=a;i++) {
			m+=(i*i);
		}
		for(int i=1;i<=a;i++) {
			n+=i;
		}
		return m+(n*n);
	}
	public static boolean checkNumber_inc(int a) {
		int b=a;
		int p=b%10;
		for(b/=10;b>0;b/=10) {
			int q=b%10;
			if(q>p) {
				return false;
			}
			p=q;
		}
		return true;
	}
	public static boolean checkNumber_pow2(int a) {
		if(a>1) {
			int n=a;
			for(;n%2==0;n/=2) {}
			if(n==1) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number For calculateSum : ");
		int a1=sc.nextInt();
		System.out.println(calculateSum(a1));
		System.out.println("Enter Number For calculateDifference : ");
		int a2=sc.nextInt();
		System.out.println(calculateDifference(a2));
		System.out.println("Enter Number For checkNumber_inc : ");
		int a3=sc.nextInt();
		System.out.println(checkNumber_inc(a3));
		System.out.println("Enter Number For checkNumber_pow2 : ");
		int a4=sc.nextInt();
		System.out.println(checkNumber_pow2(a4));
	}

}
