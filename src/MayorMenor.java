import java.util.Scanner;

public class Mayormenor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double primero = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double segundo = scanner.nextDouble();

        System.out.println("Ingrese el tercero numero: ");
        double tercero = scanner.nextDouble();

        System.out.println("Ingrese el cuarto numero: ");
        double cuarto = scanner.nextDouble();

        System.out.println("Ingrese el quinto numero: ");
        double quinto = scanner.nextDouble();

        if( primero == segundo && segundo == tercero && tercero == cuarto && cuarto == quinto){
            System.out.println("Todos los numeros son iguales");
        } else {
            double mayor = primero;
            double menor = primero;

            if ( segundo > mayor){
                mayor = segundo;
            }
            if ( segundo < menor){
                menor = segundo;
            }

            if ( tercero > mayor){
                mayor = tercero;
            }
            if ( tercero < menor){
                menor = tercero;
            }
            if ( cuarto > mayor){
                mayor = cuarto;
            }
            if ( cuarto < menor){
                menor = cuarto;
            }
            if ( quinto > mayor){
                mayor = quinto;
            }
            if ( quinto < menor){
                menor = quinto;
            }

            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
        }

        scanner.close();
        
    }
}

