package ru.qamilord.dependinversion;

public class BestManager implements IManager{
    @Override
    public void speak(IDeveloper developer) {
        System.out.println("speak manager with developer");
        developer.writeCode();
    }
}
