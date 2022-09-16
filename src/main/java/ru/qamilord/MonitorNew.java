package ru.qamilord;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class MonitorNew implements IMonitor{

  private String monitorName = "monitor New";

  public MonitorNew() {
  }

  public MonitorNew(String monitorName) {
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
