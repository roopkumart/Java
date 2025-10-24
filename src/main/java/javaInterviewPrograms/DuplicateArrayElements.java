package javaInterviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

	public class DuplicateArrayElements {

		public static void main(String[] args) {
			String infra[] = {"Amazon","Azure","cucumber","saucelabs","Amazon","Azure","cucumber","Alibaba","Alibaba","Amazon"};
			
			System.out.println("****Brute Force****");
			
			for(int i=0;i<infra.length-1;i++)
			{
				for(int j=i+1;j<infra.length-1;j++)
				{
					if(infra[i].equals(infra[j]))
							{
						System.out.println(infra[i]);
							}
				}
			}
			System.out.println("****Hash Set & for each loop*****");
	Set<String> setData = new HashSet<String>(); 
	for(String e:infra)
	{
		if(setData.add(e)==false) 
		{
			System.out.println(e);
		}
	}

	System.out.println("*****hash map****");
	Map<String,Integer> infraMap = new HashMap<String,Integer>();
	for(String e:infra)
	{
	Integer count = infraMap.get(e);
	if(count==null)
	{
	infraMap.put(e, 1);
	}else
	{
	infraMap.put(e, ++count); 	
	}
	}
	//print all duplicate elements
	Set<Entry<String,Integer>> entryset = infraMap.entrySet();
	for(Entry<String,Integer> entry:entryset) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey());
		}
	}
		
		
	System.out.println("*****streams set and filter*****");
	Set<String> streamsSet = new HashSet<String>();
	Set<String> dupset = Arrays.asList(infra).stream().filter(e->!streamsSet.add(e)).collect(Collectors.toSet());
	System.out.println(dupset);
	System.out.println("***streams using frequency***");
	List<String> List = Arrays.asList(infra);
	Set<String> eleList = List.stream().filter(e->Collections.frequency(List,e) >1).collect(Collectors.toSet());
		System.out.println(eleList);
		}

	}

