# Trabalho-Estutura-de-Dados--Pilha-e-Filha-
Implementação de um programa em Java que simule um sistema de gerenciamento de atendimento ao cliente utilizando uma lista encadeada para Implementar uma pilha e uma fila. A pilha será usada para armazenar um histórico de solicitações de serviço, enquanto a fila será usada para gerenciar a ordem de atendimento dos clientes.
# Sistema de Gerenciamento de Atendimento - Estrutura de Dados em Java

##  Sobre o Projeto
-   Uma **Pilha** é usada para manter um histórico de solicitações de serviço, seguindo a lógica **LIFO** (Last In, First Out).
-   Uma **Fila** é utilizada para gerenciar a ordem de atendimento dos clientes, seguindo a lógica **FIFO** (First In, First Out).

##  Estruturas Implementadas
* **Pilha (Histórico de Solicitações):**
    * `adicionar(Elemento)`: Adiciona uma nova solicitação no topo da pilha (push).
    * `remover()`: Remove a solicitação do topo da pilha (pop).
    * `estaVazia()`: Verifica se a pilha está vazia.
    * `mostrarHistorico()`: Exibe todos os elementos da pilha.

* **Fila (Ordem de Atendimento):**
    * `adicionar(Elemento)`: Adiciona um novo cliente ao final da fila (enqueue).
    * `atenderProximo()`: Remove o cliente do início da fila (dequeue).
    * `estaVazia()`: Verifica se a fila está vazia.
    * `mostrarFila()`: Exibe todos os elementos na fila de atendimento.

##  Estrutura de Arquivos

O projeto está organizado de forma modular para facilitar a compreensão:

-   `Elemento.java`: Classe que representa os dados (clientes e solicitações).
-   `No.java`: Classe que representa o nó da lista encadeada, a base das estruturas.
-   `Pilha.java`: Implementação da estrutura de Pilha.
-   `Fila.java`: Implementação da estrutura de Fila.
-   `SistemaGerenciamento.java`: Classe principal (`main`) que executa o menu interativo e gerencia o sistema.

##  Como Executar

Para compilar e executar o projeto, siga os passos abaixo:

1.  **Pré-requisitos:**
    * É necessário ter o **JDK (Java Development Kit)** instalado em sua máquina.

2.  **Compilação:**
    * Abra um terminal ou prompt de comando na pasta raiz do projeto (onde os arquivos `.java` estão localizados).
    * Execute o seguinte comando para compilar todos os arquivos:
        ```bash
        javac *.java
        ```
    * Alternativamente pode-se simplemente abrir o projeto em uma IDE de preferencia (Netbeans,Intellij,etc) adicionar todos os arquivos e clicar em Run.


3.  **Execução:**
    * Após a compilação, execute o programa com o comando:
        ```bash
        java SistemaGerenciamento
        ```

4.  **Interação:**
    * Um menu interativo será exibido no terminal, permitindo que você utilize todas as funcionalidades do sistema.
