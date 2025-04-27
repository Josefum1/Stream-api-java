package Exercicios;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 5 - Calcule a média dos números maiores que 5:

Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */


import java.util.Arrays;
import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, Integer::sum);

        System.out.println("A soma dos numeros acima de 5 é: " + resultado);
    }
}
