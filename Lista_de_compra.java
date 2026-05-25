import java.lang.*;

class Exercicio5 {

    public static void main(String args[]) {

        // Array para guardar produtos
        String produtos[] = new String[100];

        int opcao;
        int quantidade = 0;
        int i;
        boolean encontrado;

        do {

            // Menu
            IO.println("\n===== LISTA DE COMPRAS =====");
            IO.println("1 - Adicionar a lista");
            IO.println("2 - Pesquisar item");
            IO.println("3 - Remover item");
            IO.println("4 - Alterar item");
            IO.println("5 - Listar produtos");
            IO.println("6 - Sair");

            IO.print("Escolha uma opção: ");
            opcao = Integer.parseInt(IO.readln());

            // OPÇÃO 1 - Adicionar produtos
            if (opcao == 1) {

                while (true) {

                    String produto;

                    produto = IO.readln("Digite um produto (ou 'sair'): ");

                    if (produto.equals("sair")) {
                        break;
                    }

                    produtos[quantidade] = produto;
                    quantidade++;
                }
            }

            // OPÇÃO 2 - Pesquisar produto
            else if (opcao == 2) {

                String pesquisa;
                encontrado = false;

                pesquisa = IO.readln("Digite o produto para pesquisar: ");

                for (i = 0; i < quantidade; i++) {

                    if (produtos[i].equalsIgnoreCase(pesquisa)) {
                        encontrado = true;
                    }
                }

                if (encontrado) {
                    IO.println("Produto encontrado");
                } else {
                    IO.println("Produto não encontrado");
                }
            }

            // OPÇÃO 3 - Remover produto
            else if (opcao == 3) {

                String remover;
                encontrado = false;

                remover = IO.readln("Digite o produto para remover: ");

                for (i = 0; i < quantidade; i++) {

                    if (produtos[i].equalsIgnoreCase(remover)) {

                        encontrado = true;

                        // Move os itens para trás
                        for (int j = i; j < quantidade - 1; j++) {
                            produtos[j] = produtos[j + 1];
                        }

                        quantidade--;
                    }
                }

                if (encontrado) {
                    IO.println("Produto encontrado");
                } else {
                    IO.println("Produto não encontrado");
                }
            }

            // OPÇÃO 4 - Alterar produto
            else if (opcao == 4) {

                String antigo;
                String novo;
                encontrado = false;

                antigo = IO.readln("Digite o produto para alterar: ");

                for (i = 0; i < quantidade; i++) {

                    if (produtos[i].equalsIgnoreCase(antigo)) {

                        novo = IO.readln("Digite o novo nome do produto: ");
                        produtos[i] = novo;

                        encontrado = true;
                    }
                }

                if (encontrado) {
                    IO.println("Produto alterado com sucesso");
                } else {
                    IO.println("Produto não encontrado");
                }
            }

            // OPÇÃO 5 - Listar produtos
            else if (opcao == 5) {

                if (quantidade == 0) {

                    IO.println("Lista vazia");

                } else {

                    IO.println("\nProdutos cadastrados:");

                    for (i = 0; i < quantidade; i++) {
                        IO.println(produtos[i]);
                    }
                }
            }

            // Opção inválida
            else if (opcao != 6) {

                IO.println("Opção inválida");
            }

        } while (opcao != 6);

        // Encerrar programa
        IO.println("Programa encerrado com sucesso!");
    }
}