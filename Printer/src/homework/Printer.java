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
    System.out.println(String.format(
        "На печать отправлен текст: %s, длина: %d", text, text.length()));

    if (text.length() > paintVolume) {
      int left = text.length() - paintVolume;
      System.out.println(
          "Не хватило краски: " + left + " (всего краски в принтере " + paintVolume + ")");
      charge(5);
      print(text);
      return;
    }
    paintVolume -= text.length();
    System.out.println(String.format(
        "Текст распечатан: %s, у принтера осталось краски: %d", text, paintVolume));

  }

  @Override
  public void charge(int charge) {
    this.paintVolume += charge;
    System.out.println(String.format(
        "Принтер пополнен на длину текста %d (всего краски в принтере: %d)", charge, paintVolume));
  }
}
