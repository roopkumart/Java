package javaInterviewPrograms;

import java.util.Scanner;

public class VowelsCount {
public static void vowelConsonantCount() {
	
}
	public static void main(String[] args) {
	//Initialize the counters	
		int vowelCount=0;
		int consonantCount=0;
//Define the vowels
		String vowels="aeiou";
		//get the input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String inputString =sc.nextLine();
		//converting to lowerCase
		inputString=inputString.toLowerCase();
		//Iterating each character in the String
		for(char ch : inputString.toCharArray()) {
			if(Character.isLetter(ch)) {
				if(vowels.indexOf(ch)!=-1) {
					vowelCount++;
				}else {
					consonantCount++;
				}
			}
		}
		System.out.println("Number of vowels: "+vowelCount);
		System.out.println("Number of consonantCount: "+consonantCount);	
	}
}
