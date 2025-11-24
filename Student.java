package src;
public class Student {
    private String id;
    private String name;
    private int[] marks;

    public Student(String id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public double getAverage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum / (double) marks.length;
    }

    public String getPerformanceCategory() {
        double avg = getAverage();
        if (avg >= 75) return "High";
        else if (avg >= 50) return "Medium";
        else return "Low";
    }

    public void printReport() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + getAverage());
        System.out.println("Performance: " + getPerformanceCategory());
        System.out.println("-----------------------------");
    }
}
