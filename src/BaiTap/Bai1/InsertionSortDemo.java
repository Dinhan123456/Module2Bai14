import java.util.Scanner;

public class InsertionSortDemo {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are greater than key,
               to one position ahead of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println("Buoc " + i + ":");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so phan tu cua mang:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap gia tri cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang ban dau:");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Mang sau khi sap xep:");
        printArray(arr);
    }
}
