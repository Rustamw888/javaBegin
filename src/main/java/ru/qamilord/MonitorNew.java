package ru.qamilord;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

@ApplicationScoped

public class MonitorNew implements IMonitor{

  private String monitorName = "new";

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
