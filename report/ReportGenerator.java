package report;

import student.Student;

import java.util.Scanner;

public class ReportGenerator {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Enter your rollNo:");
        int rollNo = input.nextInt();
        System.out.println("Enter your marks:");
        int marks = input.nextInt();
        System.out.println("Enter your city:");
        input.nextLine();
        String city =input.nextLine();
        System.out.println("Enter your state:");
        String state = input.nextLine();

        Student student = new Student(name,rollNo,marks,city,state);
        student.displayStudentDetails();

    }
}
