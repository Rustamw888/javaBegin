package ru.qamilord.oop;

public class BMW extends Car {

    public BMW(String name, String model, String color) {
        super(name, model, color); // должен вызывать конструктор у ПЕРВОГО родителя (не ищет вверх по цепочке, как super для метода)
    }

    public BMW() {
    }

    @Override
    public void drive() {

        super.signal(); // bmw должен просигналить перед тем, как поехать
        super.drive();
        System.out.println("drive bmw"); // данный метод переопределяет ВСЕ родит. методы drive
    }
}
