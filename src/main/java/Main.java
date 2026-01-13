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

        /*
        //Exercício 4:
        //Questão: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        int horaInicial;
        int horaFinal;
        int horasJogadas;
        System.out.print("Insira a hora inicial do jogo: ");
        horaInicial = teclado.nextInt();
        if (horaInicial < 0 || horaInicial > 24){
            System.out.println("Você digitou uma hora inválida");
        } else{
            System.out.print("Agora insira a hora final: ");
            horaFinal = teclado.nextInt();
            if (horaFinal < 0 || horaFinal > 24){
                System.out.println("Você digitou uma hora inválida");
            }else {
                if (horaInicial >= horaFinal){
                    horasJogadas = ((horaInicial-24)-horaFinal)*-1;
                } else {
                    horasJogadas = horaFinal - horaInicial;
                }
                System.out.println("O jogo durou " + horasJogadas + " hora(s)");
            }
        }
        */

        /*
        //Exercício 5:
        //Questão: Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.
        int codigo;
        int quantidade;
        double valorFinal;
        System.out.print("Digite o código do produto: ");
        codigo = teclado.nextInt();
        System.out.print("Digite a quantidade desse produto: ");
        quantidade = teclado.nextInt();
        if (codigo == 1){
            valorFinal = 4.00 * quantidade;
            System.out.printf("Total: R$ %.2f%n", valorFinal);
        }else if (codigo == 2){
            valorFinal = 4.50 * quantidade;
            System.out.printf("Total: R$ %.2f%n", valorFinal);
        } else if (codigo == 3) {
            valorFinal = 5.00 * quantidade;
            System.out.printf("Total: R$ %.2f%n", valorFinal);
        }else if (codigo == 4) {
            valorFinal = 2.00 * quantidade;
            System.out.printf("Total: R$ %.2f%n", valorFinal);
        }else if (codigo == 5) {
            valorFinal = 1.50 * quantidade;
            System.out.printf("Total: R$ %.2f%n", valorFinal);
        }else {
            System.out.println("Você digitou um código inválido!");
        }
        */

        /*
        //Exercício 6:
        //Questão: Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        //nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
        double valor;
        System.out.print("Digite um valor para descobrir entre qual intervalo ele se encontra: ");
        valor = teclado.nextDouble();
        if(valor > 0) {
            if (valor <= 25) {
                System.out.println("Intervalo (0,25)");
            } else if (valor <= 50) {
                System.out.println("Intervalo (25,50)");
            } else if (valor <= 75) {
                System.out.println("Intervalo (50,75)");
            } else if (valor <= 100) {
                System.out.println("Intervalo (75, 100)");
            } else {
                System.out.println("O seu número está fora do intervalo");
            }
        }else {
            System.out.println("O seu número está fora do intervalo");
        }
        */

        /*
        //Exercício 07:
        //Questão: Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        //de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        //ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //Se o ponto estiver na origem, escreva a mensagem “Origem”.
        //Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
        double x;
        double y;
        System.out.print("Digite 2 cordenadas: ");
        x = teclado.nextDouble();
        y = teclado.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        */

        /*
        //Exercício 8:
        //Questão:Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        //que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
        //qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
        //
        //Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        //mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
        //
        //Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
        //salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
        //de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
        //duas casas decimais.
        System.out.print("Digite o salário para ser calculado o imposto: ");
        double salario = teclado.nextDouble();
        double imposto;
        if (salario <= 2000.00){
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imposto = (2000-salario) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (salario <= 4500.00) {
            imposto = ((salario - 3000) * 0.18) + 80;
            System.out.printf("R$ %.2f%n", imposto);
        } else {
            imposto = ((salario - 4500) * 0.28) + 350;
            System.out.printf("R$ %.2f%n", imposto);
        }
        */

        teclado.close();

    }
}
