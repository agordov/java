public class Bubble_sort {

    public void Bubble_sort(int[] arr) {
        Bubble_sorting(arr);
    }

    public void Bubble_sorting(int[] arr) {
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
    }
}