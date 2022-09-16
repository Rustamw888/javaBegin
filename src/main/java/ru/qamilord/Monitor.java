package ru.qamilord;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class Monitor implements IMonitor{

  private String monitorName = "monitor";

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
