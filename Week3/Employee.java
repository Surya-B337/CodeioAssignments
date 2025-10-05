package Week3;

public class Employee {
    private String name;
    private int id;
    private double salary;

    void setName(String name){
        this.name = name;
    }
    void setId(int id){
        this.id = id;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    String getName(){
        return  name;
    }

    int getId(){
        return  id;
    }

    double getSalary(){
        return  salary;
    }


    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Deepika");
        emp.setId(101);
        emp.setSalary(10000);

        System.out.println("NAME:"+emp.getName());
        System.out.println("ID:"+emp.getId());
        System.out.println("SALARY:"+emp.getSalary());

    }
}

