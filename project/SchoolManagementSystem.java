package dsdsds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolManagementSystem {
    public static Scanner scanner = new Scanner(System.in);
    public static List<User> users = new ArrayList<>();
    public static List<Course> courses = new ArrayList<>();
    public static List<Lesson> lessons = new ArrayList<>();
    public static List<Quiz> quizzes = new ArrayList<>();

    public static void main(String[] args) {
        initializeSystem();
        chooseUserType();
    }

    public static void initializeSystem() {
        // Initialize instructors
        Instructor rakib = new Instructor("Md. Rakibul Islam", "rakib@instructor.com", "pass", "PhD in Computer Science", "Mon-Fri 9AM-5PM", "0215645");
        Instructor joydwio = new Instructor("Joydip", "joydwio@instructor.com", "pass", "MSc in Computer Science", "Mon-Fri 10AM-6PM", "545106");
        
        
        Instructor rakib1 = new Instructor("Md. Rakibul1 Islam", "rakib1@instructor.com", "pass", "PhD in Computer Science", "Mon-Fri 9AM-5PM", "0215645");
        Instructor rakib2 = new Instructor("Md. Rakibul2 Islam", "rakib2@instructor.com", "pass", "PhD in Computer Science", "Mon-Fri 9AM-5PM", "0215645");
        Instructor rakib3 = new Instructor("Md. Rakibul3 Islam", "rakib3@instructor.com", "pass", "PhD in Computer Science", "Mon-Fri 9AM-5PM", "0215645");
        Instructor rakib4 = new Instructor("Md. Rakibul4 Islam", "rakib4@instructor.com", "pass", "PhD in Computer Science", "Mon-Fri 9AM-5PM", "0215645");
       
        
        users.add(rakib);
        users.add(rakib1);
        users.add(rakib2);
        users.add(rakib3);
        users.add(rakib4);
        users.add(joydwio);

        // Initialize courses
        Course course1 = new Course("CSE 111 Computer Fundamentals", rakib);
        Course course2 = new Course("CSE 123 OOP", joydwio);
        Course course3 = new Course("CSE 1111 Computer Fundamentals", rakib1);
        Course course4 = new Course("CSE 11111 Computer Fundamentals", rakib2);
        Course course5 = new Course("CSE 111111 Computer Fundamentals", rakib3);
        Course course6 = new Course("CSE 1111111 Computer Fundamentals", rakib4);
        Course course7 = new Course("CSE 11111111 Computer Fundamentals", rakib1);
        Course course8 = new Course("CSE 1111111111 Computer Fundamentals", rakib2);
        Course course9 = new Course("CSE 11111111111 Computer Fundamentals", rakib3);
        Course course10 = new Course("CSE 111111111111 Computer Fundamentals", rakib4);

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        courses.add(course5);
        courses.add(course6);
        courses.add(course7);
        courses.add(course8);
        courses.add(course9);
        courses.add(course10);

        // Initialize students
        Student student1 = new Student("S001", "Sayem", "sayem@gmail.com", "spass");
        Student student2 = new Student("S002", "Robiul", "2", "2");
        Student student3 = new Student("S003", "Robiul", "3", "3");
        Student student4 = new Student("S004", "Robiul", "4", "4");
        Student student5 = new Student("S005", "Robiul", "5", "5");
        Student student6 = new Student("S006", "Robiul", "6", "6");
        Student student7 = new Student("S007", "Robiul", "7", "7");
        Student student8 = new Student("S008", "Robiul", "8", "8");
        Student student10 = new Student("S009", "Robiul", "9", "9");
        Student student9 = new Student("S010", "Robiul", "10", "10");
        Student student11 = new Student("S011", "Robiul", "11", "11");
        
        
        
        
        users.add(student10);
        users.add(student11);
        users.add(student9);
        users.add(student8);
        users.add(student7);
        users.add(student6);
        users.add(student5);
        users.add(student4);
        users.add(student3);     
        users.add(student1);
        users.add(student2);

        // Add a lesson
        Lesson lesson1 = new Lesson("Introduction to Java");
        lesson1.addMaterial("Video: Java Overview");
        lesson1.addMaterial("PDF: Java Basics");
        
        lessons.add(lesson1);
        
        // Add a quiz
        Quiz quiz1 = new Quiz("Java Basics Quiz");
        quiz1.addQuestion(new Question("What was the original name of Mickey Mouse?", List.of("Mortimer Mouse", "The Rat", "Marvin Mouse", "Marshall Mouse"), 1));
        quiz1.addQuestion(new Question("Which superhero was played by Ryan Reynolds in a 2016 film?", List.of("Deadpool", "Black Panther", "Ant-Man", "Hawk"), 1));
        rakib.createQuiz(quiz1);
        quizzes.add(quiz1);
    }

    public static void chooseUserType() {
        System.out.println("---------------------------------------");
        System.out.println("Are you a Student or Instructor?");
        System.out.println("1. Student");
        System.out.println("2. Instructor");
        System.out.println("Enter choice (1 or 2): ");
        System.out.println("---------------------------------------");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            loginStudent();
        } else if (choice == 2) {
            loginInstructor();
        } else {
            System.out.println("Invalid choice. Returning to user selection...");
            chooseUserType(); // Recursive call to return to the user selection
        }
    }

    private static void loginStudent() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = authenticateUser(email, password);

        if (user instanceof Student) {
            studentMenu((Student) user);
        } else {
            System.out.println("Invalid email or password. Returning to user selection...");
            chooseUserType(); // Redirect back to user type selection
        }
    }

    private static User authenticateUser(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    private static void loginInstructor() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = authenticateUser(email, password);

        if (user instanceof Instructor) {
            instructorMenu((Instructor) user);
        } else {
            System.out.println("Invalid email or password. Returning to user selection...");
            chooseUserType(); // Redirect back to user type selection
        }
    }

    public static void studentMenu(Student student) {
        while (true) {
            System.out.println("Welcome, " + student.getName());
            System.out.println("1. Enroll in a course");
            System.out.println("2. View enrolled courses");
            System.out.println("3. View available quizzes");
            System.out.println("4. Take a quiz");
           System.out.println("5. Play game");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    showAvailableCourses();
                    System.out.print("Enter the name of the course you want to enroll in: ");
                    String courseName = scanner.nextLine();
                    Course course = findCourseByName(courseName);
                    if (course != null) {
                        student.enrollCourse(course);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 2:
                    student.viewCourses();
                    break;
                case 3:
                    showAvailableQuizzes();
                    break;
                case 4:
                    takeQuiz(student);
                    break;
                case 5:
                    playGames(student);
                    break;
                case 6:
                    logout();
                    return; // Exit menu loop
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void instructorMenu(Instructor instructor) {
        while (true) {
            System.out.println("Welcome, " + instructor.getName());
            System.out.println("1. View courses");
            System.out.println("2. Add a course");
            System.out.println("3. Manage students");
            System.out.println("4. Create a quiz");
            System.out.println("5. View all quizzes");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    showAvailableCourses();
                    break;
                case 2:
                    addCourse(instructor);
                    break;
                case 3:
                    manageStudents(instructor);
                    break;
                case 4:
                    createQuiz(instructor);
                    break;
                case 5:
                    showAvailableQuizzes();
                    break;
                case 6:
                    logout();
                    return; // Exit menu loop
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

   public static Course findCourseByName(String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().trim().equalsIgnoreCase(courseName.trim())) {
                return course;
            }
        }
        return null; // Return null if course not found
    }

    private static void showAvailableCourses() {
        System.out.println("Available Courses:");
        int index = 1;
        for (Course course : courses) {
            System.out.println(index + ". " + course.getCourseName() + " (Instructor: " + course.getInstructorName() + ")");
            index++;
        }
    }

    private static void showAvailableQuizzes() {
        System.out.println("Available Quizzes:");
        for (int i = 0; i < quizzes.size(); i++) {
            System.out.println((i + 1) + ". " + quizzes.get(i).getTitle());
        }
    }

    private static void takeQuiz(Student student) {
        if (quizzes.isEmpty()) {
            System.out.println("No quizzes available.");
            return;
        }

        System.out.print("Enter quiz number to take: ");
        int quizIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (quizIndex > 0 && quizIndex <= quizzes.size()) {
            Quiz selectedQuiz = quizzes.get(quizIndex - 1);
            student.takeQuiz(selectedQuiz); // Assuming takeQuiz() method is implemented in the Student class
        } else {
            System.out.println("Invalid quiz number.");
        }
    }

    private static void logout() {
        System.out.println("Logging out...");
        chooseUserType(); // Redirect to chooseUserType after logging out
    }

    private static void addCourse(Instructor instructor) {
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        Course newCourse = new Course(courseName, instructor);
        courses.add(newCourse);
        instructor.addCourse(newCourse);
        System.out.println("Course " + courseName + " added successfully.");
    }

    private static void manageStudents(Instructor instructor) {
        System.out.println("1. Add Student to Course");
        System.out.println("2. Remove Student from Course");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();
            System.out.print("Enter student ID to add: ");
            String studentId = scanner.nextLine();
            Student student = findStudentById(studentId);
            if (student != null) {
                instructor.addStudentToCourse(courseName, student);
            } else {
                System.out.println("Student not found.");
            }
        } else if (choice == 2) {
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();
            System.out.print("Enter student ID to remove: ");
            String studentId = scanner.nextLine();
            instructor.removeStudentFromCourse(courseName, studentId);
        } else {
            System.out.println("Invalid choice.");
        }
    }
//its  for  ins manange stu
    private static Student findStudentById(String studentId) {
        for (User user : users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                if (student.getId().equals(studentId)) {
                    return student;
                }
            }
        }
        return null;
    }

    private static void createQuiz(Instructor instructor) {
        System.out.print("Enter quiz title: ");
        String title = scanner.nextLine();
        Quiz quiz = new Quiz(title);

        while (true) {
            System.out.print("Enter question (or 'done' to finish): ");
            String questionText = scanner.nextLine();
            if (questionText.equalsIgnoreCase("done")) {
                break;
            }

            List<String> options = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                System.out.print("Enter option " + (i + 1) + ": ");
                options.add(scanner.nextLine());
            }

            System.out.print("Enter correct option number (1-4): ");
            int correctOption = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Question question = new Question(questionText, options, correctOption - 1);
            quiz.addQuestion(question);
        }

        instructor.createQuiz(quiz);
        quizzes.add(quiz);
        System.out.println("Quiz " + title + " created successfully.");
    }
}
