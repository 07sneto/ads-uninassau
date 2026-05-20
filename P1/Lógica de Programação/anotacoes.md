# **ANOTAÇÕES DE LÓGICA DE PROGRAMAÇÃO**



#### **O que é um Algoritmo?**



* ###### **Sequência de Passos**

&#x09;Um conjunto ordenado de instruções que resolvem um problema específico.

* ###### **Finitude**

&#x09;Todo algoritmo deve ter um início, um meio e um fim definido.

* ###### **Objetividade**

&#x09;Produz resultados consistentes quando executa as mesmas operações.



#### **LÓGICA/SINTAXE em PYTHON**



##### **Comando de Entrada**

Captura um dado digitado pelo usuário e armazena em uma variável.



* input()



##### **Comando de Saída**

Exibe uma informação ou resultado na tela para o usuário.


* print()



##### **Variável**

Espaço nomeado na memória do computador que armazena um valor que pode mudar durante a execução do programa.



nomeVar = Var



###### **Tipo de Dados/Variável**

Define que tipo de valor uma variável pode armazenar.



* int — número inteiro (ex: 10, -3, 0)
* float — número decimal (ex: 3.14, -0.5)
* str — texto/cadeia de caracteres (ex: "Ana", "olá")
* bool — verdadeiro ou falso (ex: True, False)



##### **Operadores Relacionais**

Comparam dois valores e retornam um resultado booleano (True ou False).



* == — igual a
* != — diferente de
* > — maior que
* < — menor que
* >= — maior ou igual a
* <= — maior ou igual a



##### **Operadores Lógicos**

Combinam duas ou mais condições e retornam um resultado booleano (True ou False).



* and — verdadeiro se ambas as condições forem verdadeiras.
* or — verdadeiro se pelo menos uma condição for verdadeira.
* not — inverte o resultado da condição



##### **Estruturas Condicionais** 

Executa um bloco de código apenas se uma condição for verdadeira, permitindo ao programa tomar diferentes caminhos conforme a situação.



* if / elif / else

avalia condições (expressões que retornam True ou False)



* match case

Compara uma variável com múltiplos valores possíveis, executando o bloco correspondente ao primeiro que for igual. Alternativa mais limpa ao encadeamento de vários elif.



##### **Estruturas de Repetição**

Executa um bloco de código várias vezes enquanto uma condição for verdadeira ou percorrendo uma sequência de valores.



* while — repete enquanto a condição for verdadeira

  * quando usar: quando não sabe quantas repetições serão feitas.
  * pode virar loop infinito se a condição nunca mudar.



* for — percorre uma sequência de valores

  * quando sabe exatamente quantas repetições ou tem uma sequência.
  * mais controlado.

