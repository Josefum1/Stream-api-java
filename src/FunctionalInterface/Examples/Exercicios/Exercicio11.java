package Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:

Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

 */
public class Exercicio11 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Function<Integer, Integer> quadrado = numero -> numero * numero;

        List<Integer> numerosAoQuadrado = numeros.stream()
                .map(quadrado)
                .toList();

        int resultado = numerosAoQuadrado.stream()
                .reduce(0, Integer::sum);


        System.out.println("A soma dos quadrados dos elementos da lista é: " + resultado);
}}
