package application;
import java.util.Scanner;

public class Program {

    void main (){
        // --- Seção 8 ---

        //---Resolvendo um problema sem orientação a objetos---

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

    }
}
