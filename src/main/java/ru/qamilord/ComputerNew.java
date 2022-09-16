package ru.qamilord;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class ComputerNew implements IComputer {

    private String name;
    private IMouse mouse;

    private IMonitor monitor; // в эту переменную будет подставлен конкретный объект (это может быть неизвестно самой переменной)

    public ComputerNew(String name) {
        this.name = name;
    }

    public ComputerNew() {
    }

    @Inject
    public ComputerNew(IMouse mouse, IMonitor monitor) {
        this.mouse = mouse;
        this.monitor = monitor;
    }

    @Override
    public String getComputerName() {
        return name;
    }

    @Override
    public IMonitor getMonitor() {
        return monitor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(IMonitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public IMouse getMouse() {
        return mouse;
    }

    public void setMouse(IMouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void on() {
        System.out.println("Компьютер включился " + name + ", используется монитор " + monitor.getMonitorName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился " + name + ", используется монитор " + monitor.getMonitorName());
    }


}
