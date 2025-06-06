package Exercicios;

import java.util.Arrays;
import java.util.List;

/*
Para todos os desafios, utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Desafio 15 - Verifique se a lista contém pelo menos um número negativo:

Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
 */
public class Exercicio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean resultado = numeros.stream()
                .anyMatch(n -> n <0);

        if(resultado) {
            System.out.println("Existem números negativos nessa lista!");
        }
        else System.out.println("Não há números negativos nessa lista!");


    }


}
