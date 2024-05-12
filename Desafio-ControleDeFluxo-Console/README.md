# Desafio Controle de Fluxo

## Resumo

Olá! Este projeto visa exercitar o uso de estruturas de controle de fluxo em Java, como loops e exceções. O programa recebe dois números inteiros como parâmetros via terminal e realiza uma contagem baseada na diferença entre esses números.

## Funcionalidades

O programa realiza as seguintes operações:

1. Solicita ao usuário que insira dois números inteiros via terminal.
2. Realiza uma contagem a partir do primeiro número até o segundo número.
3. Imprime cada número da contagem no console.
4. Se o primeiro número for maior que o segundo, o programa lança uma exceção personalizada chamada `ParametrosInvalidosException`, que funciona da seguinte forma: Se o primeiro número inserido pelo usuário for maior que o segundo, o programa lança essa exceção citada anteriormente. Esta exceção é usada para sinalizar que os parâmetros inseridos pelo usuário são inválidos para a operação de contagem.

## Estrutura do Projeto

O projeto consiste em duas classes principais:

1. `Contador.java`: Esta é a classe principal que contém a lógica do programa. Ela solicita ao usuário que insira dois números, realiza a contagem e lida com a `ParametrosInvalidosException`.
2. `ParametrosInvalidosException.java`: Esta é uma classe de exceção personalizada usada para sinalizar que os parâmetros inseridos pelo usuário são inválidos.
