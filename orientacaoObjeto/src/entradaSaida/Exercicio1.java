package entradaSaida;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        List<String> lista;
        lista = lerArquivo();
        System.out.println("Digite um conteudo");
        String conteudo = sc.nextLine();
        lista.add(conteudo);
        gravarArquivo(lista);
    }

    public static  List<String> lerArquivo() throws FileNotFoundException {

        List<String> lista = new ArrayList<>();
        InputStream arquivo = new FileInputStream("entrada.txt") ;
        Scanner scanner = new Scanner ( arquivo ) ;
        while ( scanner.hasNextLine () ) {
            String linha = scanner . nextLine () ;
            lista.add(linha);
        }
        return lista;

    }

    public static void gravarArquivo(List<String> lista) throws FileNotFoundException {

        FileOutputStream arquivo = new FileOutputStream("saida.txt") ;
        PrintStream printStream = new PrintStream( arquivo ) ;
        for (String s:lista) {
            printStream.println(s);
        }
    }
}
