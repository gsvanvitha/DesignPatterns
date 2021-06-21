package BehavioralDesignPatterns.Command;

public class Fan {
    private boolean on;
    public void switchOn(){
        on = true;
        System.out.println("The fan is switched on");
    }
    public void switchOff(){
        on = false;
        System.out.println("The fan is switched off\n");
    }
    public void setSpeed(int speed){
        System.out.println("The fan is set to speed: "+speed+"\n");
    }
}
