package Week4;

public class Employee {

    void getBonus(){
        System.out.println("Getting Bonus");
    }
}

class Manager extends Employee{
    @Override
    void getBonus(){
        System.out.println("I'm Mananger, I got 20,000 Bonus Amount");
    }
}

class Developer extends Employee{
    @Override
    void getBonus(){
        System.out.println("Congrats, I got 5000 bonus Amount");
    }
}

class Main{
    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.getBonus();
        Employee developer = new Developer();
        developer.getBonus();


    }
}