package Exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 14 - Encontre o maior número primo da lista:

Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
public class Exercicio14 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(n -> {
                    if (Math.abs(n) < 2)
                        return false;
                    for (int i = 2; i < Math.abs(n); i++) {
                        if (Math.abs(n) % i == 0)
                            return false;
                    }
                    return true;
                })
                .max(Comparator.naturalOrder());
        System.out.println("O maior número primo é: " + maiorPrimo.get());
    }

}

