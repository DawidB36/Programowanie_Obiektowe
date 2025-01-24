public class PressureSensor implements Sensor{
    double pressure;

    public PressureSensor(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public double readValue() {
        return this.pressure;
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
