package BehavioralDesignPatterns.Command;

public class Light{
    private boolean on;
    public void switchOn(){
        on = true;
        System.out.println("The light is switched on\n");
    }
    public void switchOff(){
        on = false;
        System.out.println("The light is switched off\n");
    }
}