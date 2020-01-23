package com.mycompany;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValueInHashSet {
	public static void main(String[] args) {
		
		Set<Integer>  hashSet = new HashSet<Integer>();
		hashSet.add(4);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(3);
		
		for(int noOfItems :hashSet)
		System.out.println("Unique elements in hashset::: "+noOfItems);
		
		//To print duplicate values in Hashset
		//make a reference of a class
		HashSet<Book> setOfBook = new HashSet<Book>();
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		
		setOfBook.add(b1);
		setOfBook.add(b2);
		
		for(Book noOfItems : setOfBook)
			System.out.println(noOfItems);
			
		System.out.println(setOfBook);
		
	}
	
	

}
