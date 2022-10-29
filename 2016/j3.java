//CCC 2016 J3 Hidden Palendrome

import java.util.*;
import java.io.*;

public class Main {
  	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
   		String word = input.next();

		int longestPalindrome = searchWord(word);
		System.out.println(longestPalindrome);
	}

	public static int searchWord(String word) {
		int longest = 0;
		String current = "";
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = word.length(); j > i; j--) {
				current = word.substring(i,j);
				if (isPalindrome(current)) {
					if (current.length() > longest) {
						longest = current.length();
					}
				}
			}
		}
		return longest;
	}

	public static boolean isPalindrome(String word) {
		String originalWord = word;
		String reversedWord = "";
		
		for (int i = originalWord.length(); i > 0; i--) {
			reversedWord = reversedWord + word.charAt(i-1);
		}
		if (reversedWord.equals(originalWord)) {
			return true;
		} else {
			return false;
		}
	}
}
