/**
 * Task 36) Write a method to find the maximum value of an array in a given interval.
 * For example:
 * 4 2 5 5 1 3 2
 * maximum from interval index 3 - 5 is 3
 */
public class Task36 {
          public static void main(String[] args) {
            int[] a = {4, 2, 5, 5, 1, 3, 2};
            int max = findMax(a, 3, 5);
            System.out.println(max);
        }

        private static int findMax(int[] a, int startIndex, int endIndex) {
            int max = Integer.MIN_VALUE;
            for (int i = startIndex; i <= endIndex; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            return max;
        }
}
