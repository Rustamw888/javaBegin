package ru.qamilord.oopTransport;

// класс с общим поведением для всех траспортных средств
public class Transport{ // компилятор всегда как будто дописывает extends Object для самого верхнего объекта цепочки

    public Transport() {
    }

    public Transport(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    // свойства/поля
    private String name;// название, которое будет у всех траспортов
    private String model;// модель
    private String color; // цвет
    public int year;


    // get/set для свойств объекта
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // бизнес-методы
    public void drive() {
        System.out.println("drive transport");
    }

    public void stop() {
        System.out.println("stop transport");
    }


}
