package examen1;
import java.util.Scanner;

public class PruebaFacturax {
    public static void main(String[] args){
        int can;
        String prd;
        double pu;

        Scanner entrada = new Scanner(System.in);
        
        int centinela = 0;
        LineaFactura[] linfac = new LineaFactura[10]; 
        while(centinela < 10){
            System.out.printf("Cantidad: ");
            can = entrada.nextInt();
            System.out.printf("Producto: ");
            prd = entrada.next();
            System.out.printf("Precio Unitario: ");
            pu = entrada.nextDouble();
            linfac[centinela] = new LineaFactura(can, pu, prd);
            centinela++;
            System.out.printf("Desea ingresar otra venta s/n: ");
            String continuar = entrada.next();

            if(continuar.equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.printf("Cliente: ");
        String cli = entrada.next();

        Facturax fact = new Facturax(cli, linfac);
        System.out.println();
        System.out.println("***********************");
        System.out.println("        FACTURA        ");
        System.out.println("***********************");
        System.out.println("Nombre del cliente: "+ fact.getCliente());
        System.out.println("Fecha: "+ fact.getFecha());
        System.out.printf("Total -----------------> "+ fact.getTotal());

        entrada.close();
    }
}
