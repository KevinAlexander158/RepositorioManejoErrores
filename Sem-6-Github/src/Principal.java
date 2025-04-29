import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        GestorNumeros gestor = new GestorNumeros();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0; 

        do {
            System.out.println("\n::: MENÚ :::");
            System.out.println("1. Sumar 2 números ");
            System.out.println("2. Sumar 3 números");
            System.out.println("3. Sumar 2 números decimales");
            System.out.println("4. Dividir 2 números");
            System.out.println("5. Mostrar resultados guardados");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();  

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese primer número: ");
                        int a = scanner.nextInt();
                        System.out.print("Ingrese segundo número: ");
                        int b = scanner.nextInt();
                        int suma2 = gestor.sumar(a, b);
                        System.out.println("Resultado: " + suma2);
                        gestor.agregarResultado(suma2);
                        break;

                    case 2:
                        System.out.print("Ingrese primer número: ");
                        int x = scanner.nextInt();
                        System.out.print("Ingrese segundo número: ");
                        int y = scanner.nextInt();
                        System.out.print("Ingrese tercer número: ");
                        int z = scanner.nextInt();
                        int suma3 = gestor.sumar(x, y, z);
                        System.out.println("Resultado: " + suma3);
                        gestor.agregarResultado(suma3);
                        break;

                    case 3:
                        System.out.print("Ingrese primer número decimal: ");
                        double d1 = scanner.nextDouble();
                        System.out.print("Ingrese segundo número decimal: ");
                        double d2 = scanner.nextDouble();
                        double sumaDouble = gestor.sumar(d1, d2);
                        System.out.println("Resultado: " + sumaDouble);
                        gestor.agregarResultado((int) sumaDouble); 
                        break;

                    case 4:
                        System.out.print("Ingrese numerador: ");
                        int num = scanner.nextInt();
                        System.out.print("Ingrese denominador: ");
                        int den = scanner.nextInt();
                        gestor.dividir(num, den);
                        break;

                    case 5:
                        gestor.mostrarResultados();
                        break;

                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción inválida. Intenta otra vez.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar números válidos.");
                scanner.next(); 
                continue; 
            }

        } while (opcion != 6);  

        scanner.close(); 
    }
}
