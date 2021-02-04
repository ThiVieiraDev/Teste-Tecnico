package Exercicio1;

import java.util.Scanner;

public class ExecutaExercicio1 {
    public static void main(String[] args) {

        // Inicializando os ponteiros que receberão os valores
        Scanner leitor = new Scanner(System.in);
        double a;
        double b;
        double c;

        // Recebendo os valores de A, B e C
        System.out.println ("Insira o valor de A");
        a = leitor.nextDouble();
        System.out.println ("Insira o valor de B");
        b = leitor.nextDouble();
        System.out.println ("Insira o valor de C");
        c = leitor.nextDouble();

        // Exibindo como ficará a fórmula de bhaskara com os valores informados
//        System.out.println ("-"+ b + " +/- √ (" + b + "² - 4 x " + a + " x " + c + ")");
//        System.out.println("2x" + a);

        //Pegando o valor de Delta e verificando se é possível realizar o cálculo
        double delta;
        delta = (b*b) -4 * a * c;
//        System.out.println(delta);

        // Verificando se é possível realizar o cálculo
        if (delta >= 0 && a != 0){
            double x1;
            double x2;
            x1 = ((-b + Math.sqrt(delta))/(2*a));
            x2 = ((-b - Math.sqrt(delta))/(2*a));
            System.out.printf("X1 = %.5f %n", x1);
            System.out.printf("X1 = %.5f %n", x2);

        }
        else{
            System.out.println("Impossível calcular");
        }
    }
}
