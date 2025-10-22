package javaInterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatCharsInSentance {
	public static void main(String[] args) {
		//getCharOccurance("My name is roopkumar",'m');
		printDuplicateCharacter("bitbucketbig bucket");
		
		}
	public static void getCharOccurance(String str,char val) {
		int count =0;
		for(char ch:str.toCharArray()) {
			if(ch==val) {
				count++;
			}
		}
		System.out.println("char occurance for "+val+":"+count);
	}


	public static void printDuplicateCharacter(String str)
	{
		if(str==null)
		{
			System.out.println("null string");
			return;
		}
		if(str.isEmpty()){
			System.out.println("empty string");
			return;
		}
		if(str.length()==1){
			System.out.println("single char string");
		}
		char words[] =str.toCharArray();
		//create a map with char and integer
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		for(Character ch:words){
			
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		//print the map
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry:entrySet) {
		if(entry.getValue()==1) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}	
		}
	}
}
