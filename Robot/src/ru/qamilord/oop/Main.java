package ru.javabegin.oop.robot;

public class Main {

    public static void main(String[] args) {

        AircraftWing aircraftWing = new AircraftWing();
        aircraftWing.setSize(200);
        aircraftWing.open();

        Robocop robocop = new Robocop();
        robocop.setName("robo");
        robocop.setWing(aircraftWing);

        robocop.flight();
        robocop.talk();


    }
}
