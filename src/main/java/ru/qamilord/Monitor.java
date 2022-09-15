package ru.qamilord;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
@Alternative
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
