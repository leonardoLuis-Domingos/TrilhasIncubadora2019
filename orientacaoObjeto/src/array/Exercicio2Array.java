package array;

import java.util.Scanner;

public class Exercicio2Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja digitar");
        int quantidade = sc.nextInt();

        int[] vetor = new int[quantidade];

        for(int i =0;i< vetor.length;i++){
            System.out.println("Digite um numero");
            int numero = sc.nextInt();
            vetor[i]= numero;
        }
        int verifica = vetor[0];
        for (int i=0;i< vetor.length;i++){
            if(verifica > vetor[i]){
                verifica = verifica;
            }else{

                verifica = vetor[i];
            }
        }
        System.out.println("O maior numero "+ verifica);

    }
}
