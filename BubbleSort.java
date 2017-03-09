package bubbleSort;
import java.lang.*;
import java.util.Scanner;

public class BubbleSort {
    private static < E extends Comparable<E>> void bubbleSort(E[] inputArray) {
        int i, j;
        E tmp;
        for (i = 0; i < inputArray.length - 1; i++)
            for (j = 0; j < inputArray.length - 1; j++)
                if (inputArray[j].compareTo(inputArray[j + 1]) > 0) {
                    tmp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = tmp;
                }
    }

    private static <E> void printArray(E[] inputArray) {
        for (E elem : inputArray)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr;
        int i;
        arr = new Integer[10];
        Scanner scan = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            String str = scan.next();
            arr[i] = Integer.parseInt(str);
        }
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
}
