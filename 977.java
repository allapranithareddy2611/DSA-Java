import java.util.*;

class Solution {

    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];

        int start = 0;
        int end = A.length - 1;
        int resIndex = A.length - 1;

        while (start <= end) {
            if (A[start] * A[start] > A[end] * A[end]) {
                res[resIndex--] = A[start] * A[start];
                start++;
            } else {
                res[resIndex--] = A[end] * A[end];
                end--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = {-4, -1, 0, 3, 10};

        int[] result = new Solution().sortedSquares(A);

        System.out.println(Arrays.toString(result));
    }
}