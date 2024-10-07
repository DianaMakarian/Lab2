package com.Lab1;

import java.util.SortedMap;

//Тут оверлоуд
public class Display {
    void  display(int temperatureInfo, int humidityInfo, int pressureInfo, String temperatureMeasurement, String humidityMeasurement, String pressureMeasurement){
        System.out.println("Показники з датчиків: ");
        System.out.println("\tТемпература: " + temperatureInfo + temperatureMeasurement);
        System.out.println("\tВологість: " + humidityInfo + humidityMeasurement);
        System.out.println("\tТиск: " + pressureInfo + pressureMeasurement);
    }

    void display(String weatherInfo){
        System.out.println("Прогноз погоди: ");
        System.out.println("\t" + weatherInfo);
    }
    void display(){
        System.out.println("\n");
    }
}


