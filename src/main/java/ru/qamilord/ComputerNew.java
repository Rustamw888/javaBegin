package ru.qamilord;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class ComputerNew implements IComputer {

  private String computerName;

  private IMouse mouse;

  //  @Inject
//  @Named("mono2")
  private IMonitor monitor;

  //
//  public ComputerNew() {
//  }
//
  @Inject
  public ComputerNew(IMouse mouse, @Named("monitor") IMonitor monitor) {
    this.mouse = mouse;
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
