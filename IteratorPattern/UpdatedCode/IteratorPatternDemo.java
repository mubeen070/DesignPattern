package UpdatedCode;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        // Print all students
        System.out.println("All students:");
        namesRepository.printAllStudents();

        // Print students with names starting from "Julie"
        System.out.println("\nStudents with names starting from 'Julie':");
        namesRepository.printStudentsWithNameStartingFrom("J");
    }
}
