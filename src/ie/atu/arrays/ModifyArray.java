package ie.atu.arrays;

public class ModifyArray {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        fruits[1] = "Blueberry"; // Modifies the second element

        // Displaying modified array
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
