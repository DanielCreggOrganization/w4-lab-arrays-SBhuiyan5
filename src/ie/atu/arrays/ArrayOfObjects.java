package ie.atu.arrays;

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Array of Strings (which are objects in Java)
        String[] names = {"Alice", "Bob", "Charlie"};

        // Array of custom objects
        Student[] students = new Student[2];

        students[0] = new Student("Dave", 20);
        students[1] = new Student("Eva", 22);

        for (Student student : students) {
            System.out.println(student.getName() + " is " + student.getAge() + " years old.");
        }
    }
}

class Student {
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}