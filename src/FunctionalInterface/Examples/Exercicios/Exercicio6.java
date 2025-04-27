package Exercicios;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 6 - Verificar se a lista contém algum número maior que 10:

Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Exercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        boolean maiorQueDez = numeros.stream()
                .anyMatch(n -> n > 10);

        if (maiorQueDez){
            System.out.println("A lista tem um numero maior que 10! ");
            numeros.stream()
                    .filter(n -> n > 10)
                    .forEach(System.out::println);
        }
        else System.out.println("Não há números maior que 10");
    }

}
