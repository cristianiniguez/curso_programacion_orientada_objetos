class Main {
  public static void main(String[] args) {
    UberX uberX = new UberX("AMQ123", new Account("Andrés Herrera", "AND123"), "Chevrolet", "Sonic");
    uberX.passenger = 3;
    uberX.printDataCar(); // License: AMQ123; Driver name: Andrés Herrera Passengers: 3
  }
}