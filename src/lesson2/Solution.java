package lesson2;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;

class Solution {
    public int[] solution(int[] A, int K) {

        if (A.length == 0) {
            return A;
        }

        int[] result = new int[A.length];

        int numberOfRotations = K % A.length;
        int[] firstPart = Arrays.copyOf(A, A.length - numberOfRotations);
        int[] secondPart = Arrays.copyOfRange(A, A.length - numberOfRotations, A.length);
        int fal = firstPart.length;        //determines length of firstArray
        int sal = secondPart.length;   //determines length of secondArray
        System.arraycopy(secondPart, 0, result, 0, sal);
        System.arraycopy(firstPart, 0, result, sal, fal);
        return result;
    }

    public static void main (String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{3, 8, 9, 7, 6}, 3)));
    }
}