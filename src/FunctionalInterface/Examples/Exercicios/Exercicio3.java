package Exercicios;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 3 - Verifique se todos os números da lista são positivos:

Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.forEach(n -> {
            if (n >= 0 ){
                System.out.println(n + " É um número positivo ");
            }
        });

    }
}
