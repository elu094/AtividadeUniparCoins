public class UniparCoins{

    class CarteiraDigital:
    def _init_(self):
    self.saldo = 0.0
    self.historico = []

    def adicionar_saldo(self, valor):
            if valor > 0:
    self.saldo += valor
            self.historico.append(f"Adicionado: R${valor:.2f}")
    print(f"Saldo adicionado com sucesso! Saldo atual: R${self.saldo:.2f}")
        else:
    print("Valor inválido para adicionar ao saldo.")

    def realizar_pagamento(self, valor):
            if valor > 0 and valor <= self.saldo:
    self.saldo -= valor
            self.historico.append(f"Pagamento: R${valor:.2f}")
    print(f"Pagamento realizado com sucesso! Saldo atual: R${self.saldo:.2f}")
    elif valor > self.saldo:
    print("Saldo insuficiente para realizar o pagamento.")
        else:
    print("Valor inválido para pagamento.")

    def verificar_saldo(self):
    print(f"Seu saldo atual é: R${self.saldo:.2f}")

    def mostrar_historico(self):
            if self.historico:
    print("Histórico de transações:")
            for transacao in self.historico:
    print(transacao)
        else:
    print("Nenhuma transação registrada.")

    def menu():
    carteira = CarteiraDigital()
    while True:
    print("\n1 - Adicionar Saldo")
    print("2 - Realizar Pagamento")
    print("3 - Verificar Saldo")
    print("4 - Mostrar Histórico")
    print("5 - Sair")
    opcao = input("Escolha uma opção: ")

        if opcao == "1":
    valor = float(input("Digite o valor para adicionar ao saldo: "))
            carteira.adicionar_saldo(valor)
    elif opcao == "2":
    valor = float(input("Digite o valor do pagamento: "))
            carteira.realizar_pagamento(valor)
    elif opcao == "3":
            carteira.verificar_saldo()
    elif opcao == "4":
            carteira.mostrar_historico()
    elif opcao == "5":
    print("Obrigado por usar a sua Carteira Digital!")
            break
                    else:
    print("Opção inválida. Tente novamente.")

if _name_ == "_main_":
    menu()

{

