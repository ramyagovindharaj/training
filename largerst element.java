public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 20, 40};
        java.util.Arrays.sort(arr);  // Sort the array

        int secondLargest = arr[arr.length - 2];  
        System.out.println("Second Largest: " + secondLargest);
    }
}
