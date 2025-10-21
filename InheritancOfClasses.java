class Animal{
    void eat(){
        System.out.println("Animals Eat!");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dogs bark!");
    }
}

public class InheritancOfClasses{
public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();//inherites Animals
    dog.bark();// its owen
}
}