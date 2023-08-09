import java.util.*;

public class CycleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        CycleSortArrayCase1(n, arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    // case1 is when the elemnts in the array are first n natural numbers
    public static void CycleSortArrayCase1(int n, int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    // case2 is when the elements in the array are first n whole numbers
    public static void CycleSortArrayCase2(int n, int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
}
