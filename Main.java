package src;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n--- Student Performance System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Reports");
            System.out.println("3. Show Weak Students");
            System.out.println("4. Show Toppers");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.next();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Number of subjects: ");
                    int n = sc.nextInt();

                    int[] marks = new int[n];
                    System.out.println("Enter Marks:");
                    for (int i = 0; i < n; i++) marks[i] = sc.nextInt();

                    service.addStudent(new Student(id, name, marks));
                    break;

                case 2:
                    service.showAllReports();
                    break;

                case 3:
                    service.showWeakStudents();
                    break;

                case 4:
                    service.showToppers();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
