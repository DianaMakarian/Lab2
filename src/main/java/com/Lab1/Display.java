package com.Lab1;

import java.util.SortedMap;

//Тут оверлоуд
public class Display {
    void  display(String temperatureInfo, String temperatureMeasurement, String pressureInfo, String pressureMeasurement, String humidityInfo, String humidityMeasurement, String weatherInfo){
        System.out.println("Показники з датчиків: ");
        System.out.println("\tТемпература: " + temperatureInfo + temperatureMeasurement);
        System.out.println("\tТиск: " + pressureInfo + pressureMeasurement);
        System.out.println("\tВологість: " + humidityInfo + humidityMeasurement);
    }

    void display(String weatherInfo){
        System.out.println("Прогноз погоди: ");
        System.out.println("\t" + weatherInfo);
    }
}


