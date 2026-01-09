import java.util.Scanner;

public class Main {
    void main() {
        // --- Seção 5 ---

        /*
        //---Expressões comparativas---
        //Uma expressão retorna se a comparação é verdadeira ou falsa, por exemplo 5>10 retorna falso, pois 5 é menor que 10

        //Operadores comparativos do Java
        //1. > maior
        //2. < menor
        //3. >= maior ou igual
        //4. <= menor ou igual
        //5. == igual (lembrando que o um único simbolo de igual é atribuição)
        //6. != diferente
        //Exemplo de comparação mostrando se é V ou F
        int x = 5;
        boolean resultado;
        resultado = x > 0;
        System.out.println(resultado);
        resultado = x == 3;
        System.out.println(resultado);
        resultado = 10 <= 30;
        System.out.println(resultado);
        resultado = x != 2;
        System.out.println(resultado);
        */

        //---Expressões lógicas---
        // Assim como as expressões comparativas, as expressões lógicas também retornam V ou F

        //Operadores lógicos do Java:
        //1. && E (Nesse operador todas as afirmações tem que ser verdadeiras)
        //2. || OU (Nesse operador basta uma das opções serem verdadeiras)
        //3. ! NÃO (Esse operador nega o resultado, então se o resultado era verdadeiro ele transforma em falso, e vice versa)

        /*
        //---Estrutura condicional---
        //Uma estrutura condicional é uma estrutura de controle que só permite que um certo bloco de comando seja executado perante a uma condição

        //Sintaxe da extrutura condicional:
        // if (<condição) {
        //  <comando 1>
        // } else {
        //  <comando 2>
        // }
        //O comando 1 será executado se a condição for verdadeira, se for falsa, o bloco de comando será pulado;
        //O comando 2 será executado se a condição for falsa, se for verdadeira, será executado o comando 1 e o comando 2 será pulado;
        //Obs: se não tiver else e a condição for falsa, o bloco de comando é ignorado completamente.

        //caso você queira analisar mais de uma condição você pode utilizar o comando else if, que se trata de um encadeamento de if
        // if (<condição) {
        //  <comando 1>
        // } else if (<condição2){
        //  <comando 2>
        // } else {
        //  <comando 3>
        // }

        //Exemplo de utilização
        Scanner teclado = new Scanner(System.in);
        int hora;
        System.out.print("Digite um horário: ");
        hora = teclado.nextInt();
        if (hora<24 && hora>=0){
            if(hora>5 && hora<12){
                System.out.println("Bom dia!");
            }else if(hora>12 && hora<19){
                System.out.println("Boa tarde!");
            }else {
                System.out.println("Boa noite");
            }
        }else {
            System.out.println("Você digitou uma hora que não existe, tente um número entre 0 e 23");
        }

        teclado.close();
        */

        //---Exercícios sobre estrutura condicional:---
        Scanner teclado = new Scanner(System.in);

        /*
        //Exercício 2:
        //Questão: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        boolean par;
        int num;
        System.out.print("Digite um número para verificar se ele é par: ");
        num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par!");
        }else {
            System.out.println("O número " + num + " é impar!");
        }
        */

        /*
        //Exercício 3:
        //Questão: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.

        int a, b;
        System.out.print("Digite dois número para verificar se eles são multiplos: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        if (a % b == 0 || b % a == 0){
            System.out.println("Sao multiplos");
        }else {
            System.out.println("Nao sao multiplos");
        }
        */

        //Exercício 4:

        teclado.close();

    }
}
