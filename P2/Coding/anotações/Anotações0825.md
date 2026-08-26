  # Fundamentos de Java
## POO / Programação Orientada a Objetos

### Paradigma Procedimental X Orientado a Objetos

- O paradigma procedimental organiza o programa em termos de algoritmos
- O paradigma orientado a objetos organiza o programa em termos de objetos

### Algoritmo X Objetos

Sair de:

```
"arq1.py"
    # entrada
        input()
    # processamento
    # saída
        print()
```

Para: (POO - Classes)

```
ClasseMain/aula > classe2 < classe3
classe4 <> classe5
```

### Princípios da orientação a objetos

- Abstração:
- Modularidade: O sistema deve ser composto de objetos altamente coesos e fracamente acoplados
- Encapsulamento: Esconder seus dados e os detalhes de sua implementação
- Hierarquia: Objetos devem ser organizados no sistema de forma hierárquica

### O que é um paradigma

"Um paradigma define a forma (e os recursos) para se resolver um problema"
— Prof. Victor André (IFPB)

Exemplos:
- Não estruturado;
- Estruturado;
- Orientado a objetos;
- Funcional;
- Imperativo

### JAVA

É para todas as áreas, em especial para internet, sistemas em rede e computação móvel.

Características:
- Portabilidade: Independente
- Multithreading: Possibilita desenvolver programas multitarefas
- Segurança: Faz verificação automática do código carregado para garantir segurança
- Orientada a objetos: Relacionamento de objetos
- Acesso: Access List

### A Máquina Virtual Java (JVM)

Uma Máquina Virtual é uma máquina imaginária que é implementada pela sua simulação em uma máquina real.

Cabe ao interpretador Java de cada plataforma de hardware específica assegurar a execução do código compilado.

### DOWNLOAD JAVA

1) JDK e Configurar.
2) JRE (Não é necessário, porém para rodar qualquer aplicação Java precisa do JRE)

### IDEs para programar em Java

- Eclipse: Simples, sem dor de cabeça com ele.
- IntelliJ: O mais completo, porém mais pesado.

### Estrutura básica de um programa em Java

```java
public class MeuPrograma {
    public static void main(String[] args){
        //seu programa será escrito a partir daqui
    }
}
```

- O nome do arquivo Java tem que ser o mesmo nome do `public class nome_arquivo {`
- `public`, `static`, `void`, `main` só será aprendido em POO. Por enquanto, "abstraia".
- Lembrar das identações (TAB)
- Para fazer comentários, escreva `//comentários`. Assim, essa linha não será executada.
  - Para comentários em múltiplas linhas, comece na primeira linha com `/*` e termine seu comentário com `*/`

### PRÁTICA

Para criar um projeto no Eclipse:

- File > New > Other > Java Project
  - Use a versão do JRE compatível com a versão baixada no seu PC
    - Para verificar a versão baixada no seu PC, vá no CMD e digite `java -version`.
  - Desativar "Create module-info.java file"

- Com o botão direito na pasta "src": File > New > Package
- Com o botão direito no arquivo criado: File > New > Class

**Escrevendo códigos simples:**

- Para começar a escrever:
  Atalho: `main` > Ctrl + espaço > Enter

  ```java
  public static void main(String[] args) {

  }
  ```

- Para printar:
  Atalho: `Syso` > Ctrl + espaço > Enter

  ```java
  System.out.println("");
  ```

- Para rodar o programa diretamente:
  Atalho: Ctrl + F11

- Para importar a biblioteca de leitura de dados:

  Antes do `public class`:
  ```java
  import java.util.Scanner;
  ```

  Dentro do `public class` e `static`:
  ```java
  Scanner scanner = new Scanner(System.in);
  ```

  Final do `public class` e `static`:
  ```java
  scanner.close();
  ```

- Para leitura de dados:

  ```java
  System.out.println("Digite X: ");
  tipoVar nomeVar = scanner.nextTipoVar();
  ```

- Para printar uma variável:

  ```java
  System.out.println(""+nomeVar);
  ```
