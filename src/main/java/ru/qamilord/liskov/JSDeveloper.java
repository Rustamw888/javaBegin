package ru.qamilord.liskov;

public class JSDeveloper extends Developer {

    // реализует метод по-своему
    @Override
    public void writeCode() {
        System.out.println("use JS syntax");
    }

    @Override
    public void reaction() {
        System.out.println("not bad");
    }

}
