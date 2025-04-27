package Exercicios;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 17 - Filtrar os números primos da lista:

Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Exercicio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        List<Integer> numerosNaoPrimos = numeros.stream()
                .filter(n -> {
                    if (Math.abs(n) < 2)
                        return true;
                    for (int i = 2; i < Math.abs(n); i++) {
                        if (Math.abs(n) % i == 0)
                            return true;
                    }
                    return false;
                })
                .toList();
        numerosNaoPrimos.forEach(System.out::println);
    }
}
