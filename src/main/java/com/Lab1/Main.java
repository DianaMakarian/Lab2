package com.Lab1;

// Система моніторингу погоди:
// Розробіть програму, яка обробляє дані з різних типів погодних датчиків (температура, вологість, тиск).
// Використовуйте поліморфізм для збору, аналізу та відображення даних з різних джерел.

public class Main {
    public static void main(String[] args) {

        TemperatureSensor TemperatureData = new TemperatureSensor();

        System.out.println("Temperature: " + TemperatureData.getData());
        System.out.println("Type: " + TemperatureData.getType());
    }
}
