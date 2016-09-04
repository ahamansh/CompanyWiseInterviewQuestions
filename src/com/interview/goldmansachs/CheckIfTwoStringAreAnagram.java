package com.interview.goldmansachs;

/**
 * What is Anagram : Basically string formed by permutation of char of first string. 
 * a word, phrase, or name formed by rearranging the letters of another, 
 * such as spar, formed from rasp
 * 
 * Fundamental Algo:
 *  1. Create an int Array of 256 char to hold all value of characteres, this will help make a counter ds.
 *  2. Traverse first string char by char and increment the counter arrays.
 *  3. Traverse second array and decrement the count for the counted previously.
 *  4. After decrementing check if the value is < 0 then break and return false. 
 * @author Anshul Sharma
 *
 */
public class CheckIfTwoStringAreAnagram {

	public static void main(String[] args) {
		
		String s1 = "String1";
		String s2 = "1triSng";
		System.out.println(isAnagram(s1, s2));
		
		s2 = "nString";
		System.out.println(isAnagram(s1, s2));
	}
	
	
	public static boolean isAnagram(String s1,String s2){
		
		// To make the program case insensitive uncomment below lines
		//s1 = s1.toLowerCase();
		//s2 = s2.toLowerCase();
		
		int[] allChars = new int[256]; // Creating array to hold all possible chars which in our encoding is 256
		
		char[] s1CharArray = s1.toCharArray();
		
		for(char  c : s1CharArray)
			allChars[c] ++;
		
		for(int i = 0; i < s2.length();i++){
			
			int currChar = (int) s2.charAt(i);
			
			if(--allChars[currChar] < 0)
				return false;
					
		}
		
		return true;
		
	}

}
