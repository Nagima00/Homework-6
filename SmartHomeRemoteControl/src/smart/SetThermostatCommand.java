public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int previousTemperature;
    private int newTemperature;

    public SetThermostatCommand(Thermostat thermostat, int newTemperature) {
        this.thermostat = thermostat;
        this.newTemperature = newTemperature;
    }

    @Override
    public void execute() {
        previousTemperature = thermostat.getTemperature();
        thermostat.setTemperature(newTemperature);
    }

    @Override
    public void undo() {
        thermostat.undoTemperature(previousTemperature);
    }
}
