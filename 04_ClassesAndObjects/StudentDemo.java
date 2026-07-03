/*
 * CONCEPT: Class & Object
 *
 * Class  = Blueprint / Template  (e.g., "Student" defines what a student has and does)
 * Object = Real thing made from the blueprint  (e.g., "s1" is an actual student)
 *
 * A class has:
 *   - Attributes (variables)  → what it HAS
 *   - Methods   (functions)   → what it DOES
 */

public class StudentDemo {
    public static void main(String[] args) {
        // Creating objects (real students) from the Student class blueprint
        Student s1 = new Student();  // new keyword creates an object
        Student s2 = new Student();

        // Setting attributes for object s1
        s1.name = "Alice";
        s1.age = 15;
        s1.grade = "10th";

        // Setting attributes for object s2
        s2.name = "Bob";
        s2.age = 16;
        s2.grade = "11th";

        // Calling methods on objects
        System.out.println("=== Student 1 ===");
        s1.displayInfo();

        System.out.println("\n=== Student 2 ===");
        s2.displayInfo();
    }
}

// Student is a blueprint (class)
class Student {
    // Attributes (data) - what a student HAS
    String name;
    int age;
    String grade;

    // Method (behavior) - what a student DOES
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
