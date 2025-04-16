import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl {
    private Map<String, Command> commandSlots = new HashMap<>();

    public void addCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.execute();
        }
    }

    public void undoButton(String slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.undo();
        }
    }
}
