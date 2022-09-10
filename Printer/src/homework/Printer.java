package homework;

public class Printer implements IPrinter {

  private int paintVolume;

  public Printer() {
  }

  public Printer(int paintVolume) {
    this.paintVolume = paintVolume;
  }

  @Override
  public int getPaintVolume() {
    return paintVolume;
  }

  public void setPaintVolume(int paintVolume) {
    this.paintVolume = paintVolume;
  }

  @Override
  public void print(String text) {
    System.out.println("На печать отправлен текст: " + text + ", длина: " + text.length());

    if (text.length() > paintVolume) {
      int left = text.length() - paintVolume;
      System.out.println(
          "Не хватило краски: " + left + " (всего краски в принтере " + paintVolume + ")");
      charge(5);
      print(text);
      return;
    }
    paintVolume = paintVolume - text.length();
    System.out.println(
        "Текст распечатан: " + text + ", у принтера осталось краски: " + paintVolume);

  }

  @Override
  public void charge(int charge) {
    paintVolume = paintVolume + charge;
    System.out.println(
        "Принтер пополнен на длину текста " + charge + " (всего краски в принтере: " + paintVolume
            + ")");
  }
}
