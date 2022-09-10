package ru.qamilord.oop;

// Класс обязан реализовать все методы интерфейса, иначе компилятор будет ругаться.
public class Terminator extends ARobot{

    // класс не обязаны уже реализовывать метод getName, т.к. он уже реализован в абстрактном родит. классе


    public Terminator() {
    }

    public Terminator(String name, IWing wing) {
        super(name, wing);
    }

    @Override // указание компилятору, что мы хотим реализовать метод интерфейса
    public void move() {
        System.out.println("terminator move");
    }

    @Override
    public void stop() {
        System.out.println("terminator stop");

    }

    @Override
    public void flight() {
        System.out.println("terminator flight");

    }


    @Override
    public void talk() {
        System.out.println("term talk");
    }


}
