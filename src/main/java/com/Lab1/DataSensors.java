package com.Lab1;

//Абстрактний клас для датчиків
public abstract class DataSensors {
    public static int random_int(int Min, int Max)
    {
        return (int) (Math.random()*(Max-Min))+Min;
    }

    protected  String type;

    abstract int getData();

    public String getType() {
        return type;
    }
    abstract String getMeasurement();
}

// І класи з переписуваннями Override
class TemperatureSensor extends DataSensors {
    public TemperatureSensor() {
        type = "Temperature";
    }

    @Override
    public int getData() {
        return  random_int (-10, 40);
    }
    @Override
    public String toString() {
        return "Temperature: ";
    }
    @Override
    public String getMeasurement() {
        return "°C";
    }
}

class HumiditySensor extends DataSensors {
    public HumiditySensor() {
        type = "Humidity";
    }

    @Override
    public int getData() {
        return random_int (0, 100);
    }
    @Override
    public String toString() {
        return "Humidity: ";
    }

    @Override
    public String getMeasurement() {
        return "%";
    }
}

class PressureSensor extends DataSensors {
    public PressureSensor() {
        type = "Pressure";
    }

    @Override
    public int getData() {
        return random_int(995,1015);
    }
    @Override
    public String toString() {
        return "Pressure: ";
    }

    @Override
    public String getMeasurement() {
        return "hPa";
    }
}

