package BehavioralDesignPatterns.Command;

public class LightOnCommand implements Command{
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute(){
        light.switchOn();
    }

    @Override
    public void undo() {
        System.out.println("Undo operation in  Light On");
        light.switchOff();
    }
}
