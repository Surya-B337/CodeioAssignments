public class Assignments {
    public static void main(String[] args) {
        //Exercise -1 The Light Bulb Test
        System.out.println("1. Light Bulb Test");
        System.out.println("------------------");
        int number = 4;
        if(number % 2 == 0){
            //Even
            System.out.println("ON");
        }else{
            //Odd
            System.out.println("OFF");
        }

        //Exercise -2 Bank Balance
        System.out.println("2. Bank Balance");
        System.out.println("---------------");
        int balance = 500;
        if(balance > 0){
            System.out.println("Positive Balance");
        }else if(balance < 0){
            System.out.println("Overdraft");
        }else{
            System.out.println("Zero Balance");
        }

        System.out.println("3. Faster Runner");
        System.out.println("---------------");
        int time1 = 12;
        int time2 = 10;
        if(time1 > time2){
            System.out.println("Arjun");
        }else if(time2 > time1){
            System.out.println("Varun");
        }else if(time1 == time2){
            System.out.println("Tie");
        }

        System.out.println("4. Biggest Treasure");
        System.out.println("-------------------");
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
        System.out.println("5. Magic Calendar");
        System.out.println("-----------------");
        int year = 2003;
        if((year % 4 == 0 & year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
        System.out.println("6. Report Card");
        System.out.println("--------------");
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
        System.out.println("7. Robot Assistant");
        System.out.println("------------------");
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

        /******Extra Problems*****/
        System.out.println("1. Speed Limit Check");
        System.out.println("------------------");
        int speedLimit = 60;
        if(speedLimit > 60){
            System.out.println("Overspeeding! Pay Fine.");
        }else{
            System.out.println("You are within the speed limit");
        }
        System.out.println("2. Pass or Fail in exam");
        System.out.println("------------------------");
        int mark  = 70;
        if(mark >= 50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        System.out.println("3. Electricity Bill Discount");
        System.out.println("---------------------------");
        int billAmount = 400;
        int discount = 0;
        if(billAmount > 1000){
            //Add 10% Discount
            discount    = (billAmount * 10) / 100;
            billAmount  = billAmount - discount;
        }else if(billAmount > 500 && billAmount < 1000){
            discount    = (billAmount * 5) / 100;
            billAmount  = billAmount - discount;
        }else{
            billAmount  = billAmount;
        }
        System.out.println("Final Amount to be paid:::"+billAmount);
        System.out.println("3. Grade Calculator");
        System.out.println("-------------------");
        int studentMarks = 74;
        if(studentMarks >= 90){
            System.out.println("Grade A");
        }else if(studentMarks >= 75 && studentMarks <= 89){
            System.out.println("Grade B");
        }else if(studentMarks >= 50 && studentMarks <= 74){
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }


        //Switch Case
        int days = 1;
        switch (days){
            case '1':
                System.out.println("Sunday");
            case '2':
                System.out.println("Monday");
            case '3':
                System.out.println("Tuesday");
            case '4':
                System.out.println("Wednesday");
            case '5':
                System.out.println("Thursday");
            case '6':
                System.out.println("Friday");
            case '7':
                System.out.println("Saturday");
        }
     }
}
