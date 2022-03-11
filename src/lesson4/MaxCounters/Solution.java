package lesson4.MaxCounters;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];
        int maxValue = 0;
        int maxCounterValue = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                int counterIndex = A[i] - 1;

                int counterValue = result[counterIndex];

                // If a maxCounterUpdate is "pending" (i.e. the current value hasn't been updated with the last "max counter" value)
                // we update the selected counter value to the last "max counter" value before incrementing it by 1
                if (counterValue < maxCounterValue) {
                    counterValue = maxCounterValue;
                }
                result[counterIndex] = ++counterValue;

                // We store the new maxValue to be used whenever a new "max counter" operation kicks in
                if (counterValue > maxValue) {
                    maxValue = counterValue;
                }
            }
            if (A[i] > N) {
                maxCounterValue = maxValue;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] < maxCounterValue) {
                result[i] = maxCounterValue;
            }
        }

        return result;
    }
}

class Tester {
    public static void main (String [] args) {
        System.out.println(Arrays.toString(new Solution().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4, 6, 1})));
    }
}