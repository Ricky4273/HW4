public class recursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 9, 11, 15, 19, 21}; // array of numbers
        int find = 11; // number you want to find
        int index = binarySearch(arr, find); // binary search to find number
        if (index != -1) { // Checks if number is found and prints
            System.out.println(find + " found at index " + index);
        } else {
            System.out.println(find + "not found in array");
        }
    }
    public static int binarySearch(int[] arr, int find) { // method to initiate binary search
        return binarySearchFinder(arr, find,0, arr.length - 1);
    }
    private static int binarySearchFinder(int[] arr, int find, int low, int high) { // Recursive method for binary search
        if (high >= low) { // makes sure the search range is valid
            int middlePosition = low + (high - low) / 2;
            int middleNumber = arr[middlePosition];

            if (find == middleNumber) { // returns the index if the middle number is the number you want to find
                return middlePosition;
            }
            if (find < middleNumber) { // searches left half if the number you want to find is smaller than the middle number
                return binarySearchFinder(arr, find, low, middlePosition - 1);
            } else {  // searches right half if the number you want to find is bigger than the middle number
                return binarySearchFinder(arr, find, middlePosition + 1, high);
            }
        }
        return -1; // returns -1 if number is not found in the array
    }
}