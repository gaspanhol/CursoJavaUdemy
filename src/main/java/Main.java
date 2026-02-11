import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    void main (){
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
