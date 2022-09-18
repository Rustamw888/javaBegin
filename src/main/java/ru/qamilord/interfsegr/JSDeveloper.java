package ru.qamilord.interfsegr;

public class JSDeveloper implements IDeveloper, ITester {

    @Override
    public void writeCode() {
        System.out.println("js code" );
    }

    @Override
    public void eat() {
        System.out.println("js eat");
    }


    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {

    }
}
