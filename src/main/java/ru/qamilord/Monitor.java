package ru.qamilord;

public class Monitor implements IMonitor{
    private String name = "monitor";

    public Monitor(String name) {
        this.name = name;
    }

    public Monitor() {
    }

    @Override
    public String getMonitorName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
