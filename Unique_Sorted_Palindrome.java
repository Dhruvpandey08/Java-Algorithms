import java.util.Arrays;
import java.util.Scanner;

public class Unique_Sorted_Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        generateSortedUniquePermutations(inputString);
    }

    public static void generateSortedUniquePermutations(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr); // Sort the character array to ensure unique permutations

        boolean[] used = new boolean[arr.length];
        char[] result = new char[arr.length];
        permute(arr, used, result, 0);
    }

    public static void permute(char[] arr, boolean[] used, char[] result, int level) 
    {
        if (level == arr.length) {
            printArray(result);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[level] = arr[i];
                permute(arr, used, result, level + 1);
                used[i] = false;
                while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                    i++; // Skip duplicates to avoid duplicate permutations
                }
            }
        }
    }

    public static void printArray(char[] arr) {
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
