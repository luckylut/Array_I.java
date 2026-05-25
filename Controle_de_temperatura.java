import java.lang.*;

class Exercicio4 {

    public static void main(String args[]) {

        // Arrays para guardar temperaturas
        double celsius[] = new double[100];
        double fahrenheit[] = new double[100];

        String valor;
        int i = 0;

        double somaCelsius = 0;
        double somaFahrenheit = 0;

        // Cadastro das temperaturas
        while (true) {

            valor = IO.readln("Digite a temperatura em Celsius (ou 'sair'): ");

            // Verifica se o usuário quer sair
            if (valor.equals("sair")) {
                break;
            }

            // Guarda temperatura em Celsius
            celsius[i] = Double.parseDouble(valor);

            // Converte para Fahrenheit
            fahrenheit[i] = (celsius[i] * 9 / 5) + 32;

            // Soma para calcular média
            somaCelsius = somaCelsius + celsius[i];
            somaFahrenheit = somaFahrenheit + fahrenheit[i];

            i++;
        }

        // Verifica se foi digitada alguma temperatura
        if (i > 0) {

            double mediaCelsius = somaCelsius / i;
            double mediaFahrenheit = somaFahrenheit / i;

            // Mostrar médias
            IO.println("\nMédia Celsius: " + mediaCelsius);
            IO.println("Média Fahrenheit: " + mediaFahrenheit);

        } else {

            IO.println("Nenhuma temperatura foi digitada.");
        }
    }
}