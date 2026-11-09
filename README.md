📊 Analisador de Frequência Numérica em Java
Aplicação desenvolvida em Java que gera uma sequência de números aleatórios a partir de entradas do usuário, analisa a frequência de repetição de cada valor e exibe os números que mais apareceram no console.

O projeto foi estruturado aplicando o princípio de responsabilidade única e injeção de dependências simples, separando o código em camadas de entrada, processamento, saída e orquestração.

🛠️ Tecnologias e Recursos
Java 21+ (utiliza métodos de SequencedCollection como .getLast())

Java Collections Framework: List (ArrayList), Map (HashMap)

Programação Orientada a Objetos (POO): Separação em camadas e injeção de dependência via construtor

📐 Estrutura do Projeto
O código está organizado em pacotes modulares dentro de main.java:

Plaintext
src/main/java/
├── Entrada/
│   └── RecebeInputs.java       # Leitura dos dados no console e geração da lista aleatória
├── Processamento/
│   ├── PreencheContador.java   # Mapeamento da contagem de ocorrências (HashMap)
│   └── Contador.java           # Identificação do maior número de aparições
├── Saida/
│   └── Impressora.java         # Exibição dos resultados no terminal
└── Principal/
    ├── Algoritimo.java         # Orquestrador do fluxo da aplicação (Controller)
    └── Main.java               # Ponto de entrada do sistema
🔄 Fluxo de Funcionamento
Entrada de Dados: O usuário informa o limite do gerador (semente/teto) e a quantidade de elementos desejada para a lista.

Geração: A classe RecebeInputs preenche a lista com valores inteiros aleatórios via Random.

Contagem: O PreencheContador percorre a lista e monta um Map<Integer, Integer> com a frequência de cada número.

Análise: O Contador ordena os valores de frequência acumulados, identifica o maior número de repetições e descobre quais números atingiram esse topo.

Exibição: A Impressora imprime a lista gerada e os números com maior taxa de ocorrência.

💻 Como Executar
Pré-requisitos
JDK 21 ou superior instalado e configurado nas variáveis de ambiente.

Passos
Clone o repositório:

Bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
Compile as classes:

Bash
javac -d bin src/main/java/*/*.java
Execute o projeto:

Bash
java -cp bin main.java.Principal.Main
