from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("AMQ123", Account("Andres Herrera", "AND876"))
    car.passenger = 4
    print(vars(car))  # {'license': 'AMQ123', 'driver': <...>, 'passenger': 4}
    print(vars(car.driver))  # {'name': 'Andres Herrera', 'document': 'AND876'}
