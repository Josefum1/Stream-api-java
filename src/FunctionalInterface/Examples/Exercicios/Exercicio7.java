package Exercicios;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 7 - Encontrar o segundo número maior da lista:

Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Exercicio7 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int maiorNumero =  numeros.stream()
               .reduce(0, Integer::max);

        int segundoMaior = numeros.stream()
                .filter(n -> n < maiorNumero)
                .reduce(0, Integer::max);

        System.out.println(segundoMaior);


    }
}
