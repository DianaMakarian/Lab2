package com.Lab1;

// Система моніторингу погоди:
// Розробіть програму, яка обробляє дані з різних типів погодних датчиків (температура, вологість, тиск).
// Використовуйте поліморфізм для збору, аналізу та відображення даних з різних джерел.

public class Main {
    public static void main(String[] args) {

        TemperatureSensor TData = new TemperatureSensor();
        PressureSensor PData = new PressureSensor();
        HumiditySensor HData = new HumiditySensor();

        int temperature = TData.getData();
        int humidity = HData.getData();
        int pressure = PData.getData();

        String weather = WeatherAnalysis.weatherPredict(temperature, humidity, pressure);

        Display d = new Display();
        d.display(temperature, humidity, pressure, TData.getMeasurement(), HData.getMeasurement(), PData.getMeasurement());

        d.display();

        d.display(weather);
    }
}
