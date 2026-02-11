import java.util.Scanner;

public class Main {
    void main (){
        //SEÇÃO 4:

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
        }
        System.out.println("A soma dos números é: " + soma);
        teclado.close();
        */
    }
}
