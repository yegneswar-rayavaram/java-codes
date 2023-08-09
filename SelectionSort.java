import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SelectionSortArray(n, arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void SelectionSortArray(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int maxelement = getMaxIndex(arr, 0, n - i - 1);
            int temp = arr[maxelement];
            arr[maxelement] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

}
