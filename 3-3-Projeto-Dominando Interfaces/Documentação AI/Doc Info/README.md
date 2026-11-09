Documentação Info — Projeto Figuras Geométricas
Antes de analisar os códigos, vamos entender o que o exercício está solicitando.

Projeto — Cálculo de Áreas de Figuras Geométricas
O objetivo é desenvolver uma aplicação em Java que permita calcular a área de diferentes figuras geométricas, utilizando principalmente Interfaces, Abstração e Polimorfismo.

1. Estrutura do projeto
A interface GeometricForm será implementada pelas três figuras geométricas.

Interface — GeometricForm

Define o método getArea() para calcular a área.

Quadrado

Square

Lado × lado

Retângulo

Rectangle

Base × altura

Círculo

Circle

PI × raio²

2. Interface — GeometricForm
Deverá possuir:

Um método chamado getArea().

O método deverá retornar um valor do tipo double, correspondente à área da figura geométrica.

3. Três figuras geométricas
Quadrado — Square

Possui o valor dos seus lados. Deverá implementar o método getArea() para calcular a área do quadrado.

Retângulo — Rectangle

Possui os valores de base e altura. Deverá implementar o método getArea() para calcular a área do retângulo.

Círculo — Circle

Possui o atributo raio. Deverá implementar o método getArea() para calcular a área do círculo.

4. Regras importantes do funcionamento
Figura

Atributos

Cálculo da área

Quadrado

Lado

lado × lado

Retângulo

Base e altura

base × altura

Círculo

Raio

PI × raio²

Todas as figuras deverão implementar a interface GeometricForm e possuir um método que retorne o valor de sua área.

5. O que vamos observar na análise
Quando você enviar os arquivos, vou verificar:

Se a interface foi implementada corretamente.

Se as três figuras implementam GeometricForm.

Se os atributos representam corretamente as dimensões de cada figura.

Se os cálculos das áreas estão corretos.

Se os métodos retornam os valores esperados.

Se o polimorfismo foi aplicado corretamente.

Se a classe Main permite escolher a figura, informar suas dimensões e apresentar o resultado.

Por enquanto, não vamos escrever código nem documentação das classes.

Primeiro quero analisar o projeto que você realmente desenvolveu, comparando-o com o que o exercício está solicitando.

Pode mandar a primeira classe.

Se quiser, posso:

Enviar código da interface GeometricForm para análise detalhada
Enviar código da classe Quadrado para implementação do cálculo da área
Enviar código da classe Retângulo para verificação da área e atributos
