package Exercicios;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 13 - Filtrar os números que estão dentro de um intervalo:

Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println("Insira o começo do intervalo: ");
        int Intervalo1 = sc.nextInt();
        System.out.println("Insira o final do intervalo: ");
        int Intervalo2 = sc.nextInt();

        List<Integer> listaIntervalo = numeros.stream()
                .filter(n -> n > Intervalo1 && n < Intervalo2 )
                .toList();

        listaIntervalo.forEach(System.out::println);
    }
}


