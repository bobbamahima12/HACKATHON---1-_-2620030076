import java.util.Scanner;

class Student {

    // Data members
    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    // Parameterized constructor
    Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // 1. Fee = credits x 1500
    double calculateFee() {
        double fee = courseCredits * 1500;
        return fee;
    }

    // 2. Eligible if marks are 50 or more
    boolean checkEligibility() {
        if (marks >= 50) {
            return true;
        } else {
            return false;
        }
    }

    // 3. Scholarship amount
    double calculateScholarship() {
        double fee = calculateFee();
        double scholarship;

        if (marks >= 85) {
            scholarship = fee * 20 / 100;    // 20%
        } else if (marks >= 70) {
            scholarship = fee * 10 / 100;    // 10%
        } else {
            scholarship = 0;                 // no scholarship
        }
        return scholarship;
    }

    // 4. Final fee = fee - scholarship
    double calculateFinalFee() {
        double finalFee = calculateFee() - calculateScholarship();
        return finalFee;
    }

    // 5. Display everything
    void displayDetails() {
        System.out.println();
        System.out.println("----- Student Details -----");
        System.out.println("Name           : " + studentName);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Marks          : " + marks);

        System.out.println("----- Course Details -----");
        System.out.println("Course Name    : " + courseName);
        System.out.println("Course Credits : " + courseCredits);

        System.out.println("----- Fee Details -----");
        System.out.println("Eligible       : " + checkEligibility());
        System.out.println("Total Fee      : Rs. " + calculateFee());
        System.out.println("Scholarship    : Rs. " + calculateScholarship());
        System.out.println("Final Fee      : Rs. " + calculateFinalFee());
    }
}

public class StudentCourseRegistration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        sc.nextLine();   // clears the leftover Enter key

        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        System.out.print("Enter course credits: ");
        int credits = sc.nextInt();

        // Creating the object
        Student s = new Student(name, roll, marks, course, credits);

        // Check eligibility first
        if (s.checkEligibility()) {
            System.out.println("\nStudent is eligible for registration.");
            s.displayDetails();
        } else {
            System.out.println("\nStudent is NOT eligible for registration.");
            System.out.println("Marks must be 50 or above.");
        }

        sc.close();
    }
}