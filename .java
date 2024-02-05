import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age;
    }
}

class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName;
    }
}

class Grade {
    private String studentId;
    private String courseId;
    private double score;

    public Grade(String studentId, String courseId, double score) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Course ID: " + courseId + ", Score: " + score;
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Grade> grades;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void displayStudents() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayCourses() {
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void displayGrades() {
        System.out.println("Grades:");
        for (Grade grade : grades) {
            System.out.println(grade);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        // Add sample students, courses, and grades
        system.addStudent(new Student("S001", "Alice", 20));
        system.addStudent(new Student("S002", "Bob", 22));

        system.addCourse(new Course("C001", "Mathematics"));
        system.addCourse(new Course("C002", "Computer Science"));

        system.addGrade(new Grade("S001", "C001", 90.5));
        system.addGrade(new Grade("S001", "C002", 85.0));
        system.addGrade(new Grade("S002", "C001", 78.5));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display Students");
            System.out.println("2. Display Courses");
            System.out.println("3. Display Grades");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.displayStudents();
                    break;
                case 2:
                    system.displayCourses();
                    break;
                case 3:
                    system.displayGrades();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
