# Exercício 01
## Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Inválida". Quando a senha for informada corretamente, deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Exemplo:
Entrada | Saída
------- | ------
2200    | Senha Inválida
1020    | Senha Inválida
2022    | Senha Inválida
2002    | Acesso Permitido

---

# Exercício 02
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

# Exercício 03
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
