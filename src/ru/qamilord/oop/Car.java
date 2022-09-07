package ru.qamilord.oop;

// все, что умеет транспорт, умеет и Car (доступный функционал)
// дочерний класс может (но не обязан) добавлять что-то от себя
public class Car extends Transport {

    public Car(String name, String model, String color) {
        super(name, model, color); // перекидываем все значения в родит. конструктор
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car(int number) {
        this.number = number;
    }

    public Car() {
    }

    private int number; // для всех авто нужно будет иметь номер

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // уникальный метод только для Car и всех его дочерних классов
    public void signal(){
        System.out.println("signal");
    }

//    @Override
//    public void drive() {
//        // доработанный функционал для метода drive
//        System.out.println("drive car");
//    }

    @Override
    public void stop() {
        System.out.println("stop car");
    }
}
