import java.awt.*;
import java.util.Scanner;

public class student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // constructor: prompts the user to enter student's name and year
    public student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("What year is this student in?:\n1 - Year 1\n2 - Year 2\n3 - Year 3");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " " + lastName + " : Year " + gradeYear);
    }
    // generate an ID

    // enroll in courses

    // view balance

    // pay tuition

    // show status
}
