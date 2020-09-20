package temp.conv;

public class TemperatureConverter {
    private double temperature;

    public TemperatureConverter(double pTemperature){
        this.temperature = pTemperature;
    }

    public double celsiusToFahrenheit() {
        return ((temperature * 9) / 5) + 32;
    }

    public double celsiusToKelvin() {
        return temperature + 273.15;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setTemperature(double pTemperature) {
        this.temperature = pTemperature;
    }
}
