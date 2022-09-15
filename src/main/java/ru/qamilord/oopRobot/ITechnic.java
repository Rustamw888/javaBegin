package ru.qamilord.oopRobot;

public interface ITechnic {

    default void on() {
        System.out.println("default on");
    }

    default void off(){
        System.out.println("default off");
        on(); // дефолтный метод может вызывать другие методы из интерфейса
    }
}
