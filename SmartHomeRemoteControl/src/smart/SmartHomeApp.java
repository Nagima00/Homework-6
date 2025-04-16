public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command setThermostat = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.addCommand("light_on", turnOnLight);
        remote.addCommand("set_thermo", setThermostat);

        remote.pressButton("light_on");
        remote.pressButton("set_thermo");

        remote.undoButton("set_thermo");
    }
}
