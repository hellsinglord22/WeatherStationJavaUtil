import java.util.Observable;

public class WeatherData extends Observable{
    /// Attributes ///
    private float temperature;
    private float humidity;
    private float pressure;


    /// Constructor ///
    public WeatherData() {
    }

    /// Methods //
    private void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}