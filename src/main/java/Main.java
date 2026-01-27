import java.util.Scanner;
import java.lang.Math;

public class Main {
    void main (){
        // --- Seção 6 ---

        //---Estrutura repetitiva enquanto (WHILE)---
        //É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira
        //Quando utilizamos?
        //Utilizamos quando não sabemos exatamente a quantidade de repetições que serão realizadas.

        //sintaxe/regra:
        // while (condição {
        //      comando 1
        //      comando 2
        // }

        //Regra => Verdadeiro: executa e volta / falso: sai do looping

        // Exemplo:
        /*
        Scanner teclado = new Scanner(System.in);
        double num = 1;
        double soma = 0;
        System.out.print("Para finalizar o envio de numeros digite 0!\nInsira os números que você deseja somar: ");
        while (num != 0) {
            num = teclado.nextDouble();
            soma += num;
        }
        System.out.println("A soma dos números é: " + soma);
        */

        //---Exercícios de WHILE---

        //Exercício 1
        //Questão: Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        /*
        Scanner teclado = new Scanner(System.in);
        int senha;
        System.out.print("Escreva a senha: ");
        senha = teclado.nextInt();
        while (senha != 2002){
            System.out.println("Senha invalida");
            System.out.print("Escreva a senha: ");
            senha = teclado.nextInt();
        }
        System.out.println("Acesso Permitido");
        teclado.close();
        */

        //Exercício 2
        //Questão:Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva 2 números para as coordenadas: ");
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }
            System.out.print("Escreva 2 números para as coordenadas: ");
            x = teclado.nextInt();
            y = teclado.nextInt();
        }
        teclado.close();
         */

        //Exercício 3
        //Questão:Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("1.Álcool\n2.Gasolina\n3.Diesel\n4.fim");
        System.out.print("Informe qual o tipo de combustivel você irá utilizar: ");
        int combustivel = teclado.nextInt();
        int alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;

        while (combustivel != 4) {
            if (combustivel < 5 && combustivel > 0) {
                if (combustivel == 1) {
                    alcool++;
                } else if (combustivel == 2) {
                    Gasolina++;
                } else {
                    Diesel++;
                }
            }
            System.out.print("Informe qual o tipo de combustivel você irá utilizar: ");
            combustivel = teclado.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + Diesel);

        teclado.close();
        */

        //---Estrutura repetitiva "para" (FOR)---
        // É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
        // Quando utilizar?
        // Utilizamos quando se sabe previamente a quantidade de repetições, ou intervalo de valores.

        // Sintaxe/Regra:
        // for (inicio (por exemplo int i = 0); condição; incremento (exemplo i++){
        //      comando 1;
        //}

        //Inicio => executa somente na primeira vez
        //Condição => Verdadeiro: executa e volta; Falso: sai do for;
        //Incremento => Executa toda vez depois de voltar

        //Exemplo:
        /*
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int soma = 0;
        for (int i=0; i<N; i++) {
            int x = teclado.nextInt();
            soma += x;
        }
        System.out.println(soma);
        teclado.close();
        */
        //OBS: Perceba que a estrutura "para" é ótima para se fazer uma repetição baseada em uma CONTRAGEM:
        //OBS: quando utilizamos o i++ ele incremente, quando utilizamos o i-- ele decrementa

        //---Exercícios de FOR---

        //Exercício 1:
        //Questão:Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva um número inteiro entre 1 e 1.000: ");
        int x = teclado.nextInt();
        if (x<=1000){
            for (int i = 1; i<=x; i++){
                if (i%2 != 0){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Digite um número menor que 1.000");
        }
        */

        //Exercício 2:
        //Questão: Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantos números você deseja inserir: ");
        int N = teclado.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i<N; i++){
            System.out.println("Digite o " + (i+1) + "º número");
            int X = teclado.nextInt();
            if (X >= 10 && X <= 20){
                in++;
            }else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        teclado.close();
        */

        //Exercício 3:
        //Questão:Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        //de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        //conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de casos de teste: ");
        int n = teclado.nextInt();
        double n1;
        double n2;
        double n3;
        double resultado;
        for (int i = 0; i<n; i++) {
            System.out.print("Digite os 3 valores do " + (i + 1) + "º caso: ");
            n1 = teclado.nextDouble();
            n2 = teclado.nextDouble();
            n3 = teclado.nextDouble();
            resultado = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5);
            System.out.printf("%.1f%n",resultado);
        }
        teclado.close();
        */

        //Exercício 4:
        //Questão:Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantos pares de números você deseja fazer divisão: ");
        int n = teclado.nextInt();
        double n1;
        double n2;
        double resultado;
        for (int i = 0; i<n; i++){
            System.out.print("Digite os 2 valores da " + (i + 1) + "ª divisão: ");
            n1 = teclado.nextDouble();
            n2 = teclado.nextDouble();
            if (n2 == 0) {
                System.out.println("Divisao impossivel");
            } else {
                resultado = n1/n2;
                System.out.printf("%.1f%n",resultado);
            }
        }
        teclado.close();
        */

        //Exercício 5:
        //Questão:Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        //Lembrando que, por definição, fatorial de 0 é 1.
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor para descobrir seu respectivo fatorial: ");
        int n = teclado.nextInt();
        int resultado = n;
        if (n == 0){
            System.out.println("1");
        }else {
            for (int i = 1; i<n; i++){
                resultado *= (n-i);
            }
            System.out.println(resultado);
        }
        teclado.close();
         */

        //Exercício 6:
        //Questão: Ler um número inteiro N e calcular todos os seus divisores.
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor para descobrir seus divisores: ");
        int n = teclado.nextInt();
        int acumulador;
        for (int i = 1; i<=n; i++){
            if (n%i == 0) {
                System.out.println(i);
            }
        }
        teclado.close();
         */

        //Exercício 7:
        //Questão:Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        //começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor positivo: ");
        int n = teclado.nextInt();
        int resultado;
        if (n>0) {
            for (int i = 1; i<=n; i++) {
                for (int j = 1; j<=3; j++) {
                    resultado = (int) Math.pow(i,j);
                    System.out.print(resultado + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("Digite um valor positivo!");
        }
        teclado.close();
         */

        //---Estrutura repetitiva "faça enmquanto" (DO WHILE)---
        // É uma estrutura de controle que repete um bloco de comandos sempre uma vez e depois executa um while enquanto uma condição for verdadeira;
        // Então a principal diferença do DO WHILE pro WHILE é que ele sempre vai executar um bloco de comando pelo menos 1 vez, diferente do while, que se a condição for falsa desde o inicio, ele não executa o comando nenhuma vez.

        //sintaxe/regra:
        // Do {
        //      comando 1
        //      comando 2
        // } while (condição);

        //Regra => Verdadeiro: executa e volta / falso: sai do looping (porém ele primeiro executa o comando e só depois verifica se é verdadeiro ou não)

        //Exemplo: Fazer um programa para ler uma temperatura em celsius e mostrar o equivalente em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa
        // Fórmula: F = (9c/5) + 32
        /*
        Scanner teclado = new Scanner(System.in);
        String repetir;
        double tempC;
        double tempF;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            tempC = teclado.nextDouble();
            teclado.nextLine();
            tempF = ((9*tempC)/5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempF);
            System.out.print("Deseja repetir (s/n)? ");
            repetir = teclado.nextLine();
        } while (repetir.equals("s"));
        teclado.close();
        */

        //Segunda exemplo mudando de String pra char
        Scanner teclado = new Scanner(System.in);
        char repetir;
        double tempC;
        double tempF;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            tempC = teclado.nextDouble();
            teclado.nextLine();
            tempF = ((9*tempC)/5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempF);
            System.out.print("Deseja repetir (s/n)? ");
            repetir = teclado.next().charAt(0);
        } while (repetir != 'n');
        teclado.close();
    }
}
