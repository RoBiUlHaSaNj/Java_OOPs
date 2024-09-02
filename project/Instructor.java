
import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class Instructor extends User {
    List<Course> courses;
    Map<String, List<Student>> classStudentMap;
    Map<String, Map<String, String>> attendanceRecords; 
    String qualifications;  
    String contactInformation; 
    String contactNumber;
    List<Quiz> quizzes;
    List<Lesson> lessons;

    public Instructor(String name, String email, String password, String qualifications, String contactInformation,String contactNumber) {
        super(name, email, password);
        this.courses = new ArrayList<>();
        this.classStudentMap = new HashMap<>();
        this.attendanceRecords = new HashMap<>();
        this.qualifications = qualifications; 
        this.contactInformation = contactInformation; 
        this.contactNumber = contactNumber;
        this.quizzes = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }

    //Quiz lesson 
    public void createQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    public void createLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public void viewQuizzes() {
        for (int i = 0; i < quizzes.size(); i++) {
            System.out.println((i + 1) + ". " + quizzes.get(i).getTitle());
        }
    }

    public void viewLessons() {
        for (int i = 0; i < lessons.size(); i++) {
            System.out.println((i + 1) + ". " + lessons.get(i).getTitle());
        }
    }
    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }
    public List<Quiz> getQuizzes() {
        return quizzes;
    }
    
    
    
 // Getter and Setter for Qualifications
    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    // Getter and Setter for Contact Information
    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    
    //course
    public List<Course> getCourses() {
        return courses;
    }

 
    // Method to add a course
    public void addCourse(Course course) {
        courses.add(course);
        classStudentMap.put(course.getCourseName(), new ArrayList<>());
    }
    
    // Method to view courses
    public void viewCourses() {
        System.out.println("Courses managed by " + getName() + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    // Method to add a student to a course
    public void addStudentToCourse(String courseName, Student student) {
        List<Student> students = classStudentMap.get(courseName);
        if (students != null) {
            students.add(student);
            System.out.println("Student " + student.getName() + " added to " + courseName);
        } else {
            System.out.println("Course not found.");
        }
    }

    // Method to remove a student from a course
    public void removeStudentFromCourse(String courseName, String studentId) {
        List<Student> students = classStudentMap.get(courseName);

        if (students != null && !students.isEmpty()) {
            boolean studentFound = false;

            for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
                Student student = iterator.next();
                if (student.getId().equals(studentId)) {
                    iterator.remove();
                    studentFound = true;
                    System.out.println("Student with ID " + studentId + " removed from " + courseName);
                    break;
                }
            }

            if (!studentFound) {
                System.out.println("Student with ID " + studentId + " not found in " + courseName);
            }
        } else {
            System.out.println("Course not found or no students enrolled in " + courseName);
        }
    }

    
    
    // Method to mark attendance
    public void markAttendance(String courseName, String studentId, String status) {
        Map<String, String> attendance = attendanceRecords.computeIfAbsent(courseName, k -> new HashMap<>());
        attendance.put(studentId, status);
        System.out.println("Attendance marked for student " + studentId + " in " + courseName + " as " + status);
    }

    // Method to view attendance
    public void viewAttendance(String courseName) {
        Map<String, String> attendance = attendanceRecords.get(courseName);
        if (attendance != null) {
            System.out.println("Attendance for course " + courseName + ":");
            for (Map.Entry<String, String> entry : attendance.entrySet()) {
                System.out.println("Student ID: " + entry.getKey() + " - Status: " + entry.getValue());
            }
        } else {
            System.out.println("No attendance records found for " + courseName);
        }
    }

    // Method to generate attendance report for a specific student
    public void generateStudentAttendanceReport(String studentId) {
        System.out.println("Attendance Report for Student ID: " + studentId);
        for (Map.Entry<String, Map<String, String>> courseEntry : attendanceRecords.entrySet()) {
            String courseName = courseEntry.getKey();
            Map<String, String> attendance = courseEntry.getValue();
            if (attendance.containsKey(studentId)) {
                System.out.println(courseName + ": " + attendance.get(studentId));
            }
        }
    }

    
    // Method to generate attendance report for a class
    public void generateClassAttendanceReport(String courseName) {
        System.out.println("Attendance Report for Course: " + courseName);
        viewAttendance(courseName);
    }

    // Method to view profile
    public void viewProfile() {
        System.out.println("Instructor Profile:");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Qualifications: " + qualifications);
        System.out.println("Contact Information: " + contactInformation);
        viewCourses(); 
    }
}

