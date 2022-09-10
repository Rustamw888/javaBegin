package ru.qamilord.oop;

public abstract class ARobot implements IRobot {

    // конструкторы в абстрактном классе нужны для инициализации свойств
    public ARobot() {
    }

    public ARobot(String name, IWing wing) {
        this.name = name;
        this.wing = wing;
    }

    // можем выносить в абстрактный класс часть реализации интерфейса
    private String name; // эту переменную создали согласно интерфейсу
    private IWing wing;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public IWing getWing() {
        return wing;
    }

    public void setWing(IWing wing) {
        this.wing = wing;
    }
}
