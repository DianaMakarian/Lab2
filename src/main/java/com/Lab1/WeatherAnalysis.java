package com.Lab1;

public class WeatherAnalysis {

    public String analyzeTemperature(int temperature) {
        if (temperature < 0) return "Низька";
        if (temperature < 20) return "Середня";
        return "Висока";
    }

    public String analyzeHumidity(int humidity) {
        if (humidity < 30) return "Низька";
        if (humidity < 80) return "Середня";
        return "Висока";
    }

    public String analyzePressure(int pressure) {
        if (pressure < 1000) return "Низька";
        if (pressure < 1010) return "Середня";
        return "Висока";
    }

    public static String weatherPredict(int temperature, int humidity, int pressure) {
        WeatherAnalysis analysis = new WeatherAnalysis();
        String temperatureAnalysis = analysis.analyzeTemperature(temperature);
        String humidityAnalysis = analysis.analyzeHumidity(humidity);
        String pressureAnalysis = analysis.analyzePressure(pressure);

        if (temperatureAnalysis.equals("Висока") && humidityAnalysis.equals("Висока") && pressureAnalysis.equals("Низька")) {
            return "Можливі дощі або грози, дуже вологе середовище";
        }
        else if (temperatureAnalysis.equals("Висока") && humidityAnalysis.equals("Низька") && pressureAnalysis.equals("Висока")) {
            return "Сонячна суха погода";
        }
        else if (temperatureAnalysis.equals("Висока") && humidityAnalysis.equals("Середня") && pressureAnalysis.equals("Висока")) {
            return "Спекотна ясна погода, але не задушлива";
        }
        else if (temperatureAnalysis.equals("Висока") && humidityAnalysis.equals("Середня") && pressureAnalysis.equals("Низька")) {
            return "Спектона погода, з підвищеною ймовірністю дощів або штормів";
        }
        else if (temperatureAnalysis.equals("Середня") && humidityAnalysis.equals("Висока") && pressureAnalysis.equals("Низька")) {
            return "Імовірно хмарна погода, можливі дощі, туман або мряка";
        }
        else if (temperatureAnalysis.equals("Середня") && humidityAnalysis.equals("Низька") && pressureAnalysis.equals("Висока")) {
            return "Ясна і суха погода, дуже комфортні умови";
        }
        else if (temperatureAnalysis.equals("Низька") && humidityAnalysis.equals("Низька") && pressureAnalysis.equals("Висока")) {
            return "Суха, холодна і ясна погода";
        }
        else if (temperatureAnalysis.equals("Низька") && humidityAnalysis.equals("Низька") && pressureAnalysis.equals("Низька")) {
            return "Можлива снігова буря, або опади у вигляді снігу";
        }
        else if (temperatureAnalysis.equals("Низька") && humidityAnalysis.equals("Висока") && pressureAnalysis.equals("Низька")) {
            return "Ймовірність снігу або дощу";
        }
        else if (temperatureAnalysis.equals("Низька") && humidityAnalysis.equals("Середня") && pressureAnalysis.equals("Висока")) {
            return "Холодна ясна погода без значних опадів";
        }
        else if (temperatureAnalysis.equals("Низька") && humidityAnalysis.equals("Середня") && pressureAnalysis.equals("Низька")) {
            return "Холодна, з ймовірними опадами у вигляді снігу або мокрого снігу, можливе похмуре небо";
        }
        else {
            return "Погода нестабільна, можливі зміни";
        }
    }
}
