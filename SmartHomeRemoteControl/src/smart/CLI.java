import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        DoorLock doorLock = new DoorLock();

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command setThermostat22 = new SetThermostatCommand(thermostat, 22);
        Command lockDoors = new LockDoorsCommand(doorLock);

        MacroCommand goodnightMode = new MacroCommand();
        goodnightMode.addCommand(turnOnLight);
        goodnightMode.addCommand(setThermostat22);
        goodnightMode.addCommand(lockDoors);

        remote.addCommand("light_on", turnOnLight);
        remote.addCommand("set_temp", setThermostat22);
        remote.addCommand("lock_doors", lockDoors);
        remote.addCommand("goodnight", goodnightMode);

        boolean running = true;
        while (running) {
            System.out.println("\nSmart Home Remote Control");
            System.out.println("=========================");
            System.out.println("1. Turn ON the light");
            System.out.println("2. Set thermostat to 22°C");
            System.out.println("3. Lock the doors");
            System.out.println("4. Activate Goodnight Mode");
            System.out.println("5. Undo last command");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    remote.pressButton("light_on");
                    break;
                case "2":
                    remote.pressButton("set_temp");
                    break;
                case "3":
                    remote.pressButton("lock_doors");
                    break;
                case "4":
                    remote.pressButton("goodnight");
                    break;
                case "5":
                    remote.undoButton();
                    break;
                case "6":
                    running = false;
                    System.out.println("Exiting Smart Home CLI...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
