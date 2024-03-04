# Exercício WHILE 01
## Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Inválida". Quando a senha for informada corretamente, deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Exemplo:
Entrada | Saída
------- | ------
2200    | Senha Inválida
1020    | Senha Inválida
2022    | Senha Inválida
2002    | Acesso Permitido

---

# Exercício WHILE 02
## Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto, escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma das coordenadas for NULA (nesta situação, sem escrever mensagem alguma).

Exemplo:
Entrada | Saída
------- | ------
2 2     | primeiro
3 -2    | quarto
-8 -1   | terceiro
-7 1    | segundo
0 2     |

---

# Exercício WHILE 03
## Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1. Álcool 2. Gasolina 3. Diesel 4. Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4), deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrita a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

Exemplo:
Entrada | Saída
------- | ------
8       |
1       |
7       |
2       |
2       |
4       |
        | MUITO OBRIGADO
        | Álcool: 1
        | Gasolina: 2
        | Diesel: 0

---

# Exercício FOR 01
## Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
Exemplo:
Entrada: Saída:
8 1
3
5
7

---

# Exercício FOR 02
## Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
Exemplo:
Entrada: Saída:
5
14
123
10
-25
32
2 in
3 out

---

# Exercício FOR 03
## Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
Exemplo:
Entrada: Saída:
3
6.5 4.3 6.2
5.1 4.2 8.1
8.0 9.0 10.0
5.7
6.3
9.3

---

# Exercício FOR 04
## Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
Exemplo:
Entrada: Saída:
3
3 -2
-8 0
0 8
-1.5
divisao impossivel
0.0

---

# Exercício FOR 05
## Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
Exemplos:
Entrada: Saída:
4 24
Entrada: Saída:
1 1
Entrada: Saída:
5 120
Entrada: Saída:
0 1

---

# Exercício FOR 06
## Ler um número inteiro N e calcular todos os seus divisores.
Exemplo:
Entrada: Saída:
6 1
2
3

---

# Exercício FOR 07
## Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
Exemplo:
Entrada: Saída:
5 1 1 1
2 4 8
3 9 27
4 16 64
5 25 125