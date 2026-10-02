import java.util.Scanner;

public class banco {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el salario: ");
        double salario = scanner.nextDouble();

        System.out.println("1. Buen historial");
        System.out.println("2. Mal historial");
        System.out.println("3. Historial regular");
        System.out.println("Ingrese el numero correspondiente: ");
        int historial = scanner.nextInt();

        System.out.println("Resultado de el estudio: ");

        if (edad < 21 && edad > 65)
        {
            System.out.println("Prestamo rechazado");   
            System.out.println("Razon: la edad " + edad + "años no esta en el rango permitido");
        }
        else
        {
            switch (historial)
            {
                case 1: //buen historial
                    if( salario >= 2700000 )
                    {
                        System.out.println("Prestamo aprovado");
                    }
                    else
                    {
                        System.out.println("Prestamo rechazado");
                        System.out.println("Razón: Tiene buen historial pero su salario " + salario + " es inferior al mínimo requerido de $2.700.000");
                    }
                    break;

                case 2: //mal historial
                    System.out.println("Prestamo rechazado");
                    System.out.println("Razon: tiene mal historial crediticio");
                    break;

                case 3: //historial regular
                    if( salario >= 4500000)
                    {
                        System.out.println("Prestamo aprovado");
                    }
                    else
                    {
                        System.out.println("Prestamo rechazado");
                        System.out.println("Razón: Con historial regular pero su salario " + salario + " es inferior al mínimo requerido de $4.500.000.");
                    }
                    break;
                
                default:
                    System.out.println("Opcion invalida, ingrese un numero del 1 al 3");
                    break;

            }
        }

        scanner.close();

    } 
    

}
