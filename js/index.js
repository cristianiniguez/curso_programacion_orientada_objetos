const Car = require('./Car');
const Account = require('./Account');

var car1 = new Car('AW456', new Account('Andres Herrera', 'AND123'));
car1.passenger = 4;

car1.printDataCar();
// Account { name: 'Andres Herrera', document: 'AND123' }
// Andres Herrera
// AND123
