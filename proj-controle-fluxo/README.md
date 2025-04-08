# Desafio DIO - Controle de Fluxo

Este projeto foi desenvolvido como parte do **Bootcamp Bradesco - Java Cloud Native** da [Digital Innovation One (DIO)](https://www.dio.me/), seguindo como base o repositório original:  
[digitalinnovationone/trilha-java-basico/desafios/controle-fluxo](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo).

## Descrição do Projeto

O programa simula um controle de fluxo onde o usuário deve informar dois números inteiros:  
- **O primeiro número deve ser MENOR que o segundo**.  
- Em seguida, o programa realiza uma contagem a partir de 1 até a diferença entre esses dois números (inclusive).

Se o usuário informar o primeiro número maior que o segundo, uma **exceção personalizada** é lançada e tratada com uma mensagem amigável.

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/Gabriel-FC-Comp/dio-java-bootcamp/proj-controle-fluxo
   cd proj-controle-fluxo/ControleFluxo
   ```
2. Compile o projeto:
    ```
    javac Contador.java ParametrosInvalidosException.java
    ```
3. Execute o programa:
    ```
    java Contador
    ```

## Estrutura
- `Contador.java`: Classe principal que realiza a leitura dos parâmetros via terminal, valida e executa a contagem.
- `ParametrosInvalidosException.java`: Exceção customizada que é lançada quando os parâmetros estão fora das regras do programa.
