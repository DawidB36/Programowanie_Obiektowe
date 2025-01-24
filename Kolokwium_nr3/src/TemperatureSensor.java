public class TemperatureSensor implements Sensor {
    double temperature;

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double readValue() {
        return this.temperature;
    }

    @Override
    public String getStatus() {
        return "W normie";
    }

    @Override
    public void reset() {
        System.out.println("Zresetowano czujnik");
    }
}
