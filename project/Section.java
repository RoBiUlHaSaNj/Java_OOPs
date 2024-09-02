
import java.util.ArrayList;
import java.util.List;

public class Section {
    private String sectionId;
    private List<Student> students;
    private static final int MAX_STUDENTS = 3;

    public Section(String sectionId) {
        this.sectionId = sectionId;
        this.students = new ArrayList<>();
    }

    public String getSectionId() {
        return sectionId;
    }

    public boolean addStudent(Student student) {
        if (students.size() >= MAX_STUDENTS) {
            System.out.println("Section " + sectionId + " is full. Cannot add more students.");
            return false;
        }

        if (students.contains(student)) {
            System.out.println("Student " + student.getName() + " is already in section " + sectionId);
            return false;
        }

        students.add(student);
        System.out.println(student.getName() + " has been added to section " + sectionId);
        return true;
    }

    public boolean removeStudent(Student student) {
        if (students.remove(student)) {
            System.out.println(student.getName() + " has been removed from section " + sectionId);
            return true;
        } else {
            System.out.println("Student " + student.getName() + " not found in section " + sectionId);
            return false;
        }
    }

    public void showSectionInfo() {
        System.out.println("Section: " + sectionId + " (Students enrolled: " + students.size() + "/" + MAX_STUDENTS + ")");
        for (Student student : students) {
            System.out.println(" - " + student.getName() + " (ID: " + student.getId() + ")");
        }
    }

    public boolean isFull() {
        return students.size() >= MAX_STUDENTS;
    }

    public void markAttendance(String date) {
        System.out.println("Marking attendance for section " + sectionId + " on " + date + ":");
        for (Student student : students) {
            System.out.println(student.getName() + " is present.");
        }
    }
}
