const Account = require('./Account');

class Client extends Account {
  constructor(name, document) {
    super(name, document);
  }
}

module.exports = Client;
