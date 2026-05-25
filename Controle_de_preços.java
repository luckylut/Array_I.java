import java.lang.*;

class Exercicio2 {

    public static void main(String args[]) {

        // Array para guardar os preços
        double precos[] = new double[5];

        int i;
        double maior, menor;

        // Ler os 5 preços
        for (i = 0; i < 5; i++) {

            IO.print("Digite um preço: ");
            precos[i] = Double.parseDouble(IO.readln());
        }

        // Definir primeiro valor como maior e menor
        maior = precos[0];
        menor = precos[0];

        // Comparar os valores
        for (i = 1; i < 5; i++) {

            if (precos[i] > maior) {
                maior = precos[i];
            }

            if (precos[i] < menor) {
                menor = precos[i];
            }
        }

        // Mostrar resultados
        IO.println("\nMaior preço: " + maior);
        IO.println("Menor preço: " + menor);
    }
}