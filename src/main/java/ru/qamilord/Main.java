package ru.qamilord;

public class Main {

    public static void main(String[] args) {

        Computer comp = new Computer("MacBook", new Monitor("SamsungMonitor"));

        comp.on();
        comp.off();

    }

}
