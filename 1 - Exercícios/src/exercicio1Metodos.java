import java.util.Scanner;

public class exercicio1Metodos {

    public static void main(String[] args) {


        class Calculadora {

            public static void soma(double num1, double num2) {

                double resultado = num1 + num2;
                System.out.println("A soma dos números " + num1 + " + " + num2 + "= " + resultado );
            }

            public static void subtracao(double num1, double num2) {

                double resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + "= " + resultado);
            }

            public static void multiplicacao(double num1, double num2) {

                double resultado = num1 * num2;
                System.out.println(num1 + "x" + num2 + "= " + resultado);
            }

            public static void divisao(double num1, double num2) {

                double resultado = num1 / num2;
                System.out.println(num1 + "/" + num2 + "= " + resultado);
            }
        }


        Calculadora.soma(3,9);
        Calculadora.subtracao(2,1);
        Calculadora.multiplicacao(5,2);
        Calculadora.divisao(5,2.5);


    }
}
