package homework;

public class MainCar {

  public static void main(String[] args) {

//    Car car = new Car();
//    car.setName("Tesla");

    Car car = new Car("Tesla");

    car.drive();

    car.stop();
  }
}