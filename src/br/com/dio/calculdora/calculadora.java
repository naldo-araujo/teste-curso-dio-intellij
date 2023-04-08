package br.com.dio.calculdora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;
        System.out.println("Digite o primeiro numero:");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        b = scan.nextInt();


        int somar = somar(a, b);
        int subtracao = subtracao(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("soma:" +somar);
        System.out.println("sub: " +subtracao);
        System.out.println("mult: " +multiplicar);
        System.out.println("div: " +dividir);
    }
    public static int somar (int a, int b){
        return (a+b);
    }
    public static int subtracao (int a, int b){
        return (a-b);
    }
    public static int multiplicar (int a, int b){
        return (a*b);
    }
    public static int dividir (int a, int b){
        return (a/b);
    }
}
