package bubbleSortExample;

public class BubbleSortExample {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;


        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Elementləri dəyişdiririk
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Sıralanmamış massiv:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sıralanmış massiv:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
