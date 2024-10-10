package ie.atu.arrays;

public class CloneArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] clone = original.clone();

        // Modify the clone
        clone[0] = 10;

        // Display both arrays
        System.out.println("Original array: " + java.util.Arrays.toString(original));
        System.out.println("Cloned array: " + java.util.Arrays.toString(clone));
    }
}
