package Polymorphism;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels =4;
        this.engine=true;
    }
    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String startEngine(){
        return "Car ->  startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}
class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        // TODO Auto-generated method stub
        return "Mitsubishi ->  accelerate()";
    }

    @Override
    public String brake() {
        // TODO Auto-generated method stub
        return "Mitsubishi -> brake()";
    }

    @Override
    public String startEngine() {
        // TODO Auto-generated method stub
        return "Mitsubishi -> startEngine()";
    }
    
}
class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        // TODO Auto-generated method stub
        return "Ford ->  accelerate()";
    }

    @Override
    public String brake() {
        // TODO Auto-generated method stub
        return "Ford -> brake()";
    }

    @Override
    public String startEngine() {
        // TODO Auto-generated method stub
        return "Ford -> startEngine()";
    }
    
}
class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        // TODO Auto-generated method stub
        return getClass().getSimpleName()+" ->  accelerate()";
    }

    @Override
    public String brake() {
        // TODO Auto-generated method stub
        return getClass().getSimpleName()+" -> brake()";
    }

    @Override
    public String startEngine() {
        // TODO Auto-generated method stub
        return getClass().getSimpleName()+" -> startEngine()";
    }
    
}
public class Challenge {
    //We are goint to go back to the car analogy
    //Create a base class called Car
    // It should have a few fields that would be appreciate for a generic car class
    //engine, cylinders, wheels, etc
    //Constructor should initialize cylinders (number of) and name, and set wheels to 4
    //and engine to true. Cylinders and names would be passes parameters
    //
    // Create approciate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    //show a message for each in the base class
    //Now create 3 sub classes for your favorite vehicles
    //Override the approciate methods to demonstrate polymorphism in use
    //put all classes in the one java file(this one).
    public static void main(String[] args) {
        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Outlander VRW 4WD");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Outlander VRW 4WD");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }

}
