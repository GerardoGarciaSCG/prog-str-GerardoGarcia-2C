import java.security.PublicKey;
import java.util.Scanner;
public class Main {
    public static double BAJO= 18.5;
    public static double MEDIO=25;
    public static double ALTO=30;
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double pesoKG = obtenerDouble(sc, "Ingresa el peso en kilogramos ");
        double alturaM= obtenerDouble(sc, "Ingresa la altura en (M) -> 1.80");

        double IMC = calcularIMC(pesoKG,alturaM);
        String clasificacionIMC= clasificarIMC(IMC);
        System.out.println("Clasificación:" +clasificacionIMC);
    }

    /**
     * Metodo para obtener un numero double desde la consola
     * @param sc  objeto previamente  instanciado
     * @param mensaje  mensaje a mostrar a consola
     * @return
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    /**
     * Metodo para clacular y devolver al IMc con formula peso/altura al cuadrado
     * @param pesoKG --> Expresado en kg
     * @param alturaM --> Expredado en M (1.80)
     * @return --> Double IMC
     */
    public static double calcularIMC(double pesoKG, double alturaM){
        return pesoKG/(alturaM*alturaM);
    }

    /**
     * Devuelve la clasificacion badada en el IMC
     * @param IMC --> Parametro previamanete calculado
     * @return Palabra de clasidficacion en base al IMc
     * */
    public static String clasificarIMC (double IMC){
        if (IMC<BAJO) return "Peso Bajo";
        else if (IMC<MEDIO) return "Peso Mediano";
        else if (IMC<ALTO) return "Peso alto";
        else return "Obecidad";

        }
    }
