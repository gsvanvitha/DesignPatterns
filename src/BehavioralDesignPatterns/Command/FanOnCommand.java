package BehavioralDesignPatterns.Command;

public class FanOnCommand implements Command{
    Fan fan;
    public FanOnCommand(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute(){
        fan.switchOn();
        fan.setSpeed(4);
    }

    @Override
    public void undo() {
        System.out.println("Undo operation in  Fan On");
        fan.switchOff();
    }
}
