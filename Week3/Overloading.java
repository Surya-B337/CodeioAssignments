package Week3;

public class Overloading {

    static int printDataType(int value){
        return value;
    }
    static String printDataType(String str){
        return str;
    }
    static double printDataType(double value){
        return value;
    }
    static float printDataType(float value){
        return value;
    }


    public static void main(String[] args) {
        System.out.println("Integer "+printDataType(1));
        System.out.println("String "+printDataType("Deepika"));
        System.out.println("Double "+printDataType(5.5));
        System.out.println("Float "+printDataType(5.5F));
    }

}
