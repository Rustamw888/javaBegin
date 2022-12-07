package ru.qamilord.oopComputer2;

public class Monitor implements IMonitor{

  private String monitorName;

  public Monitor() {
  }

  public Monitor(String monitorName) {
    this.monitorName = monitorName;
  }

  @Override
  public String getMonitorName() {
    return monitorName;
  }

  public void setMonitorName(String monitorName) {
    this.monitorName = monitorName;
  }
}
