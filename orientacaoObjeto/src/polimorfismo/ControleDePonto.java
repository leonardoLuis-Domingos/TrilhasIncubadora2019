package polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {

        public void registraEntrada (Funcionario f ){
            SimpleDateFormat sdf = new SimpleDateFormat(" dd/MM/yyyy HH : mm : ss ");
            Date agora = new Date();
            System.out.println("Entrada :" + f.getCodigo());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Data: " + sdf.format(agora));
        }

        public void registraSaida (Funcionario f ) {

            SimpleDateFormat sdf = new SimpleDateFormat ( " dd/MM/yyyy HH : mm : ss " ) ;
            Date agora = new Date () ;
            System.out.println ("Saida: " + f . getCodigo ());
            System.out.println("Nome: " + f.getNome());
            System.out.println ("Data: " + sdf.format(agora));
        }
}
