package InterviewSampleCode2;

import java.util.Arrays;

public class ReverseStringAndFindMax {
    public static void main(String[] args) {
        // Reverse a string
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);

        // Find the highest number in an array
        int[] numbers = {10, 5, 8, 15, 3, 20};
        int maxNumber = findMaxNumber(numbers);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Highest Number: " + maxNumber);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        return new String(charArray);
    }

    public static int findMaxNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
