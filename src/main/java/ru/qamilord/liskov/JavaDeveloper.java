package ru.qamilord.liskov;

public class JavaDeveloper extends Developer {

    @Override
    public void writeCode() {
        System.out.println("use java syntax");
    }

    @Override
    public void reaction() {
        System.out.println("cool");
    }
}
