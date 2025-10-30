public class Triangulo {
    double a, b, c;
    public Triangulo(double a, double b, double c){

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Todas as medidas devem ser positivas.");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("As medidas não formam um triângulo válido.");
        }

        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double perimetro() {
        return a + b + c;
    }

    public String tipo() {
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
