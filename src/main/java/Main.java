import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    void main (){
        // --- SEÇÃO 4 ---

        /*
        // ---Variáveis são uma porção da memória RAM que é utilizada para guardar dados---
        // Para definir uma variável utilizamos: <tipo> <nome> = <valor inicial>; (sendo o valor inicial algo opcional)

        // ---Exemplos das variáveis:---

        //Formas de declarar inteiros:
        byte a = 127; //possui 8 bits de armazenamento, atuando na faixa de -128 a 127 (valor padrão quando não é definida a variavel = 0)
        short b = 32767; //possui 16 bits de armazenamento, atuando na faixa de -32768 a 32767 (valor padrão = 0)
        int c = 2140000000; //possui 32 bits de armazenamento, atuando na faixa de -2147483648 a 2147483647 (valor padrão = 0)
        long d = 922337200000000000L; //possui 64 bits de armazenamento, atuando na faixa de -9223372036854770000 a 9223372036854770000 (valor padrão = 0L)
        // Em geral utilizá-se int para criar uma variavel de inteiros.

        //Formas de declarar numeros com ponto flutuante:
        float e = 3.34f;
        double f = 3.23423;
        // Em geral é utilizado o double por ele ter uma precisão maior e conseguir armazenar mais números depois da vírgula

        //Formas de declarar um única caracter (Unicode):
        char g = 'z'; //(pode ser utilizado o próprio caracter ou o código de caracter da tabela Unicode)

        //Formas de declarar um valor de verdadeiro ou falso:
        boolean h = true; //Tem o tamanho de 1 bit e só pode armazenar ou True ou False

        //Forma de declarar uma cadeia de caracteres (palavras ou texto):
        String i = "Lua no céu clareando a praça"; //Vale notar que String são declaradas entre "" e characteres são declarados por ''.

        //OBSERVAÇÕES:
        //1- Você não pode declarar uma variavel com um nome que começa com um número. Exemplo: int 5minutos;(forma errada) int _5minutos; (forma correta).
        //2- Você não pode deixar espaços em branco no nome
        //3- É recomendado não utilizar acentos ou til em nomes de variáveis
        //4- Utilize o padrão "Camel Case". Exemplo: hojeEuVouAoCinema (deixe a palavra junta e onde teria o espaço coloque maiusculo)
        //5- Variáveis por parão na comunidade Java se iniciam com letra minúscula
        */

        /*
        //---Formas de imprimir algo na tela (mandar um comando de saida)---

        //primeira forma:
        System.out.print(a + " "); //Sem o ln não é feita quebra de linha
        System.out.println(b); //Com o ln é feita quebra de linha

        //Forma nova do Java 25
        IO.println(c);
        IO.print(d + " ");

        //Formas de imprimir coisas formatadas
        System.out.printf("%.2f%n", e); //O %.2f é a forma de delimitar quantas casas depois da vírgula você quer (O %n no final é quebra de linha)
        System.out.printf("%.4f%n", f); // Nesse caso delimitamos 4 números depois da vírgula com o %.4f
        //OBS: quando utilizamos o printf ele identifica a lingua do computador e coloca . ou , dependendo dela, para definirmos . ou vírgula utilizamos o comando abaixo:
        //Locale.setDefault(Locale.US); //É necessário utilizar o java.util.locale (biblioteca do JDK)
        System.out.printf("%.4f%n", f); //Agora a impressão é feita com . ao invés de vírgula


        //Para dar print de varias informações você utiliza o + para concatenar vários resultados
        IO.println(g + i);
        IO.println("resultado =" + f + "Metros"); //Forma de imprimir algo concatenado com string no meio
        System.out.printf("resultado = %.2f metros%n", f); // Nessa forma a variavel substitui o %.2f e sai a informação formatada (IO. não funciona para printf)
        IO.println(h);

        //concatenando vários elementos em um mesmo comando de escrita
        // no printf temos os seguintes marcadores de variáveis:
        // %f = ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = quebra de linha
        // Regra geral do printf: "TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2

        //Exemplo de utilização
        String nome = "Maria";
        int idade = 20;
        double renda = 1200.50;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        IO.println();

        //Exercícios:
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        Locale.setDefault(Locale.ITALY);
        System.out.printf("Products:%n%s, wich price is R$ %.2f%n%s, wich price is R$ %.2f%n%nRecord: %d years old, code %d and gender: %s%n%n", product1, price1, product2, price2, age, code, gender); //Amassei com esse código gigante kkk, dava pra fazer por linha
        System.out.printf("measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
        */

        /*
        // ---Processamento de dados---
        // A sintaxe do processamento de dados é:
        // <variavel> = <expressao> (o simbolo de = significa que vai ler e a variavel vai receber o valor da expressao)

        //Exemplo 1

        int x;
        double y; //É possi
        x = 5;
        y = 2 * x;
        IO.println(x); //Nesse caso como o x é uma int, o resultado aparecerá em inteiros
        IO.println(y); //Nesse caso como o y é um double, o resultado aparecerá com casas depois da vírgula

        //Exemplo 2
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2*h;
        IO.println(area);
        //Observação:
        //1 - é uma boa pratica colocar o sempre um número com . mesmo que o número não tenha casa depois da vírgula, mas é colocado para simbolizar que é um número double
        //2 - quando o número for float, colocar um f após o número para simbolizar que ele é um número float, exemplo: b = 6f

        //Exemplo 3
        int a, c;
        double resultado;
        a = 5;
        c = 2;
        resultado = (double) a/c; //colocamos o (double) para dizer para o sistema que o resultado deve sair em formato double e não cortar as casas decimais
        //Obs: caso não seja colocado o (double) o sistema vai entender "a" e "c" como inteiros e vai dar uma saída inteira cortando os números depois da vírgula.
        IO.println(resultado);

        //Exemplo 4
        double d;
        int e;
        d = 5.0;
        e = (int) d; //É necessário colocar o (int) para o compilador entender que eu quero o número inteiro do double, isso remove o erro.
        */

        // ---Entrada de dados em Java---
        // Para dar entrada de dados (digitar no teclado e o resultado ser atribuido a uma variavel) nós precisamos criar o objeto Scanner.
        // Para criar o Scanner utilizamos o comando = Scanner teclado = new Scanner(System.in); e precisamos importar o java util com o comando: java.util.scanner;
        // O Scanner sempre vai pedir para ser fechado, utilizando o comando teclado.close();
        // Vale lembrar que o nome "teclado" pode ser substituido por qualquer um que o usuário queira, ele é só o nome da variavel.
        // Obs: é possivel perceber que os comandos com System.in são para indicar entradas de fora para o sistema, como o teclado. Já o System.out é para mandar uma saida para o usuário, através do monitor por exemplo
        // Scanner teclado = new Scanner(System.in);
        /*
        //Exemplo 1:
        //Para dar entrada de palavras
        System.out.print("Digite um nome: ");
        String x = teclado.next();
        System.out.println("Voce digitou: " + x);

        //Para dar entrada de inteiros
        System.out.print("Digite um número inteiro: ");
        int y = teclado.nextInt();
        System.out.println("Voce digitou: " + y);

        //Para dar entrada de números com ponto flutuante
        System.out.print("Digite um número com vírgula: ");
        double z = teclado.nextDouble(); //Lembrando que o sistema pega a localidade da IDE, então se estriver em português o número é com vírgula, em inglês é com o ponto(.).
        System.out.println("Voce digitou: " + z); //Lembrando que o println imprime o resultado por padrão na notação em inglês, para imprimir em português é necessário utilizar o Locale.

        //Para dar entrada com caracteres
        IO.println("Escreva uma palavra ou caracter: ");
        char w = teclado.next().charAt(0); //O charAT(0) serve para dizer que você quer pegar o primeiro caracter.
        IO.println("O primeiro caracter é: " + w);

        //Para ler uma entrada até a primeira quebra de linha
        String s1, s2, s3;
        s1 = teclado.nextLine();
        s2 = teclado.nextLine();
        s3 = teclado.nextLine();
        //Obs: se você colocar só .next ele lê palavras sem contar o espaço, já o .nextLine lê a linha inteira até você usar o ENTER pra quebrar a linha.
        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //Quebra de linhas pendentes
        String a1, a2, a3;
        int h;
        h = teclado.nextInt(); //Quando você usa um comando de leitura diferente de nextLine() e dá uma quebra de linha, essa quebra fica "pendente" na entrada e acaba sendo absorvido pelo nextLine() seguinte.
        teclado.nextLine(); //Esse comando serve para consumir a quebra de linha que ficou pendente.
        a1 = teclado.nextLine();
        a2 = teclado.nextLine();
        a3 = teclado.nextLine();
        //Obs: se você colocar só .next ele lê palavras sem contar o espaço, já o .nextLine lê a linha inteira até você usar o ENTER pra quebrar a linha.
        System.out.println("Dados digitados: ");
        System.out.println(h);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        */

        /*
        // ---Funções matemáticas---
        // Algumas funções matemáticas em java:
        double x, y, z, a1, b1, c1;
        x = 16.0;
        y = 2.0;
        z = -5.0;
        a1 = Math.sqrt(x); //Variável A recebe a RAIZ QUADRADA de x
        b1 = Math.pow(x, y); //Variável A recebe o resultado de x ELEVADO a y
        c1 = Math.abs(z); //Variável A recebe o VALOR ABSOLUTO de x (valor absoluto é o valor sem negativo, caso seja um valor negativo)
        System.out.println("A raiz quadrada de " + x + " é: " + a1);
        System.out.println("O valor de " + x + " elevado a " + y + " é: " + b1);
        System.out.println("O valor absoluto de " + z + " é: " + c1);
        //OBS: para escrever o valor de Pi podemos atribuir ele manualmente a uma variável ou utilizar Math.PI

        //Exemplo utilizando a fórmula de Bhaskara
        double a, b, c, x1, x2, delta;
        System.out.println("Digite a, b e c para descobrir o o valor de x1 e x2 da Bhaskara");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        delta = Math.pow(b, 2.0) - 4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        System.out.println("Os valores são: \nx1 = " + x1 + "\nx2 = " + x2);
        */

            //Exercícios propostos:
        /*
        //Exercício 01:
        //Questão: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
        System.out.print("Digite dois valores inteiros: ");
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int soma = x + y;
        System.out.println("A soma de " + x + " + " + y + " é: " + soma);
        */

        /*
        //Exercício 02:
        //Questão: Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159
        double raio, area;
        System.out.print("Digite o valor do raio do círculo: ");
        raio = teclado.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("O valor da area do circulo é: %.4f%n", area);
        */

        /*
        //Exercício 03:
        //Questão: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        int A, B, C, D, dif;
        System.out.print("Digite quatro valores inteiros: ");
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        dif = (A*B) - (C*D);
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + dif);
        */

        /*
        //Exercício 04:
        //Questão: Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        int func;
        double hTrab, vPH, salario;
        System.out.print("Digite o número do funcionário: ");
        func = teclado.nextInt();
        System.out.print("Digite quantas horas o funcionário trabalhou: ");
        hTrab = teclado.nextDouble();
        System.out.print("Digite quanto o funcionário recebe por hora trabalhada: ");
        vPH = teclado.nextDouble();
        salario = hTrab * vPH;
        System.out.println("O número do funcionário é " + func);
        System.out.printf("Seu salário é de R$ %.2f%n", salario);
        */

        /*
        //Exercício 05:
        //Questão: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        int codP1, numP1, codP2, numP2;
        double vP1, vP2, valorAPagar;
        System.out.print("Digite o código do produto 1: ");
        codP1 = teclado.nextInt();
        System.out.print("Digite o número de peças 1: ");
        numP1 = teclado.nextInt();
        System.out.print("Digite o valor da peça 1: ");
        vP1 = teclado.nextDouble();
        System.out.print("Digite o código do produto 2: ");
        codP2 = teclado.nextInt();
        System.out.print("Digite o número de peças 2: ");
        numP2 = teclado.nextInt();
        System.out.print("Digite o valor da peça 2: ");
        vP2 = teclado.nextDouble();
        valorAPagar = (numP1 * vP1) + (numP2 * vP2);
        System.out.printf("Valor a pagar = R$ %.2f%n", valorAPagar);
        */

        /*
        //Exercício 06:
        //Questão: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B
        double a, b, c, aTrianRetang, aCirc, aTrap, aQuad, aRetang;
        System.out.print("Digite três valores que serão utilizados para calcular áreas diversas: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        aTrianRetang = (a*c)/2;
        aCirc = Math.PI * Math.pow(c,2);
        aTrap = ((a+b) * c)/2;
        aQuad = b*b;
        aRetang = a * b;
        System.out.printf("A área do triangulo retângulo é: %.3f%n", aTrianRetang);
        System.out.printf("A área do circulo é: %.3f%n", aCirc);
        System.out.printf("A área do trapézio é: %.3f%n", aTrap);
        System.out.printf("A área do quadrado é: %.3f%n", aQuad);
        System.out.printf("A área do retangulo é %.3f%n", aRetang);


        teclado.close();
         */


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
        //Scanner teclado = new Scanner(System.in);

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

        //teclado.close();

        //---Operador de atribuição cumulativa---
        // a += b; é igual a = a + b; ("a" recebe o "a" + a variavel "b")
        // a -= b; é igual a = a - b; ("a" recebe o "a" - a variavel "b")
        // a *= b; é igual a = a * b; ("a" recebe o "a" * a variavel "b")
        // a /= b; é igual a = a / b; ("a" recebe o "a" / a variavel "b")
        // a %= b; é igual a = a % b; ("a" recebe o "a" % a variavel "b")

        //---Estrutura switch-case---
        // Essa estrutura é utilizada quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável.
        // forma do switch case:
        // switch (expressão) {
        // case valor1:
        //    comando 1;
        //    break;
        // case valor2:
        //    comando 2;
        //    break;
        // default: (o default serve para todos os casos que não foram numerados, no caso desse exemplo tem 2 casos, se for qualquer numero que não seja 1 ou 2 ele entra no caso default).
        //    comando 1;
        //    break;
        // }
        //
        // Outra forma do switch case:
        //switch (dia) {
        //   case 1 -> "Domingo";
        //   case 2 -> "Segunda";
        //   case 3 -> "Terça"; // Executa este e retorna
        //   default -> "Dia Inválido";
        //}

        //---Expressão condicional ternária---
        // Estrutura opcional ao if-else quando se deseja decidir um valor com base em uma condição
        //Sintaxe:
        // ( condição ) ? valor_se_verdadeiro : valor_se_falso
        //Exemplo:
        // (2 > 4) ? 50 : 80 (Nesse caso ele retorna 80, pois a condição 2 maior que 4 é falsa, então ele retorna o valor se a condição for falsa, nesse caso o 80;
        // (10 != 3) ? "Maria" : "Alex" (Nesse caso ele retorna "Maria" pois o 10 é diferente de 3, então a condição retornada é a verdadeira.
        //Exercício de exemplo:

        //Usando If-Else
        /*
        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        }else {
            desconto = preco * 0.05;
        }
         */

        //Usando Expresão condicional ternária:
        /*
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
        */

        //---Escopo e inicialização---
        //- Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
        //- Uma variável não pode sr usada se não for iniciada.

        // Exemplo de uma variável não inicializada:
        /*
        double price = 400.00;
        double discount;
        System.out.println(discount);
        //(nesse exemplo podemo observar que a variavel discount não recebeu nenhum valor, logo o compilador não permite a compilação desse código;
        */

        //Exemplo de variável fora do escopo:
        /*
        double price = 400.00;
        if (price > 200.00) {
            double discount = price * 0.05;
        }
        System.out.println(discount);
        //(Nesse caso a váriavel foi declarada apenas dentro do if, logo assim que o if se encera a váriavel deixa de existir e não pode ser impressa)
        */

        //Outro exemplo de variável fora do escopo:
        /*
        double price = 400.00;
        double discount;
        if (price > 200.00) {
            discount = price * 0.05;
        }
        System.out.println(discount);
        //(Nesse caso ele da um erro diferente, dessa vez a variável foi inicializada fora do if, porém o if só tem uma condição de atribuição se o valor for verdadeiro, então o compilador não sabe o que fazer com a variavel caso ela venha a ser falsa e por isso da o erro).
        */
        //como corrigir:
        /*
        double price = 400.00;
        double discount;
        if (price > 200.00) {
            discount = price * 0.05;
        }else{
            discount = price * 0.01;
        }
        System.out.println(discount);
        //(Agora temos um valor para todas as possibilidade, assim como todas as variaveis inicializadas, o que permite o compilador entender o código e permitir que ele seja compilado).
        */


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
        /*
        // Exemplo:
        Scanner teclado = new Scanner(System.in);
        double num = 1;
        double soma = 0;
        System.out.print("Para finalizar o envio de numeros digite 0!\nInsira os números que você deseja somar: ");
        while (num != 0) {
            num = teclado.nextDouble();
            soma += num;


         */
        // --- Seção 7 ---

        //---Restrições e convenções para nomes---

        // - Restições para nomes de variáveis:
        // * Não pode comeãr com dígito, use uma letra ou _
        // * Não Usar acentos ou til
        // * Não pode ter espaço em branco
        // * Sugestão: use nomes que tenham um significado
        //Exemplo de variaveis erradas: int 5minutes; int salário; int salario do funcionario;
        //Exemplo de variaveis certas: int _5minutes; int salario; int salarioDoFuncionario;

        // - Convenções Java:
        // * Camel Case: lastName, no camel case sempre começa com minusculo e quando vai escrever outra palavra, coloca a primeira letra maiuscula.
        // * Camel Case é usado para nomear pacotes, atributos, métodos, variáveis e parâmetros.
        // * Pascal Case: ProductService, nesse caso toda palavra inicia com letra maiúscula.
        // * Pascal Case é utilizado para nomear classes.

        //Exemplo
        /*
        package entities; //(pacote)

        public class Account { //(classe)
            private String holder; //(atributo)
            private Double balance; //(atributo)

            public Account(String holder, Double balance){
                this.holder = holder;
                this.balance = balance;
            }
             public String getHolder() {
                return holder;
            }
            public void deposit (double amount) {
                balance += amount;
            }
            public void withdraw (Double amount){
                this.balance -= amount;
            }
        }
         */

        //---Operadores bitwise---
        //São aqueles operadores que realizam as operações bit a bit em valores
        // Operador              | Significado
        //   &                   | Operação "E" bit a bit
        //   |                   | Operação "OU" bit a bit
        //   ^                   | Operação "OU-exclusivo" bit a bit

        // Usando operação de bit a bit exemplo:
        // (número 89 em binário) 0101 1001
        // (número 60 em binário) 0011 1100
        //                    & = fffv vfff 0001 1000 número 24
        //                    | = fvvv vvfv 0111 1101 número 125
        //                    ^ = fvvf fvfv 0110 0101 número 101
        // Então as operações pegaram e fizeram uma comparação de cada bit do binário, então foi comparado o ultimo bit do 89 (que é 1) e o ultimo bit do 60 (que é 0)
        // com base nisso ele verifica usando o "E", "OU", ou "OU-Exclusivo" e diz se é 1 ou 0 (v ou f) e dps de comparar todos os números da o resultado.
        //Exemplo em código:
        /*
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        */

        //Essa operação bit a bit é mais utilizada em programação de baixo nivel, como arduinos.
        //Uma aplicação comum é quando queremos verificar algum bit especifico de um endereço de rede
        //Exemplo:
        /*
        Scanner teclado = new Scanner(System.in);
        int mask = 0b100000;
        int n = teclado.nextInt();

        if ((n & mask) != 0 ) {
            System.out.println("6th bit is true");
        } else {
            System.out.println("6th bit is false");
        }
        */

        //---Funções interessantes para String---
        // Funções mais utilizadas:
        // - Formatar: toLowerCase(); toUpperCase(); trim() (trim é para remover espaços nos cantos das strings)
        // - Recortar: substring(inicio); substring(inicio,fim)
        // - Substituir: replace(char,char); replace(string,string)
        // - Buscar: indexOf(""); lastIndexOf("")
        // - str.Split("") (Recortar a String com base em um separador informado)

        /*
        //Exemplo:
        String original = "abcde FGHIJ ABC abc DEFG    ";

        System.out.println("Original: -" + original + "-");

        String s1 = original.toLowerCase();
        System.out.println("toLowerCase: -" + s1 + "-");

        String s2 = original.toUpperCase();
        System.out.println("toUpperCase(): -" + s2 + "-");

        String s3 = original.trim();
        System.out.println("trim(): -" + s3 + "-");

        String s4 = original.substring(2);
        System.out.println("substring(2): -" + s4 + "-"); //(gera uma string somente do caracter 2 em diante)

        String s5 = original.substring(2, 9);
        System.out.println("substring(2,9): -" + s5 + "-"); //(Vai recortar a string mostrando somente o que entá entre o caracter 2 e 9)

        String s6 = original.replace('a','x');
        System.out.println("Replace('a','x') -" + s6 + "-"); //(Nesse caso ele troca todos os caracteres "a" pelo caracter "x")

        String s7 = original.replace("abc","xy");
        System.out.println("replace(\"abc\",\"xy\"): -" + s7 + "-"); //(Troca "abc" por "xy"

        int s8 = original.indexOf("bc");
        System.out.println("indexOf: -" + s8 + "-"); //Ele mostra o número da posição da primeira ocorrência da string "bc"

        int s9 = original.lastIndexOf("bc");
        System.out.println("LastIndexOf -" + s9 + "-"); //Ele mostra o número da posição da ultima ocorrência da string "bc"
        */

        // - Operação split
        //Ela serva para recortar o String
        // Sintaxe e exemplo:
        /*
        String s = "potato apple lemon";
        String[] vect = s.split(" "); //Aqui foi declarado um vetor e dito para ele usar o espaço como separador)
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
         */

        //---Comentários em Java (básico)---
        // Os comentários são ignorados pelo computador, podendo escrever ser dar problema com o compilador
        // Devesse evitar excesso de comentários em códigos oficiais
        // existe o comentário de bloco, onde você coloca /* no começo e */ no final
        // existe o comentário de linha, que você coloca // na frente e tudo que vier após ela estará commitado

        //---Funções (sintaxe)---
        // * As funções representam um processamento que possui um significado
        // Exemplo: Math.sqrt(double) calcula a raiz quadrada do número double; System.out.println(String) Essa função mostra algo na tela.

        // * Principais vantagens: modularização, delegação e reaproveitamento

        // * Dados de entrada e saída
        // - Funções podem receber dados de entrada (parâmetros ou argumentos);
        // - Funções podem ou não retornar uma saída.

        //* Em orientação a objetos, funções em classes recebem o nome de "métodos"

        //Exemplo:
        /*
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int higher = max(a,b,c);

        showResult(higher);

        teclado.close();
        */
    }
    /*
    int max(int x, int y, int z){ //podemos usar no java 25 somente int max(int x, int y, int z) ao invés de ter que utilizar public static int max(int x, int y, int z)
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    void showResult(int value){
        System.out.println("Higher = " + value);
    }
    */
}
