package Week3;

public class Student {
    String name;
    int rollNo;
    double marks;

    void printStudentDetails(){
        System.out.println("STUDENT NAME:"+name + " "+ "ROLL NO:"+rollNo+" "+"MARKS:"+marks);
    }


    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Aruna";
        student1.rollNo = 101;
        student1.marks = 99.5;
        student1.printStudentDetails();

        Student student2 = new Student();
        student2.name = "Deepika";
        student2.rollNo = 102;
        student2.marks = 95;
        student2.printStudentDetails();

        Student student3 = new Student();
        student3.name = "Vidya";
        student3.rollNo = 103;
        student3.marks = 80;
        student3.printStudentDetails();

    }
}
