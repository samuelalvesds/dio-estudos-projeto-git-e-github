public class exercicio5Sobrecarga {

    public static void main(String[] args) {

        exercicio5Sobrecarga.area(2);
        exercicio5Sobrecarga.area(3,4);
        exercicio5Sobrecarga.area(3,4);

    }

    public static void area(double lado) {
        double areaQuadrado = lado * lado;

        System.out.println("A área do quadrado é: " + areaQuadrado);

    }
    public static void area(int base, double altura) {
        double areaTriangulo = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + areaTriangulo);
    }
    public static void area(int base, int altura) {
        int areaRetangulo = base * altura;

        System.out.println("A área do retângulo é: " + areaRetangulo);
    }

}

