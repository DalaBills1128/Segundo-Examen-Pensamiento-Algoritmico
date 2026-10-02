import java.util.Scanner;

public class Epm {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double valorAguaM3 = 1375.80;
        double valorLuzKWh = 0.125;
        double valorGasM3 = 752.35;

        System.out.print("Ingrese el estrato: ");
        int estrato = scanner.nextInt();

        System.out.print("Consumo de agua en metros cubicos: ");
        double consumoAgua = scanner.nextDouble();

        System.out.print("Consumo de luz en KWh: ");
        double consumoLuz = scanner.nextDouble();

        System.out.print("Consumo de gas en metros cubicos: ");
        double consumoGas = scanner.nextDouble();


        //Valores base
        double subTotalAgua = consumoAgua * valorAguaM3;
        double subTotalLuz = consumoLuz * valorLuzKWh;
        double subTotalGas = consumoGas * valorGasM3;

        double porcentajeAgua = 0;
        double porcentajeLuz = 0; 
        double porcentajeGas = 0;
        boolean tieneDescuento = true; 

        switch (estrato)
        {
            case 1:
                porcentajeAgua = 14.0;
                porcentajeLuz = 15.0;
                porcentajeGas = 16.0;
                tieneDescuento = true;
                break;

            case 2:
                porcentajeAgua = 11.0;
                porcentajeLuz = 12.0;
                porcentajeGas = 13.0;
                tieneDescuento = true;
                break;

            case 3:
                porcentajeAgua = 8.0;
                porcentajeLuz = 9.0;
                porcentajeGas = 10.0;
                tieneDescuento = true;
                break;

            case 4:
                porcentajeAgua = 10.0;
                porcentajeLuz = 11.0;
                porcentajeGas = 12.0;
                tieneDescuento = false;
                break;

            case 5:
                porcentajeAgua = 15.0;
                porcentajeLuz = 16.0;
                porcentajeGas = 17.0;
                tieneDescuento = false;
                break;

            case 6:
                porcentajeAgua = 10.0;
                porcentajeLuz = 20.0;
                porcentajeGas = 21.0;
                tieneDescuento = false;
                break;
            default:
                System.out.print("Error. Debe ser del 1 al 6");
                scanner.close();
                return;
        }

        double totalAgua;
        double totalLuz;
        double totalGas;

        if(tieneDescuento)
        {
            totalAgua = subTotalAgua - (subTotalAgua * (porcentajeAgua/100));
            totalLuz = subTotalLuz - (subTotalLuz * (porcentajeLuz/100));
            totalGas = subTotalGas - (subTotalGas * (porcentajeGas/100));
        }
        else
        {
            totalAgua = subTotalAgua + (subTotalAgua * (porcentajeAgua/100));
            totalLuz = subTotalLuz + (subTotalLuz * (porcentajeLuz/100));
            totalGas = subTotalGas + (subTotalGas * (porcentajeGas/100));
        }

        double costoTotal = totalAgua + totalLuz + totalGas;

        System.out.println("Estrato ingresado: " + estrato);
        System.out.println("Descripcion: " + (tieneDescuento ? "Descuento" : "Recargo"));
        System.out.println("Total agua: " + totalAgua);
        System.out.println("Total luz: " + totalLuz);
        System.out.println("Total gas: " + totalGas);
        System.out.println("Total a pagar: " + costoTotal);

        scanner.close();
    }
}

