package ru.qamilord.oop;

// вы можете во всех интерфейсах описывать как методы-свойства, так методы-свойства
public interface IRobot extends ITechnic {

    // методы-действия (методы бизнес-процессов)
    void move();
    void stop();
    void flight();
    void talk();

    // методы-свойства
    String getName();
    IWing getWing(); // обязываем по контракту всех роботов иметь крыло

}
