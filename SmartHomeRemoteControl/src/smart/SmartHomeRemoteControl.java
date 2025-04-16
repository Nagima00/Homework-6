import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private Map<String, Command> commandSlots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void addCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("No command assigned to slot: " + slot);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("No command to undo.");
        }
    }
}
