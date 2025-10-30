import java.util.InputMismatchException;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Digite o primeiro lado: ");
                a = sc.nextDouble();

                System.out.print("Digite o segundo lado: ");
                b = sc.nextDouble();

                System.out.print("Digite o terceiro lado: ");
                c = sc.nextDouble();

                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
                sc.nextLine();
            }
        }

        try {
            Triangulo t = new Triangulo(a, b, c);
            
            System.out.println("\n---Triângulo---");
            System.out.println("Tipo: " + t.tipo());
            System.out.println("Perímetro: " + t.perimetro());
            System.out.printf("Área: %.2f\n", t.area());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Programa encerrado.");
        }

        sc.close();
    }
}
