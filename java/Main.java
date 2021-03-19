class Main {
  public static void main(String[] args) {
    Car car1 = new Car("AMQ123", new Account("Andrés Herrera", "AND123"));
    // car1.license = "AMQ123";
    // car1.driver = "Andrés Herrera";
    car1.passenger = 4;
    car1.printDataCar(); // License: AMQ123; Driver name: Andrés Herrera

    Car car2 = new Car("QWE567", new Account("Andrea Herrera", "AND456"));
    // car2.license = "QWE567";
    // car2.driver = "Andrea Herrera";
    car2.passenger = 3;
    car2.printDataCar(); // License: QWE567; Driver name: Andrea Herrera
  }
}