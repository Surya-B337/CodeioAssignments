package Week4;

public class Point {
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    void displayDetails(){
        System.out.println("x="+x+", y="+y);
    }


    public static void main(String[] args) {
        System.out.println("Point 1");
        Point point1 = new Point(10,20);
        point1.displayDetails();

        System.out.println("Point 2");
        Point point2 = new Point(point1);
        point2.displayDetails();

        System.out.println("Point 3");
        Point point3 = new Point(point1);
        point3.displayDetails();

        System.out.println("AFter Changing values");
        System.out.println("----------------------");
        System.out.println("Point 2");
        point2.x = 150;
        point2.y = 200;
        point2.displayDetails();
        System.out.println("Point 3");
        point3.x = 50;
        point3.y = 100;
        point3.displayDetails();
        System.out.println("Point 1");
        point1.displayDetails();


    }
}
