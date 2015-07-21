

public class Main{
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(100, 100, 100);

    }

}