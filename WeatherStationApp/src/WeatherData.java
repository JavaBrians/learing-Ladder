import Display.CurrentConditionsDisplay;

public class WeatherData {
    private double temperature;
    private double humidity;
    private double pressure;
    private CurrentConditionsDisplay currentConditionsDisplay;

    public void notifyMeasurementsChanged() {

        //get data when it changes
        this.temperature = getTemperature(); // data from station
        this.humidity = getHumidity();
        this.pressure = getPressure();

        // update other observers
        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);

    }


}
