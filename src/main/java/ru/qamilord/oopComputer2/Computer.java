package ru.qamilord.oopComputer2;

public class Computer implements IComputer {

  private String computerName;

  private IMonitor monitor;

  public Computer() {
  }

  public Computer(String computerName, IMonitor monitor) {
    this.computerName = computerName;
    this.monitor = monitor;
  }

  @Override
  public IMonitor getMonitor() {
    return monitor;
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
