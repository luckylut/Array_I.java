import java.lang.*;
import java.lang.*;

class Exercicio1 {

    public static void main(String args[]) {

        // Array para guardar 5 convidados
        String convidados[] = new String[5];

        // Variável do for
        int i;

        // Cadastro dos convidados
        for (i = 0; i < 5; i++) {

            IO.print("Digite o nome do convidado: ");
            convidados[i] = IO.readln();
        }

        // Mostrar convidados
        IO.println("\nLista de convidados:");

        for (i = 0; i < 5; i++) {
            IO.println(convidados[i]);
        }

        // Mostrar quantidade
        IO.println("\nQuantidade de convidados: " + convidados.length);
    }
}