package InheritanceChallenge;
//import InheritanceChallenge.Outlander;
public class InheritanceChallenge {
    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(40);
        outlander.accelerate(-42);
    }
}
