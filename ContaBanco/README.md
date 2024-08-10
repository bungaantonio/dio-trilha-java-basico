## Resolução do Desafio

O desafio consiste em simular uma conta bancária com entrada de dados pelo terminal.

## Requisitos

- `Noções sobre Java`: Sintaxe, declaração de variáveis, entrada e saída de dados
- `Uma versão instalada do JDK`: JDK 8.2 no minímo
- `Uma IDE que te pareça confortável`: VS Code, por exemplo

## ATENÇÃO

É preciso ter a atenção ao lidar com entradas de dados, especialmente com tipos diferentes como números e caracteres existe a possibilidade de encarar um `bug` muito comum.

```java
        System.out.print("Entrada de inteiro");
        int numero = entradaTeclado.nextInt();
        System.out.print("Entrada de texto");
        String agencia = entradaTeclado.nextLine();
```
Visualmente o código está tudo bem, mas após a execução, o código apresentará um comportamento inesperado, o **nextInt()** fará a leitura do número não mudando de linha, isso fará com que a variável **agencia** receba como entrada, uma string vazia

___
Para evitar este `bug` apenas devemos adicionar uma nova linha `nextLine()` e assim teremos o comportamento desejado 
```java
        System.out.print("Entrada de inteiro");
        int numero = entradaTeclado.nextInt();
        entradaTeclado.nextLine();
        System.out.print("Entrada de texto");
        String agencia = entradaTeclado.nextLine();
```
Espero que está informação tenha você de alguma forma.
___