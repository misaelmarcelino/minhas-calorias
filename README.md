# Sistema de Acompanhamento de Consumo Diário de Calorias - Em Implementação

Este projeto consiste no desenvolvimento do **back-end** de um sistema de controle e acompanhamento de consumo diário de calorias. A aplicação é **multiusuária**, permitindo que cada usuário registre os alimentos consumidos ao longo do dia, divididos por refeições.

## Funcionalidades

### 1. Lançamento de Alimentos

- Os usuários poderão **registrar os alimentos consumidos durante o dia**, especificando:
  - Refeição correspondente: **café da manhã, almoço, lanche da tarde ou jantar**.
- Se o alimento **não estiver cadastrado**, o usuário poderá registrá-lo, informando:
  - Quantidade de **carboidratos**, **gorduras totais** e **proteínas**, por **100g**.

### 2. Histórico de Pesagem

- Os usuários poderão registrar **pesagens periódicas**, com os seguintes dados:
  - Peso corporal
  - Data da pesagem
  - **IMC (Índice de Massa Corporal)** será calculado automaticamente com base nesses dados.
- O sistema permitirá a **visualização do histórico de pesagem**, para acompanhamento do progresso ao longo do tempo.

## Estrutura do Banco de Dados

As tabelas principais do sistema são:

- `TB_USER`: Informações de usuários
- `TB_ENTRY`: Lançamentos diários de refeições
- `TB_SACK`: Alimentos cadastrados no sistema
- `TB_ITEMS_ENTRY`: Alimentos consumidos por lançamento
- (nova) `TB_WEIGHT_HISTORY`: Histórico de pesagem dos usuários *(sugestão a ser adicionada)*

## Tecnologias Recomendadas

- **Banco de Dados:** Oracle SQL
- **Back-end:** Java + Spring Boot ou PHP (a definir)
- **API RESTful:** para consumo de dados pelos aplicativos
- **Segurança:** autenticação por token (JWT) para múltiplos usuários

## Requisitos Funcionais

- Cadastro e login de usuários
- Cadastro de alimentos (com valores nutricionais)
- Registro de refeições com os alimentos consumidos
- Cálculo automático de calorias por porção
- Registro e visualização do histórico de pesagens com IMC

Misael Souza Marcelino
Desenvolvedor Full Stack

Projeto desenvolvido em conjunto ao conteudo da Graduaçao de Analise e Desenvolvimento de Sistemas  -
FIAP - Faculdade de Informatica e Administração Paulista - 3’Semestre
