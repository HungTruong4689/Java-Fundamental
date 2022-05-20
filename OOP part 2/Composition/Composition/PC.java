package Composition;
import Composition.MotherBoard;
public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherboard;
    public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }
    public Case getTheCase() {
        return theCase;
    }
    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public MotherBoard getMotherboard() {
        return motherboard;
    }
    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }
    

    
}
