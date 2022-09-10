package ru.qamilord.oop;

public class AircraftWing implements IWing{

    private int size;

    @Override
    public void open() {
        System.out.println("wing open");
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
