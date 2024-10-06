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
}

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
}

class PressureSensor extends DataSensors {
    public PressureSensor() {
        type = "Pressure";
    }

    @Override
    public int getData() {
        return random_int(990,1200);
    }
    @Override
    public String toString() {
        return "Pressure: ";
    }


}

