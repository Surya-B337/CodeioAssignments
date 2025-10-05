package Week4;

class Person{
    String name = "Deepika";

    int age = 20;
}
class Student extends Person{
    double marks = 98;
    char grade = 'A';
}

class GraduateStudent extends Student{

    String researchTopic = "The Impact of Social Media on Adolescent Mental Health";

    void displayStudentDetails(){
        System.out.println("Name:"+name+"<<>>"+"Age:"+age);
        System.out.println("Marks:"+marks+"<<>>"+"Grade:"+grade);
        System.out.println("Research Topic:"+researchTopic);
    }
}

class Student1{
    public static void main(String[] args) {
        GraduateStudent student = new GraduateStudent();
        student.displayStudentDetails();

    }
}