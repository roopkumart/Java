package javaInterviewPrograms;

import java.util.Scanner;

public class CountWordsRemoveDuplicates {

	public static void main(String[] args) {
		//get input from the user
		Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String inputString =sc.nextLine();
	//count words
String[] words=inputString.split("\\s+");
int wordCount=words.length;
//Remove duplicate chars
StringBuilder result=new StringBuilder();
boolean[] seen=new boolean[256];
for(char ch:inputString.toCharArray()) {
	System.out.println(seen[ch]);
	if(!seen[ch])//condition fails if boolean is already exists
	{
		System.out.println(seen[ch]);
		seen[ch]=true;//storing boolean in boolean array
		result.append(ch);
		
	}
}
System.out.println("Number of words: "+wordCount);
System.out.println("String after removing characters: "+result.toString());

	}

}
