package com.Lab1;

// Система моніторингу погоди:
// Розробіть програму, яка обробляє дані з різних типів погодних датчиків (температура, вологість, тиск).
// Використовуйте поліморфізм для збору, аналізу та відображення даних з різних джерел.

public class Main {
    public static void main(String[] args) {

        TemperatureSensor TemperatureData = new TemperatureSensor();
        PressureSensor PressureData = new PressureSensor();
        HumiditySensor HumidityData = new HumiditySensor();

        int temperature = TemperatureData.getData();
        int humidity = HumidityData.getData();
        int pressure = PressureData.getData();

        System.out.println("Pressure: " + pressure);

        System.out.println("Humidity: " + humidity);

        System.out.println("Temperature: " + temperature);

        System.out.println(WeatherAnalysis.analyzeTemperature(temperature));
        System.out.println(WeatherAnalysis.analyzeHumidity(humidity));
        System.out.println(WeatherAnalysis.analyzePressure(pressure));
        String weather = WeatherAnalysis.weatherPredict(temperature, humidity, pressure);
        System.out.println(weather);
    }
}
