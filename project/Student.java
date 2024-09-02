package dsdsds;
import java.util.Scanner;



import java.util.ArrayList;
import java.util.List;


public class Student extends User {
    private String id;
    private List<Enrollment> enrolledCourses;
    private String personalInformation;
    private List<Quiz> completedQuizzes;
    private static final int MAX_COURSES = 2;//pore  static method  call dibo 

    public Student(String id, String name, String email, String password) {
        super(name, email, password);
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
        this.completedQuizzes = new ArrayList<>();
    }

    public void takeQuiz(Quiz quiz) {
        quiz.takeQuiz();
        completedQuizzes.add(quiz);
    }

    public void viewLessons(List<Lesson> lessons) {
        for (Lesson lesson : lessons) {
            lesson.viewMaterials();
        }
    }

    public String getId() {
        return id;
    }

    public String getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(String personalInformation) {
        this.personalInformation = personalInformation;
    }

    public void enrollCourse(Course course) {
        if (enrolledCourses.size() >= MAX_COURSES) {
            System.out.println("You can only enroll in up to " + MAX_COURSES + " courses.");
            return;
        }

        System.out.println("Available sections for " + course.getCourseName() + ":");
        course.showSections();
        System.out.print("Enter section to enroll (A, B, C): ");
        String section = SchoolManagementSystem.scanner.nextLine().trim().toUpperCase();

        for (Enrollment enrollment : enrolledCourses) {
            if (enrollment.getCourse().equals(course) && enrollment.getSection().equals(section)) {
                System.out.println("You are already enrolled in this course and section.");
                return;
            }
        }

        if (course.enrollStudent(section)) {
            enrolledCourses.add(new Enrollment(course, section));
            System.out.println("Enrolled in " + course.getCourseName() + " - Section " + section);
        } else {
            System.out.println("Failed to enroll in " + course.getCourseName() + " - Section " + section);
        }
    }

    public void viewCourses() {
        System.out.println("Enrolled Courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (Enrollment enrollment : enrolledCourses) {
                System.out.println(enrollment.getCourse().getCourseName() + " - Section " + enrollment.getSection());
            }
        }
    }

    public void viewProfile() {
        System.out.println("Student Profile:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Personal Information: " + personalInformation);
        viewCourses();
    }

    public void viewQuizzes() {
        List<Quiz> quizzes = getQuizzesForEnrolledCourses();
        if (quizzes.isEmpty()) {
            System.out.println("No quizzes available for your enrolled courses.");
        } else {
            System.out.println("Available Quizzes:");
            for (Quiz quiz : quizzes) {
                System.out.println(quiz.getTitle());
            }
        }
    }

    private List<Quiz> getQuizzesForEnrolledCourses() {
        List<Quiz> quizzes = new ArrayList<>();
        for (Enrollment enrollment : enrolledCourses) {
            quizzes.addAll(enrollment.getCourse().getQuizzes());
        }
        return quizzes;
    }

    private static class Enrollment {
        private Course course;
        private String section;

        public Enrollment(Course course, String section) {
            this.course = course;
            this.section = section;
        }

        public Course getCourse() {
            return course;
        }

        public String getSection() {
            return section;
        }
    }



    // Method to play games
    public void playGames() {
    	
    	Scanner scanner = SchoolManagementSystem.scanner;
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nWelcome to the Gaming Section!");
            System.out.println("1. Tic-Tac-Toe");
            System.out.println("2. Number Guessing");
            System.out.println("3. Rock-Paper-Scissors");
            System.out.println("4. Exit");
            System.out.print("Choose a game to play (1, 2, 3, 4): ");
          
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    playTicTacToe();
                    break;
                case 2:
                    playNumberGuessing();
                    break;
                case 3:
                    playRockPaperScissors();
                    break;
                case 4:
                    System.out.println("Exiting Gaming Section. Have a great day!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
    private void playTicTacToe() {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char currentPlayer = 'X';
        boolean gameWon = false;

        while (true) {
            printBoard(board);
            int[] move = getPlayerMove(board);
            board[move[0]][move[1]] = currentPlayer;

            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
                break;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("The game is a draw!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        if (!gameWon) {
            System.out.println("Game Over.");
        }
    }

    private void printBoard(char[][] board) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }
  
    private int[] getPlayerMove(char[][] board) {
        Scanner scanner = SchoolManagementSystem.scanner;
        int row, col;
        while (true) {
            System.out.print("Enter your move (row and column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                break;
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }
        return new int[]{row, col};
    }

    

    private boolean checkWin(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


    private void playNumberGuessing() {
        Scanner scanner = SchoolManagementSystem.scanner;
        int lowerBound = 1;
        int upperBound = 10;
        int numberToGuess = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Guess the number between " + lowerBound + " and " + upperBound + ":");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            numberOfTries++;

            if (guess < lowerBound || guess > upperBound) {
                System.out.println("Please guess a number within the range.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }
    }

    

    private void playRockPaperScissors() {
        Scanner scanner = SchoolManagementSystem.scanner;
        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice;
        String computerChoice;
        String result;

        System.out.println("Rock, Paper, Scissors Game!");
        System.out.println("Enter your choice (Rock, Paper, Scissors): ");
        playerChoice = scanner.nextLine().trim();

        // Validate player choice
        if (!isValidChoice(playerChoice, choices)) {
            System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
            return;
        }

        // Generate computer's choice
        computerChoice = choices[(int) (Math.random() * 3)];
        System.out.println("Computer's choice: " + computerChoice);

        // Determine the result
        result = determineWinner(playerChoice, computerChoice);

        System.out.println(result);
    }

    private boolean isValidChoice(String choice, String[] validChoices) {
        for (String validChoice : validChoices) {
            if (validChoice.equalsIgnoreCase(choice)) {
                return true;
            }
        }
        return false;
    }

    private String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            return "It's a tie!";
        }

        switch (playerChoice.toLowerCase()) {
            case "rock":
                return (computerChoice.equalsIgnoreCase("Scissors")) ? "You win!" : "Computer wins!";
            case "paper":
                return (computerChoice.equalsIgnoreCase("Rock")) ? "You win!" : "Computer wins!";
            case "scissors":
                return (computerChoice.equalsIgnoreCase("Paper")) ? "You win!" : "Computer wins!";
            default:
                return "Invalid choice.";
        }
    }


   
}
