import java.util.Scanner;

public class CoordenadasPlano {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la coordenada X: ");
        double x = scanner.nextDouble();

        System.out.println("Ingrese la coordenada Y: ");
        double y = scanner.nextDouble();

        if ( x > 0){
            if ( y > 0 ){
                System.out.println("El punto esta en el primer cuadrante");
            } else {
                if ( y < 0){
                    System.out.println("El punto esta en el cuarto cuadrante");
                } else {
                    System.out.println("El punto esta ubicado en el eje X");
                }
            }
        } else {
            if ( x < 0){
                if ( y > 0){
                    System.out.println("El punto esta en el segundo cuadrante");
                } else {
                    if ( y < 0){
                        System.out.println("El punto esta en el tercer cuadrante");
                    } else {
                        System.out.println("El punto esta ubicado en el eje X");
                    }
                }
            } else {
                if ( y > 0 ){
                    System.out.println("El punto esta ubicado en el eje Y");
                } else {
                    if ( y < 0 ){
                        System.out.println("El punto esta ubicado en el eje Y");
                    } else {
                        System.out.println("El punto esta ubicado en el origen");
                    }
                }
            }
        }   

    }
    
}
