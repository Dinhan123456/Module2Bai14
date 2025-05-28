public class InsertionSortExample {
    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        System.out.println("Trước khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        insertionSort(arr);
        System.out.println("\nSau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
