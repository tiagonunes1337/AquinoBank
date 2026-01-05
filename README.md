O **AquinoBank** é um simulador de operações bancárias desenvolvido com o objetivo de consolidar os fundamentos da **Engenharia de Software** e da **Programação Orientada a Objetos (POO)**.  
O projeto foca na aplicação de regras de negócio automatizadas, utilizando uma arquitetura limpa, organizada e de fácil manutenção.

O desenvolvimento foi realizado inteiramente em ambiente **Linux (Ubuntu)**, com uso do **Apache Maven** para gerenciamento de dependências e build do projeto.

---

## Tecnologias e Ferramentas

- **Linguagem:** Java 17 (JDK 17)
- **Build Tool:** Apache Maven
- **IDE:** Apache NetBeans
- **Sistema Operacional:** Ubuntu Linux
- **Controle de Versão:** Git

---

## Conceitos de Engenharia de Software Aplicados

Para elevar o projeto além de um simples exercício, foram aplicados os quatro pilares da Programação Orientada a Objetos:

### 1. Encapsulamento

Os atributos críticos, como o saldo, utilizam modificadores de acesso `private` e `protected`, garantindo que alterações ocorram apenas por meio de métodos validados (`sacar` e `depositar`).

### 2. Herança

A classe `ContaCorrente` estende a classe base `Conta`, herdando atributos e comportamentos comuns, reduzindo duplicidade de código.

### 3. Polimorfismo

O método de saque foi sobrescrito (`@Override`) na classe `ContaCorrente` para aplicação automática de taxa administrativa (R$ 0,50 por operação).

### 4. Abstração

O sistema foi organizado em pacotes:
- `br.com.aquino.model` → regras de negócio
- `br.com.aquino.main` → execução do programa

---

## Funcionalidades

- Deposito: validação de entrada para aceitar apenas valores positivos
- Saque: proteção contra saques superiores ao saldo disponível
- Taxacao Automatica: regras de negócio específicas por tipo de conta usando polimorfismo
- Gestao de Pacotes: estrutura profissional de diretórios para facilitar manutenção

---

## Como Executar no Terminal (Ubuntu)

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/AquinoBank.git
    ```

2. Acesse a pasta do projeto:
    ```bash
    cd AquinoBank
    ```

3. Compile e execute via Maven:
    ```bash
    mvn compile exec:java -Dexec.mainClass="br.com.aquino.main.ExecutarBanco"
    ```

---

## Exemplo de Resultado

Ao depositar R$ 500,00 em uma conta com saldo inicial de R$ 1.000,00 e realizar um saque de R$ 100,00, o sistema exibirá:

```
Saque realizado!
Saldo atual: 1399.5
```

O valor reflete o abatimento automático da taxa de R$ 0,50, aplicada via polimorfismo na classe ContaCorrente.

---

## Autor

**Tiago de Aquino**
Estudante de Engenharia de Software na UCB
Entusiasta de automação e desenvolvimento Java
- **Sistema Operacional:** Ubuntu Linux
- **Controle de Versão:** Git

