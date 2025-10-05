package Week3;

public class Rectangle {
    int length;
    int breadth;


    int getAreaOfRectangle(int length, int breadth) {

        int areaOfRectangle = length * breadth;
        return areaOfRectangle;
    }
    int getPerimeterRectangle(int length, int breadth){
        int perimeterOfRect = 2 * (length*breadth);
        return perimeterOfRect;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("AREA OF A RECTANGLE::"+rectangle.getAreaOfRectangle(10,15));
        System.out.println("PERIMETER OF A RECTANGLE::"+rectangle.getPerimeterRectangle(20,10));
    }
}

