package ie.atu.arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        printArray(numbers);

        int[] squaredNumbers = squareArray(numbers);
        System.out.println("Squared array: " + java.util.Arrays.toString(squaredNumbers));
    }

    // Method to print array elements
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to return a new array with squared elements
    public static int[] squareArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        return result;
    }
}
