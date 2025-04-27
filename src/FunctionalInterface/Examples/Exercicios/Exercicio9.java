package Exercicios;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):

Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

 */

import java.util.Arrays;
import java.util.List;

public class Exercicio9 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .distinct()
                .forEach(System.out::println);
    }
}