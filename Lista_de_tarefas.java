import java.lang.*;

class Exercicio3 {

    public static void main(String args[]) {

        // Array para guardar até 100 tarefas
        String tarefas[] = new String[100];

        String tarefa;
        int i = 0;

        // Cadastro das tarefas
        while (true) {

            tarefa = IO.readln("Digite uma tarefa (ou 'fim' para sair): ");

            // Verifica se digitou fim
            if (tarefa.equals("fim")) {
                break;
            }

            // Guarda a tarefa no array
            tarefas[i] = tarefa;
            i++;
        }

        // Mostrar tarefas cadastradas
        IO.println("\nLista de tarefas:");

        for (int j = 0; j < i; j++) {
            IO.println(tarefas[j]);
        }
    }
}