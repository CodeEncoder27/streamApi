package brocode.datastructures.search;

public class LinearSearch {
    public static void main(String[] args) {
        //LinearSearch

        int a[] = {1, 2, 3, 4, 5, 9,6, 7, 8,90,89,6};
        int index =linearSearch(a, 9);
        if (index != -1){
            System.out.println("element found at index: " + index);
        } else {
            System.out.println("element  Not  found at index ");
        }
    }

    private static int linearSearch(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == value){
                return i;
            }
        }
        return -1;
    }
}
