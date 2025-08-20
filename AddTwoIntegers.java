public class AddTwoIntegers {
    public int sum(int num1, int num2) {
        int[] A = new int[] {num1, num2};
        int[] suffixSum = new int[A.length + 2];
        for (int i = A.length; i >= 1; i--) {
            suffixSum[i] = suffixSum[i + 1] + A[i - 1];
        }
        return suffixSum[1];
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integers as command-line arguments.");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            AddIntegers adder = new AddIntegers();
            int result = adder.sum(num1, num2);
            System.out.println("Sum is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
