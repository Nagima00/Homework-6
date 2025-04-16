public class Thermostat {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public void undoTemperature(int previousTemperature) {
        this.temperature = previousTemperature;
        System.out.println("[Thermostat] Reverting to previous temperature: " + previousTemperature + "°C");
    }
}
