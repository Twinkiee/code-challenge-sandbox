package binarygap;

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
        int count = 0;
        String binaryN = Integer.toBinaryString(N);

        System.out.println(binaryN);

        char[] charArray = binaryN.toCharArray();
        boolean gap = false;
        for (int i = charArray.length - 1; i > 0; i--) {

            char c = charArray[i];

            if (c == '1') {
                gap = true;
                count = 0;
            } else if (gap && c == '0') {
                count++;
            }

            if (count > result) {
                result = count;
            }
        }

        return result;
    }

    public static void main (String[] args) {
        System.out.println(new Solution().solution(1041));
    }
}