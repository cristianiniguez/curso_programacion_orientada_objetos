from account import Account


class Client(Account):
    def __init__(self, name, document):
        super().__init__(name, document)
