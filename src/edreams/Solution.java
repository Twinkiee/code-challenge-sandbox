package edreams;

// Java Program to print the Diagonals of a Matrix
class Solution {

 
    // Driver code
    public static void main(String args[])
    {
        char a[][] = { { 'a', '2', '3', '4' },
                       { '5', '6', '7', '8' },
                       { '1', '2', '3', '4' },
                       { '5', '6', '7', '8' } };
 

        for (int i = 0; i <= a.length * 2; i++) {
            int x = i;
            int k = 0;
            int max = i;
            if (i >= a.length) {
                x = a.length - 1;
                k = i - a.length + 1;
                max = x;
            }
            for (; k <= max; k++) {
                System.out.println(a[x--][k]);
            }
        }
    }
}
 