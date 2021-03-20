class Main {
  public static void main(String[] args) {
    UberX uberX = new UberX("AMQ123", new Account("Andrés Herrera", "AND123"), "Chevrolet", "Sonic");
    uberX.setPassenger(4);
    uberX.printDataCar(); // ... Passengers: 4

    UberVan uberVan = new UberVan("FGH345", new Account("Andrés Herrera", "AND123"));
    uberVan.setPassenger(6); // Todo bien
    uberVan.printDataCar();
    // Model: Sonic; Brand: Chevrolet
    // License: FGH345; Driver name: Andrés Herrera
  }
}