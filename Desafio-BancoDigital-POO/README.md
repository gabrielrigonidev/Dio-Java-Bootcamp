# Desafio Banco Digital

## Resumo

Olá! Este projeto visa exercitar o uso do paradigma Orientação a Obejtos, utilizando Classes Abstratas, Herança e Interfaces, O programa simula um gerenciamento de um Banco, com operações de Saque, Depósito e Transferência!

## Funcionalidades

O programa realiza as seguintes operações:

1. Solicita ao usuário que insira o nome do banco e cria um novo banco.
2. Cria um cliente solicitando o nome do cliente e permite a criação de Conta Corrente ou Conta Poupança para o cliente.
3. Adiciona a conta criada ao banco.
4. Oferece um menu de opções que permite ao usuário:
    - Listar todas as contas.
    - Depositar em uma conta específica.
    - Sacar de uma conta específica.
    - Criar outra conta para um cliente.
    - Transferir dinheiro entre contas.
5. Permite a execução contínua das operações até que o usuário decida encerrar.

## Estrutura do Projeto

O projeto consiste nas seguintes classes principais:

1. `Banco.java`: Gerencia as contas, permite a criação de contas correntes e poupança, e realiza operações como listar contas, depositar, sacar e transferir saldo.
2. `Cliente.java`: Representa um cliente do banco, contendo informações como nome do cliente.
3. `Conta.java`: Classe abstrata que define os métodos e propriedades comuns para diferentes tipos de contas.
4. `IConta.java`: Interface que define o nome dos métodos, mas sem especificar como eles serão utilizados.
5. `ContaCorrente.java`: Extende a classe abstrata `Conta` e representa uma conta corrente.
6. `ContaPoupanca.java`: Extende a classe abstrata `Conta` e representa uma conta poupança.
