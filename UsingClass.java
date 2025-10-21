class Car1{
 String color;
 void drive(){
System.out.println("The car is moving!!");
 }
}

public class UsingClass{
    public static void main(String[] arg){
        Car1 newCar = new Car1();//creating oblect
        newCar.color = "Red";//Setting value
        newCar.drive();
    }
}