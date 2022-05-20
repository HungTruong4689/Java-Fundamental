package InheritanceChallenge;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;

        this.currentVelocity =0;
        this.currentDirection=0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() : Steering at "+ currentDirection +" degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;

    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return int return the currentVelocity
     */
    public int getCurrentVelocity() {
        return currentVelocity;
    }

    /**
     * @param currentVelocity the currentVelocity to set
     */
    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    /**
     * @return int return the currentDirection
     */
    public int getCurrentDirection() {
        return currentDirection;
    }

    /**
     * @param currentDirection the currentDirection to set
     */
    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
    public void stop(){
        this.currentVelocity =0;
    }

}
