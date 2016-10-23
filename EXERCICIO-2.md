# Exercício 2

## Configuração Inicial

Importe este repositório como um projeto no Eclipse.

## Alínea a)


### Passo 1

Crie uma nova operação de nome "Minimum", que retorna o valor mais baixo entre os dois inputs dados na calculadora.

Exemplo:

Input 1: 10
Input 2: 20

Output: 10

#### Dica

A operação deve ser criada no namespace "calculator.Operations", deve extender a classe Operation e implementar a operação "action".

Após a sua criação, deve também referenciar a nova classe na classe "Calculator.java", de forma a adicionar a sua operação à calculador.

Pode basear-se nas outras operações já existentes para criar a nova operação "Minimum".

### Passo 2

Ainda no Eclipse, exporte um .jar através do menu "File" -> "Export", escolhendo a opção "Runnable JAR File" dentro da pasta Java.

Escolha a classe CalculatorMain e um diretório onde o .jar será criado.

### Passo 3

No MarathonITE, use o menu "Marathon" -> "Project Settings", e escolha a aba "Application".

Altere a localização do .jar para o .jar que exportou no passo 2.

### Passo 4

Execute os testes do exercício anterior para garantir que a funcionalidade pré-existente continua a funcionar.

Crie um novo test case e teste a sua nova operação.




