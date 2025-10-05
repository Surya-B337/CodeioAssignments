package Week3;


interface Remote{
    void turnOn();
}
interface Bluetooth extends Remote{
    @Override
    default void turnOn(){
        System.out.println("Turn on Bluetooth");
    }
}
interface Infrared extends Remote{
    @Override
    default void turnOn(){
        System.out.println("Turn on Infrared");
    }

}

class TvRemote implements Bluetooth,Infrared{
    public void turnOn(){

        Bluetooth.super.turnOn();
    }
}
class Main{
    public static void main(String[] args) {
        TvRemote tv = new TvRemote();
        tv.turnOn();
    }
}
/*public class Remote {

    void turnOn(){
        System.out.println("Turning on");
    }
}

class TvRemote extends Remote{
    @Override
    void turnOn(){
        System.out.println("Turning on Tv Remote");
    }
}
class AcRemote extends Remote{
    @Override
    void turnOn(){
        System.out.println("Turning on AC Remote");
    }
}
class Main{
    public static void main(String[] args) {

        Remote rem = new TvRemote();
        rem.turnOn();
        rem  = new AcRemote();
        rem.turnOn();
    }
}*/

