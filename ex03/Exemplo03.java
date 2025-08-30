package ex03;

import java.util.Scanner;

public class Exemplo03 {
    public static Scanner input = new Scanner(System.in);
    public static final int QTD = 2;
    
    public static void main(String[] args) {
        int soma = 0;
        double media;
        int[] numeros = new int[QTD];

        for (int i = 0; i < QTD; i++) {
            System.out.printf("Digite o %d número: ", i+1);
            numeros[i] = input.nextInt();
            soma += numeros[i];
        }
        media = (double) soma / QTD;
        System.out.printf("A média destes %d números é: %f\n", QTD, media);

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.printf("O número %d é maior que a média!\n", numeros[i]);
            }
        }
    }
}
