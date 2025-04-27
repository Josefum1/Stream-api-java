package Exercicios;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 18 - Verifique se todos os números da lista são iguais:

Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Exercicio18 {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    boolean todosIguais = numeros.stream()
            .allMatch(n -> n.equals(1));

    if(todosIguais){
        System.out.println("Todos sao iguais!");
    }
    else System.out.println("nao sao iguais");

    }
}
