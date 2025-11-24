package src;
import java.util.*;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showAllReports() {
        for (Student s : students) s.printReport();
    }

    public void showWeakStudents() {
        System.out.println("Weak Students (<50%):");
        for (Student s : students) {
            if (s.getPerformanceCategory().equals("Low")) {
                s.printReport();
            }
        }
    }

    public void showToppers() {
        System.out.println("Top Performers (>=75%):");
        for (Student s : students) {
            if (s.getPerformanceCategory().equals("High")) {
                s.printReport();
            }
        }
    }
}
