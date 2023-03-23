package Class;

public class LearningClass {
    public static void main(String[] args) {
        // create a new class java
        Car porsche = new Car();
        Car holden = new Car();
        // using the method of the class
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
