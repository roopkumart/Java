package javaInterviewPrograms;

import java.util.Scanner;

public class SumAverage {
public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements in array: ");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter the elementts of array : ");
for (int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int sum=0;
for(int num:arr) {
	sum+=num;
}
double average=sum/n;
System.out.println("sum of elements: "+sum);
System.out.println("average of elements: "+average);
}
}

