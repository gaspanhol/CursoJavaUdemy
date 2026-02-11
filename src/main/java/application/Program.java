package application;
import java.util.Scanner;

import entities.Triangle;

public class Program {

    void main (){
        // --- Seção 8 ---


        //---Resolvendo um problema sem orientação a objetos---
        /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Enter de measure of triangle X: ");
        double aX = teclado.nextDouble();
        double bX = teclado.nextDouble();
        double cX = teclado.nextDouble();
        System.out.print("Enter de measure of triangle y: ");
        double aY = teclado.nextDouble();
        double bY = teclado.nextDouble();
        double cY = teclado.nextDouble();

        double perimeterX = (aX+bX+cX)/2;
        double perimeterY = (aY+bY+cY)/2;

        double areaX = Math.sqrt(perimeterX*(perimeterX-aX)*(perimeterX-bX)*(perimeterX-cX));
        double areaY = Math.sqrt(perimeterY*((perimeterY-aY)*(perimeterY-bY)*(perimeterY-cY)));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);
        if (areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        */

        //---Criando uma classe com três atributos para representar melhor o triângulo---

        // - O que é uma classe?
        // É um tipo estruturado que pode conter (membros):
            // * atributos (dados/ campor)
            // * métodos (funções / operações)

        // Além de um tipo estruturado, a classe também pode prober muitos outros recursos, tais como:
            // * Construtores
            // * Sobrecarga
            // * Encapsulamento
            // * Herança
            // * Polimorfismo

        //Exemplo:
            // * Entidade: produto, Cliente, Triangulo
            // * Serviços: ProdutoServica, ClienteService, EmailService, StorageService
            // * Controladores: ProdutoController, ClienteController
            // * Utilitários: calculadora, Compactador
            // * Outros (views, repositórios, gerenciadores, etc.)

        //---Resolvendo o problema anterior utilizando classe

        Scanner teclado = new Scanner(System.in);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();
        System.out.print("Enter de measure of triangle X: ");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();
        System.out.print("Enter de measure of triangle y: ");
        y.a = teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();

        double perimeterX = (x.a+x.b+x.c)/2;
        double perimeterY = (y.a+y.b+y.c)/2;

        double areaX = Math.sqrt(perimeterX*(perimeterX-x.a)*(perimeterX-x.b)*(perimeterX-x.c));
        double areaY = Math.sqrt(perimeterY*(perimeterY-y.a)*(perimeterY-y.b)*(perimeterY-y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);
        if (areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        // - Instanciação (alocação dinâmica de memória)
        // em um programa temos a memória, na memória está localizado o Stack (local onde ficam armazenadas as variaveis estáticas)
        // e a Heap (local onde ficam armazenadas as variáveis dinâmicas).
    }
}
