package com.project.example.java8;
import java.util.HashMap;
import java.util.Map;

public class CountCharInString {

	public static void main(String[] args) {
		//Method 1: Count all character including space
		String input="Java Programming";
		long len=input.chars().count();
		System.out.println(len);
		
		//Method 2: count the occurrence of character
		Map<Character, Integer> characterCount = new HashMap<>();
        input.chars()
            .filter(Character::isLetterOrDigit)
            .mapToObj(c -> (char) c)
            .forEach(c -> characterCount.put(c, characterCount.getOrDefault(c, 0) + 1));
        System.out.println(characterCount);
	}

}
