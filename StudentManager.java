import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public boolean updateGrade(int id, double newGrade) {
        Student s = findStudentById(id);
        if (s != null) {
            s.setGrade(newGrade);
            return true;
        }
        return false;
    }
}
