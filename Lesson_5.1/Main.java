import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Integer> grades1 = List.of(5, 4, 3);
        List<Integer> grades2 = List.of(2, 2, 3);
        List<Integer> grades3 = List.of(5, 5, 5);
        List<Integer> grades4 = List.of(3, 3, 2);

        Student s1 = new Student("Анна", "A-1", 1, grades1);
        Student s2 = new Student("Петр", "A-1", 1, grades2);
        Student s3 = new Student("Мария", "B-2", 2, grades3);
        Student s4 = new Student("Иван", "B-2", 2, grades4);


        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println("=== Список всех студентов ===");
        printAllStudents(students);


        removeBadStudents(students);
        System.out.println("\n=== После удаления двоечников ===");
        printAllStudents(students);


        promoteStudents(students);
        System.out.println("\n=== После перевода на следующий курс ===");
        printAllStudents(students);


        System.out.println("\n=== Студенты на 2-м курсе ===");
        printStudents(students, 2);
    }


    public static void printAllStudents(Set<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }


    public static void removeBadStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            }
        }
    }


    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }


    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
