package Class;


public class LearningClass {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is "+ porsche.getModel());
    }
}
