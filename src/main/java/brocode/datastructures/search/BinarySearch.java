package brocode.datastructures.search;

public class BinarySearch {

    public static void main(String[] args) {
        int [] input= new int[] { 1, 2, 3, 4, 5 ,6,7,8};
        int target = 5;
        int valuefound = BinarySearchf(input, target);
        if (valuefound == -1) {
            System.out.println("target element not found" );
        } else {
            System.out.println("element is found at : " +valuefound );
        }
    }

    private static int BinarySearchf(int[] input, int target) {
        int low = 0;
        int high = input.length-1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = input[middle];

            System.out.println("middle is :" + middle);

            if(value < target) low = middle + 1;
            else if (value > target) high = middle -1;
            else return middle;

        }

        return -1;
    }
}
