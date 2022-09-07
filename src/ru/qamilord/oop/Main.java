package ru.javabegin.oop;


public class Main {

    public static void main(String[] args) {

        // можно вызывать элементы как этого класса, так и всех родителей
        BMW bmw = new BMW();
        bmw.drive();

        Car car = new Car();
        car.drive();

    }
}
