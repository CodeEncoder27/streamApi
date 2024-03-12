package brocode.datastructures.sorting;

import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {

        int[] arr = {6, 7 , 9 , 8, 10, 11, 12, 13, 14, 15,4,3,0};

        System.out.println(arr);

        selectionSort(arr);

    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
