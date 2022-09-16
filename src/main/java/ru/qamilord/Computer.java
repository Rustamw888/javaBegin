package ru.qamilord;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class Computer implements IComputer {

  private String computerName;


  private IMonitor monitor;
  private IMouse mouse;

  public Computer() {
  }

  public Computer(IMouse mouse) {
    this.mouse = mouse;
  }

  public Computer(String computerName) {
    this.computerName = computerName;
  }

  @Inject
  public Computer(IMouse mouse, IMonitor monitor) {
    this.mouse = mouse;
    this.monitor = monitor;
  }

  @Override
  public IMonitor getMonitor() {
    return monitor;
  }

  @Override
  public IMouse getMouse() {
    return mouse;
  }

  public void setMouse(IMouse mouse) {
    this.mouse = mouse;
  }

  public void setMonitor(IMonitor monitor) {
    this.monitor = monitor;
  }

  @Override
  public String getComputerName() {
    return computerName;
  }

  public void setComputerName(String computerName) {
    this.computerName = computerName;
  }

  @Override
  public void on() {
    System.out.println("Компьютер включился " + computerName + ", используется монитор "
        + monitor.getMonitorName());
  }

  @Override
  public void off() {
    System.out.println("Компьютер выключился " + computerName + ", используется монитор "
        + monitor.getMonitorName());
  }
}
