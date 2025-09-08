public class Assignments {
    public static void main(String[] args) {
            //Exercise -1 The Light Bulb Test
        System.out.println("Light Bulb Test");
        System.out.println("--------------");
        int number = 4;
        if(number % 2 == 0){
            //Even
            System.out.println("ON");
        }else{
            //Odd
            System.out.println("OFF");
        }

        //Exercise -2 Bank Balance
        System.out.println("Bank Balance");
        System.out.println("--------------");
        int balance = -100;
        if(balance > 0){
            System.out.println("Positive Balance");
        }else if(balance < 0){
            System.out.println("Overdraft");
        }else{
            System.out.println("Zero Balance");
        }

        System.out.println("Faster Runner");
        System.out.println("-------------");
        int time1 = 12;
        int time2 = 10;
        if(time1 > time2){
            System.out.println("Arjun");
        }else if(time2 > time1){
            System.out.println("Varun");
        }else if(time1 == time2){
            System.out.println("Tie");
        }
        System.out.println("Biggest Treasure");
        System.out.println("---------------");
        int x = 100;
        int y = 50;
        int z = 75;
        if(x > y && x > z){
            System.out.println(x);
        }else if(y > x && y > z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }
        System.out.println("Magic Calendar");
        System.out.println("-------------");
        int year = 2020;
        if((year % 4 == 0 & year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
        System.out.println("Report Card");
        System.out.println("-----------");
        int marks =  92;
        if(marks >= 90){
            System.out.println("A");
        }else if(marks >= 75 && marks < 90){
            System.out.println("B");
        }else if(marks >= 50 && marks < 75){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
        System.out.println("Robot Assistant");
        System.out.println("--------------");
        int a = 63;
        int b = 7;
        int op = 4;
        int result = 0;
        if(op == 1){
            //Add
            result = a + b;
        }else if(op == 2){
            //Subtraction
            result = a - b;
        }else if(op == 3){
            //Mulitple
            result = a * b;
        }else if (op == 4){
            result = a / b;
        }
        System.out.println(result);
     }
}
