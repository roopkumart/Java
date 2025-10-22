package javaInterviewPrograms;

import java.util.HashMap;

public class LongestSubString {
public static int LengthOfLongestSubString(String str) {
	int start=0;
	int maxLength=0;
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(int end=0;end<str.length();end++){
	char curr=str.charAt(end);//a
	if(map.containsKey(curr)) {//if char if repeating
		start=Math.max(start, map.get(curr)+1);//1
	}
	map.put(curr,end);//a=0;b=1;c=2;
	maxLength=Math.max(maxLength,end-start+1);
		}
	return maxLength;
}
	
	public static void main(String[] args) {
		String input="abcabcbb";
		int MaxLen=LengthOfLongestSubString(input);
		System.out.println(MaxLen);

	}

}
