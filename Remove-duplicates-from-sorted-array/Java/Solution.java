import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] A) {
        int n = A.length;
        if (n < 2) return n;
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (A[index] != A[i])
                A[++index] = A[i];
        }
        return index + 1;
    }
    public static void main(String[] args) {
        int[] A = { 1, 2, 2, 3, 3 };
        removeDuplicates(A);
        System.out.println( Arrays.toString(A));
    }
}
