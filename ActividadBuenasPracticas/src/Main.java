import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = pedirEntero(scanner);
        int resultado = sumarHastaN(numero);

        System.out.println("La suma de los números desde 1 hasta " + numero + " es: " + resultado);

        scanner.close();
    }

    /**
     *
     * @param scanner Ingresa el numero entero
     * @return regresara el numero entero que pusimos en el scanner
     */
    public static int pedirEntero(Scanner scanner) {
        System.out.print("Ingresa un número entero: ");
        return scanner.nextInt();
    }

    /**
     *
     * @param numero lo que hace que en este ciclo repetitivo se sumara el numero hasta que sea el numero que colocamos
     * @return regresara la suma de los numero que se estan sumando hasta el numero entero que pusismos ejemplos 5 1+2+3+4+5= 15
     */
    public static int sumarHastaN(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        return suma;
    }
}
