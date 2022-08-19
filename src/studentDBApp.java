import java.util.Scanner;

public class studentDBApp {

    public static void main(String[] args) {

        // ask how many new students to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        student[] students = new student[numOfStudents];


        // create the number new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int j = 0; j < numOfStudents; j++) {
            System.out.println(students[j].toString());
        }

    }
}
