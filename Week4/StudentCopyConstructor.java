package Week4;

class StudentCopyConstructor {
    String name;
    int rollNo;
    double marks;

    StudentCopyConstructor(String name,int rollNo,double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    StudentCopyConstructor(StudentCopyConstructor a){
        this.name = a.name;
        this.rollNo = a.rollNo;
        this.marks = a.marks;

    }


    void displayDetails(){
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);

    }

    public static void main(String[] args) {
        StudentCopyConstructor student1 = new StudentCopyConstructor("Deepika",101,90);
        student1.name = "Deepika";
        student1.rollNo = 101;
        student1.marks = 90;
        StudentCopyConstructor student2 = new StudentCopyConstructor(student1);
        student2.name = "Surya";
        student2.displayDetails();
        student1.displayDetails();



    }
}
