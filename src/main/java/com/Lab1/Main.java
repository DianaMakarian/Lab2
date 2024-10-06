package com.Lab1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TemperatureSensor TemperatureData = new TemperatureSensor();

        System.out.println("Temperature: " + TemperatureData.getData());
        System.out.println("Type: " + TemperatureData.getType());//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}
