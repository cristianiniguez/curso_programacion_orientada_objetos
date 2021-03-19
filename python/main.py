from car import Car

if __name__ == "__main__":
    car1 = Car()
    car1.license = "AMQ123"
    car1.driver = "Andrés Herrera"
    car1.passenger = 4
    print(vars(car1))  # {'license': 'AMQ123', 'driver': 'Andrés Herrera', 'passenger': 4}

    car2 = Car()
    car2.license = "QWE567"
    car2.driver = "Andrea Herrera"
    car2.passenger = 3
    print(vars(car2))  # {'license': 'QWE567', 'driver': 'Andrea Herrera', 'passenger': 3}
