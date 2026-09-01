# Estrutura de Condição

## 1. Expressões Relacionais

Em java o tipo booleano especifica os valores booleanos `False` e `True`.

Expressões Relacionais são aquelas que realizam uma comparação entre duas expressões e retornam:

- `False`, se o resultado é falso.
- `True`, se o resultado é verdadeiro.

### Operadores relacionais em Java

- `>` Maior que
- `>=` Maior ou igual a
- `<` Menor que
- `<=` Menor ou igual a
- `>` Maior que
- `==` Igual a
- `!=` Diferente de

## 2. Operações Lógicas

Expressões lógicas são aquelas que realizam uma operação lógica (oi, e, não, etc...)

- `!`Negação (NÃO)
- `&&`Conjunção Lógica (E)
- `||` Disjunção Lógica (OU)

### Expressão `and`

| Op1 | Op2 | Op1 and Op2 |
| :---: | :---: | :---: |
| V | V | V |
| V | F | F |
| F | V | F |
| F | F | F |

**Descrição:** Retorna `True` quando ambas expressões são verdadeiras

### Expressão `or`

| Op1 | Op2 | Op1 or Op2 |
| :---: | :---: | :---: |
| V | V | V |
| V | F | V |
| F | V | V |
| F | F | F |

**Descrição:** Retorna `True` quando **pelo menos uma** das expressões são verdadeiras.

## 3. Comandos Condicionais

Um comando condicional é aquele que permite decidir se um determinado bloco de comandos deve ou não ser executado, a partir do resultado de uma expressão relacional ou lógica.

## Blocos de comandos

    - É um conjunto de instruções agrupadas.
    - Os comando agrupados do bloco devem estar indentados.
    - A identação é feita em geral com 2 ou 4 espaços em brancos.

## Comandos condicionais: `if`

    if (expressão relacional ou lógica) {
        comandos executados se a expressão for verdadeira
    }

Os comandos são executados somente se a expressão relacional/lógica for verdadeira.

## Comandos condicionais: `if`/`else`

    if (expressão relacional ou lógica) {
        comandos executados se a expressão for verdadeira
    } else {
        comandos executados se a expressão for falsa
    }

## Estrutura de seleção múltipla


    if (condição 1) {
        comandos executados se a condição 1 for verdadeira
    } else if (condição 2) {
        comandos executados se a condição 2 for verdadeira
    } else if (condição 3) {
        comandos executados se a condição 3 for verdadeira
    } else {
        comandos executados se nenhuma condição anterior for verdadeira
    }

Similar à linguagem de programação Python (uso do `elif`).