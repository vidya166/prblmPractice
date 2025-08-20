
import java.util.Scanner;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[2 * n];

        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[i + n] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        ConcatenationOfArray solution = new ConcatenationOfArray();
        int[] result = solution.getConcatenation(nums);

        System.out.print("Concatenated array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
