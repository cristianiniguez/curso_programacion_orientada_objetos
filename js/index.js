const Car = require('./Car');
const UberX = require('./UberX');
const Account = require('./Account');

var car1 = new Car('AW456', new Account('Andres Herrera', 'AND123'));
car1.passenger = 4;
car1.printDataCar();
// Account { name: 'Andres Herrera', document: 'AND123' }
// Andres Herrera
// AND123

var uberX = new UberX('AW456', new Account('Andrea Ferran', 'ANDA765'), 'Chevrolet', 'Spark');
uberX.passenger = 4;
uberX.printDataCar();
// Account { name: 'Andrea Ferran', document: 'ANDA765' }
// Andrea Ferran
// ANDA765
