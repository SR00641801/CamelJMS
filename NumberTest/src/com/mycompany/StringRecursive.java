package com.mycompany;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRecursive {
	public static void main(String[] args) throws IOException {

		/*
		 * String s="snehangshu";
		 * 
		 * char[] c=s.toCharArray();
		 * 
		 * HashMap<Character,Integer> map=new HashMap();
		 * 
		 * 
		 * for(char count :c) { if(map.containsKey(count)) { map.put(count,
		 * map.get(count)+1); } else { map.put(count, 1); } }
		 * 
		 * for(Map.Entry<Character, Integer> entry:map.entrySet()) {
		 * System.out.println(entry.getKey()+""+entry.g); }
		 */

		
		  char[] arrName;
		  
		  String name = "snehangshuh"; 
		  int count = 0; 
		  arrName = name.toCharArray();
		  
		  for (int i = 0; i < arrName.length; i++)
		  { 
			  for (int j = i+1; j <arrName.length; j++)
		  
		   {
		  
		  if (name.charAt(i) == name.charAt(j)) 
		  { 
			  System.out.println(arrName[i]);
			  count++;
		  }
		  } if(count!=0)
			  System.out.println("Number of equal occurences of "+ arrName[i] + count); 
			  }
			  } 
	}

/*
 * String ch; BufferedReader br=new BufferedReader(new
 * InputStreamReader(System.in)); System.out.print("Enter the Statement:");
 * ch=br.readLine(); int count=0,len=0; do { try { char name[]=ch.toCharArray();
 * len=name.length; count=0; for(int j=0;j<len;j++) {
 * if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=
 * 123))) count++; } if(count!=0)
 * System.out.println(name[0]+" "+count+" Times"); ch=ch.replace(""+name[0],"");
 * } catch(Exception ex){} } while(len!=1); }
 * 
 * }
 */