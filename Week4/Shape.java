package Week4;

public class Shape {
    int radius;
    int base;
    int height ;
    int length;

    void area(){
        //System.out.println("Calculating area");
    }

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10,25);
        shapes[2] = new Triangle(20,10);

        for(int i=0; i < shapes.length; i++){
            shapes[i].area();
        }
    }
}

class Circle extends Shape{

    Circle(int radius){
        this.radius = radius;
    }
    @Override
    void area(){
        double areaOfCircle = 3.14*(radius*radius);
        System.out.println("Area of a circle:"+areaOfCircle);
    }
}
class Rectangle extends Shape{
    Rectangle(int base,int height){
        this.base = base;
        this.height = height;
    }
    @Override
    void area(){
        double areaOfRectangle = base*height;
        System.out.println("Area of a rectangle:"+areaOfRectangle);
    }
}

class Triangle extends Shape{
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    @Override
    void area(){
        double areaOfTriangle = 0.5*(base*height);
        System.out.println("Area of a triangle:"+areaOfTriangle);
    }
}
