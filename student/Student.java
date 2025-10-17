package student;

public class Student extends Address{

    String name;
    int rollNo;

    int marks;

    public Student(String name, int rollNo, int marks, String city, String state){
        super(city,state);
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;


    }
    public void displayStudentDetails(){
        System.out.println("DISPLAY STUDENT INFO");
        System.out.println("*******************");
        System.out.println("NAME:"+name);
        System.out.println("ROLL NO:"+rollNo);
        System.out.println("MARKS:"+marks);
        System.out.println("CITY:"+city);
        System.out.println("STATE:"+state);
    }

}
