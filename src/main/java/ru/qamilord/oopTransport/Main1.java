package ru.qamilord.oopTransport;


import ru.qamilord.oopTransport.car.Car;
import ru.qamilord.oopTransport.car.Toyota;

public class Main1 {

    public static void main(String[] args) {

//        Toyota toyota = new Toyota();
//        toyota.year=100;
//        System.out.println("toyota.year = " + toyota.year);
//
//        BMW BMW = new BMW();
//        System.out.println("BMW.year = " + BMW.year);

        Car car = new Car();
        System.out.println("Car.formatText(\"qwerty\") = " + car.formatText("qwerty"));
        Toyota toyota = new Toyota();
        System.out.println("Toyota.formatText(\"qwerty\") = " + toyota.formatText("asdfg"));

//        // можно вызывать элементы как этого класса, так и всех родителей
//        BMW bmw = new BMW();
//        bmw.drive();
//
//        Car car = new Car();
//        car.drive();

//        Kawasaki kawasaki = new Kawasaki("kawasaki", "model-1", "black", 5.0, 2022);
//        kawasaki.jump();
//
//        Ural ural = new Ural("ural", "model-2", "white", 6.0, true);
//        ural.showInfo();

//        Engine engine = new Engine();
//        engine.setVolume(10.0);
//
//        Car car = new Car();
//        car.setEngine(engine);
//        System.out.println("car.getEngine() = " + car.getEngine());
//        Engine engine = new Engine(10.0);
//
//        Car car = new Car();
//        System.out.println("car.getEngine() = " + car.getEngine().getVolume());
    }
}
