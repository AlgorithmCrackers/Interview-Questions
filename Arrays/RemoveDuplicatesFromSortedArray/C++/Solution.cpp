class Solution {
public:
    int removeDuplicates(int A[], int n) {
        if (n < 2) return n;
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (A[index] != A[i]) // only if the encountering numbering is unique
                A[++index] = A[i]; // copy that to the unique array
        }
        return index + 1; // return the length of the unique elements array
    }
}
