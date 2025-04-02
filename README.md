# Sistema de Monitoramento de Ambiente Inteligente com IoT

## Descrição

Este projeto tem como objetivo o desenvolvimento de um protótipo de sistema de monitoramento de ambiente inteligente utilizando sensores de Internet das Coisas (IoT), baseado na plataforma *Arduino. O sistema permite o monitoramento de parâmetros ambientais como temperatura, umidade e qualidade do ar, e exibe os dados em uma **interface gráfica* para facilitar a visualização e o controle. A proposta visa aplicar os conhecimentos adquiridos durante o módulo, abordando tanto a integração de sensores com a plataforma Arduino quanto a criação da interface gráfica para o usuário.

## Tecnologias Utilizadas

- *VS Code*: Para o desenvolvimento do código em Java utilizando a classe random para simular valores dos sensores.

## Estrutura do Projeto

```plaintext
Projeto-Monitoramento-Ambiente
│
├── código_java/             # Código para o Arduino
│   ├── Sensor.java          # Código de leitura dos sensores e envio dos dados
│
├── código_java/             # Código da interface gráfica
│   ├── monitorAmbiente.java # Script em Python para a interface gráfica
│
└── README.md                # Este arquivo
