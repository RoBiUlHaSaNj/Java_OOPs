import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Course {
    String courseName;
    Instructor instructor;
    Map<String, Integer> sections; 
    private List<Quiz> quizzes;
    
    public Course(String courseName, Instructor instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.quizzes = new ArrayList<>();
        this.sections = new HashMap<>();
        this.sections.put("A", 0);
        this.sections.put("B", 0);
        this.sections.put("C", 0);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructor.getName();
    }

    public void showSections() {
        System.out.println("Sections:");
        for (Map.Entry<String, Integer> entry : sections.entrySet()) {
            System.out.println("Section " + entry.getKey() + " (Students enrolled: " + entry.getValue() + ")");
        }
    }
    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }
    
    
    public boolean enrollStudent(String section) {
        if (sections.containsKey(section)) {
            if (sections.get(section) < 3) { // Max 3 students per section
                sections.put(section, sections.get(section) + 1);
                return true;
            } else {
                System.out.println("No space available in Section " + section);
                return false;
            }
        } else {
            System.out.println("Invalid section.");
            return false;
        }
    }
}
