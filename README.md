
# Fluxo do Programa - Conta Bancária em Java

## autor: thePaulCode Paulo Santos

Este é um guia explicativo sobre o fluxo de programa do código Java que simula a criação de uma conta bancária. O código é composto por duas classes, `ContaTerminal` e `ContaCliente`.

## Fluxo do Programa

1. O programa começa no método `main` da classe `ContaTerminal`.
2. O objeto `Scanner` é criado para obter entrada de dados do usuário.
3. O usuário é solicitado a fornecer o número da agência, número da conta, nome, sobrenome e saldo da conta.
4. As entradas do usuário são coletadas usando os métodos do objeto `Scanner`.
5. Um objeto `ContaCliente` é criado, passando as informações fornecidas pelo usuário para o construtor.
6. O método `toString()` do objeto `ContaCliente` é chamado automaticamente quando o objeto é passado para a função `System.out.println()`.
7. A mensagem formatada sobre a conta criada é exibida no console.

## Siga as instruções no console para inserir os detalhes da conta.

## Exemplo de Saída

Se o usuário inserir as seguintes informações:
- Número da Agência: 123
- Número da Conta Bancária: 456
- Nome: João
- Sobrenome: Silva
- Saldo Bancário: 2500.00

O programa exibirá a seguinte mensagem formatada:

Olá Joao, obrigado por criar uma conta em nosso banco, sua agência é 123, conta 456 e seu saldo 2500.0 já está disponível para saque.