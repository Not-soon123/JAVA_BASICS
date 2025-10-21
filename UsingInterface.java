interface Vehicle{
 //Declering abstract methode
     void start();
     void stop();
}

class  Bike implements Vehicle{
    public void start() {
    System.out.println("Bike starts");
}
    public void stop() {
    System.out.println("Bike stops");
}
}
public class UsingInterface{
public static void main(String[] args) {
    Bike Mybike = new Bike();
    Mybike.start();
    Mybike.stop();
}
}



