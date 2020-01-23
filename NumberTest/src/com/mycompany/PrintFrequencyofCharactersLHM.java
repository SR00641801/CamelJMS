package com.mycompany;

import java.util.LinkedHashMap;

public class PrintFrequencyofCharactersLHM {
	// Function to print the characters and their 
    // frequencies in the order of their occurrence 
    static void printCharWithFreq(String str, int n) 
    { 
  
        // LinkedHashMap preserves the order in 
        // which the input is supplied 
        LinkedHashMap<Character, Integer> lhm 
            = new LinkedHashMap<Character, Integer>(); 
  
        // For every character of the input string 
        for (int i = 0; i < n; i++) { 
        	System.out.println(":::: "+str.charAt(i));
            // Get the frequency of the current character 
            Integer j = lhm.get(str.charAt(i)); 
            
            // If the character is occurring 
            // for the first time 
            if (j == null) 
                lhm.put(str.charAt(i), 1); 
  
            // Increment the frequency of the 
            // current character by 1 
            else
                lhm.put(str.charAt(i), j + 1); 
        } 
  
        // Iterate over the LinkedHashMap 
        // and print the result 
        for (Character c : lhm.keySet()) 
            System.out.print("" + c + lhm.get(c) + " "); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "geeksforgeeks"; 
        int n = str.length(); 
  
        printCharWithFreq(str, n); 
    } 
} 