package BehavioralDesignPatterns.Command;

import java.util.ArrayList;
import java.util.List;

public class Client {
    static List<Command> commandList;
    public static void main(String[] args)    {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);

        //switch on light
        control.setCommand(lightsOn);
        control.pressButton();
        commandList = new ArrayList<>();
        commandList.add(lightsOn);

        Fan fan = new Fan();
        Command fanOn = new FanOnCommand(fan);

        //switch on fan
        control.setCommand(fanOn);
        control.pressButton();
        commandList.add(fanOn);

        for(Command command : commandList) {
            control.setCommand(command);
            control.undoPressButton();
        }


//        //switch off light
//        control.setCommand(lightsOff);
//        control.pressButton();
//
//        //switch off fan
//        control.setCommand(fanOff);
//        control.pressButton();
    }
}
