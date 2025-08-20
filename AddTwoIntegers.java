class Solution {
    public int sum(int num1, int num2) {
        int[] A = new int[] {num1, num2};
        int[] suffixSum = new int[A.length+2];
        for (int i = A.length; i >= 1; i--) {
            suffixSum[i] = suffixSum[i+1] + A[i-1];
        }
        return suffixSum[1];
    }
}
