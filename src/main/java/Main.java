import java.util.Scanner;

public class Main {
    void main (){
        // --- Seção 6 ---

        //---Estrutura repetitiva enquanto WHILE---
        //É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira
        //Quando utilizamos? Utilizamos quando não sabemos exatamente a quantidade de repetições que serão realizadas.
        //sintaxe/regra:
        // while (condição {
        //      comando 1
        //      comando 2
        // }
        //Regra => Verdadeiro: executa e volta / falso: sai do looping
        // Exemplo:
        Scanner teclado = new Scanner(System.in);
        double num = 1;
        double soma = 0;
        System.out.print("Para finalizar o envio de numeros digite 0!\nInsira os números que você deseja somar: ");
        while (num != 0) {
            num = teclado.nextDouble();
            soma += num;
        }
        System.out.println("A soma dos números é: " + soma);

    }
}
