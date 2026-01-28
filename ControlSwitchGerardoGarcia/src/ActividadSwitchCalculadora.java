import java.util.Scanner;
public class ActividadSwitchCalculadora {
    public static void menu(){
        System.out.println("Bienvenido al menu escoja su opcion");
        System.out.println("1) Suma");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
    }


    public static void main(String []args){
        double num1=0;
        double num2=0;
        double resultado=0;
        int opc =0;
        Scanner leer =new Scanner(System.in);
        menu();
        opc = leer.nextInt();
        System.out.println("Ingresa el primer valor ");
        num1 = leer.nextDouble();
        System.out.println("Ingresa el segundo valor");
        num2 = leer.nextDouble();
        switch (opc){
            case 1:
                resultado=sumar(num1,num2);
                break;

            case 2:
                resultado=restar(num1,num2);
                break;
            case    3:
                resultado=multipicar(num1,num2);
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("No se puede dividir entre cero");
                }else {
                    resultado=dividir(num1,num2);

                }
                break;
            default:
                System.out.println("No es posible realizar la operación.");
                return;
        }
        System.out.println("El resultado de la operación es: " + resultado);


    }
    public static double sumar(double num1, double num2){
        return num1+num2;
    }
    public static double restar(double num1, double num2){
        return num1-num2;
    }
    public static double multipicar(double num1,double num2){
        return num1 * num2;
    }
    public static double dividir( double num1, double num2){
        return num1/num2;
    }
}
