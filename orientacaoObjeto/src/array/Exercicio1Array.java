package array;

import java.util.Scanner;

public class Exercicio1Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja digitae");
        int quantidade = sc.nextInt();

        double[] vetor = new double[quantidade];

        for(int i = 0;i<quantidade;i++){
            System.out.println("Digite um numero");
            String numero = sc.next();
            double numeroConvertido = Double.parseDouble( numero ) ;
            vetor[i] = numeroConvertido;
        }
        double soma = 0;
        for(int i=0;i<vetor.length;i++){
            soma +=vetor[i];
        }

        System.out.println("Media: " + soma / quantidade);
    }
}
