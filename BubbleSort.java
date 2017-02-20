package bubble_sort;

import java.util.Scanner;

/**
 * Created by aleksey on 20.02.17.
 */
public class BubbleSort {
    public static int[] bubbleSorting(int[] arr) {
        int i, j = 0;
        int tmp;
        boolean flag = true;
        while (flag) {
            flag = false;
            j++;
            for (i = 0; i < arr.length - j; i++) {
                if (arr[i] < arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    flag = true;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr;
        int i;
        arr = new int[10];

        Scanner scan = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            String str = scan.next();
            arr[i] = Integer.parseInt(str);
        }
        arr = bubbleSorting(arr);

        for (i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
