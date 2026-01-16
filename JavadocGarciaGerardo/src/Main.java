import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        /**
         * Este ciclo nos servira para poder hacer un menu y seleccionar la opcion que queramos
         */
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
/**
 * Aqui dependiendo la opcion se mandara a llamar al vod necesario para la operacion
 */
            switch (opcion) {
                case 1:
                    CalcularImc(scanner);
                    break;
                case 2:
                    CalcularAreaRectangulo(scanner);
                    break;
                case 3:
                    convertirCelsiusAFahrenheit(scanner);
                    break;
                case 4:
                    areaCirculo(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
            System.out.println();
        } while (opcion != 5);
        scanner.close();
    }

    /**
     * Este codigo nos pedira la peso y la altura para poder sacar el imc
     * @param scanner scanner permite leer los datos ingresados por el usuario
     */
    public static void CalcularImc(Scanner scanner) {
        System.out.println("Ingresa tu peso");
        double peso = scanner.nextDouble();
        System.out.println("Ingresa tu estarura en metros");
        double estatura = scanner.nextDouble();
        double imc = peso / (estatura * estatura);
        System.out.println("Tu imc es " + imc);
    }

    /**
     *Calcula el área de un rectángulo usando base y altura.
     * @param scanner scanner permite leer los datos ingresados por el usuario
     */
    public static void CalcularAreaRectangulo(Scanner scanner) {
        System.out.println("Ingresa la base de tu rectangulo");
        double base = scanner.nextDouble();
        System.out.println("Ingresa la altura de tu rectangulo");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("Tu area de tu rectangulo es " + area);
    }

    /**
     * Convierte una temperatura de grados Celsius a Fahrenheit.
     * @param scanner scanner permite leer los datos ingresados por el usuario
     */
    public static void convertirCelsiusAFahrenheit(Scanner scanner) {
        System.out.println("Ingresa la temperuta en grados Celsius:");
        double celsius = scanner.nextDouble();
        double Fahrenheit = (celsius * 1.8) + 32;
        System.out.println("La temperartura en Fahrenheit es " + Fahrenheit);
    }

    /**
     *Calcula el área de un círculo usando el radio.
     * @param scanner scanner permite leer los datos ingresados por el usuario
     */
    public static void areaCirculo(Scanner scanner) {
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}


