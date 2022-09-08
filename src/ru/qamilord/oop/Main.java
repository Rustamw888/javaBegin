package ru.qamilord.oop;


import ru.qamilord.oop.motorbike.Kawasaki;
import ru.qamilord.oop.motorbike.Ural;

public class Main {

    public static void main(String[] args) {

//        // можно вызывать элементы как этого класса, так и всех родителей
//        BMW bmw = new BMW();
//        bmw.drive();
//
//        Car car = new Car();
//        car.drive();

        Kawasaki kawasaki = new Kawasaki("kawasaki", "model-1", "black", 5.0, 2022);
        kawasaki.jump();

        Ural ural = new Ural("ural", "model-2", "white", 6.0, true);
        ural.showInfo();

    }
}
