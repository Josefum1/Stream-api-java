package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 12 - Encontre o produto de todos os números da lista:

Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

 */
public class Exercicio12 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> multiplicar = (num1,num2) -> (num1 * num2);

        int resultado = numeros.stream()
                .reduce(1, multiplicar);

        System.out.println(resultado);
    }
}
