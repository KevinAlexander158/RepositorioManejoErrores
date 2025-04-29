import java.util.ArrayList;

public class GestorNumeros {
    private ArrayList<Integer> resultados;

    public GestorNumeros() {
        resultados = new ArrayList<>();
    }

    // Sobrecarga de métodos para sumar
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para dividir con manejo de excepciones
    public void dividir(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("Resultado de la división: " + resultado);
            resultados.add(resultado); // Guardamos el resultado de la división
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }

    // Método para agregar el resultado al array
    public void agregarResultado(int resultado) {
        resultados.add(resultado);
    }

    // Mostrar los resultados guardados
    public void mostrarResultados() {
        if (resultados.isEmpty()) {
            System.out.println("No hay resultados almacenados.");
        } else {
            System.out.println("Resultados almacenados:");
            for (int res : resultados) {
                System.out.println(res);
            }
        }
    }
}
