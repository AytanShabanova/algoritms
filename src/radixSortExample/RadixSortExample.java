package radixSortExample;
import java.util.Arrays;
public class RadixSortExample {




        // Get maximum value in array
        static int getMax(int[] arr, int n) {
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        // Counting sort according to the digit represented by exp
        static void countingSort(int[] arr, int n, int exp) {
            int[] output = new int[n]; // output array
            int[] count = new int[10];
            Arrays.fill(count, 0);

            // Store count of occurrences in count[]
            for (int i = 0; i < n; i++) {
                int index = (arr[i] / exp) % 10;
                count[index]++;
            }

            // Change count[i] so that it now contains actual position of the digit in output[]
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Build the output array
            for (int i = n - 1; i >= 0; i--) {
                int index = (arr[i] / exp) % 10;
                output[count[index] - 1] = arr[i];
                count[index]--;
            }

            // Copy the output array to arr[], so that arr[] now contains sorted numbers
            System.arraycopy(output, 0, arr, 0, n);
        }

        // The main function to that sorts arr[] of size n using Radix Sort
        static void radixSort(int[] arr, int n) {
            // Find the maximum number to know the number of digits
            int max = getMax(arr, n);

            // Do counting sort for every digit
            // exp is 10^i where i is current digit number
            for (int exp = 1; max / exp > 0; exp *= 10) {
                countingSort(arr, n, exp);
            }
        }

        // A utility function to print an array
        static void printArray(int[] arr, int n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Driver Code
        public static void main(String[] args) {
            int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
            int n = arr.length;

            System.out.println("Before sorting:");
            printArray(arr, n);

            radixSort(arr, n);

            System.out.println("After sorting:");
            printArray(arr, n);
        }
    }


