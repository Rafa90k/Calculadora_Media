package calculadora.model;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Digite o primeiro numero: ");
        a = scan.nextInt();

        System.out.println("Digite outro numero: ");
        b = scan.nextInt();

        System.out.println("Digite outro numero: ");
        c = scan.nextInt();

        System.out.println("Digite outro numero: ");
        d = scan.nextInt();

        int soma = soma(a, b);
        int outro = outro(c, d);

        System.out.println("O resultado da soma é: " + (soma + outro) / 4);
    }
    public static int soma (int a, int b){
        return a + b ;
    }
    public static  int outro (int c, int d){
        return c + d;
    }
}
