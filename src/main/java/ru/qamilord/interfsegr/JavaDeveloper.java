package ru.qamilord.interfsegr;

public class JavaDeveloper implements IDeveloper, ITester {

    @Override
    public void writeCode() {
        System.out.println("java code" );
    }

    @Override
    public void eat() {
        System.out.println("java eat");
    }

    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {

    }
}
