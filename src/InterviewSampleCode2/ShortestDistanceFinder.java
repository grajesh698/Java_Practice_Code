package InterviewSampleCode2;

import java.util.Arrays;

public class ShortestDistanceFinder {

	public static int shortestDistance(String str, String word1, String word2) {
		String[] words = str.split("\\s+");

		System.out.println(Arrays.toString(words));
		
		if (!Arrays.asList(words).contains(word1) || !Arrays.asList(words).contains(word2)) {
			return -1;
		}

		int index1 = -1;
		int index2 = -1;
		int minDistance = Integer.MAX_VALUE;

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				index1 = i;
				if (index2 != -1) {
					minDistance = Math.min(minDistance, Math.abs(index1 - index2));
				}
			} else if (words[i].equals(word2)) {
				index2 = i;
				if (index1 != -1) {
					minDistance = Math.min(minDistance, Math.abs(index1 - index2));
				}
			}
		}

		return minDistance;
	}

	public static void main(String[] args) {
		String inputString = "There is a sample document in word format";
		String word1 = "is";
		String word2 = "a";

		int distance = shortestDistance(inputString, word1, word2);

		if (distance != -1) {
			System.out.println("The shortest distance between \"" + word1 + "\" and \"" + word2 + "\" is: " + distance);
		} else {
			System.out.println("One or both words not found in the string.");
		}
	}
}
