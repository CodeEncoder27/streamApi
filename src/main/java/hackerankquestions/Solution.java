package hackerankquestions;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] intArray) {
        if (intArray.length == 0) { // No elements at all.
            return -99; // So the smallest positive missing integer is 1.
        }
        Arrays.sort(intArray);
        // System.out.println(Arrays.toString(intArray)); // Temporarily uncomment?
        if (intArray[0] >= 2) { // Smallest positive int is 2 or larger.
            return 1; // Meaning smallest positive MISSING int is 1.
        }
        if (intArray[intArray.length - 1] <= 0) { // Biggest int is 0 or smaller.
            return 1; // Again, smallest positive missing int is 1.
        }
        int smallestPositiveMissing = 1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == smallestPositiveMissing) {
                smallestPositiveMissing++;
            } // ^^ Stop incrementing if intArray[i] > smallestPositiveMissing. ^^
        }   // Because then the smallest positive missing integer has been found:
        return smallestPositiveMissing;
    }
    public static void main(String[] args) {
        System.out.println("Hello Codility Demo Test for Java, B");
        int[] array1 = {-1, -3};
        System.out.println(solution(array1));
        int[] array2 = {3, -1};
        System.out.println(solution(array2));
    }
}
