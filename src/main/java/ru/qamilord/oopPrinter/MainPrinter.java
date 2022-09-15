package ru.qamilord.oopPrinter;

public class MainPrinter {

  public static void main(String[] args) {
    IPrinter printer = new Printer(10);
    printer.print("Hello world");
  }
}