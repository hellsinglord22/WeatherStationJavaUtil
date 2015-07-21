import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    // Attributes //
    private Observable observable;
    private float temperature;
    private float humidity;

    // Constructor //


    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object o) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.printf("Temperature : %.1f degree C, Humidity: %.1f \n", this.temperature, this.humidity);
    }

}