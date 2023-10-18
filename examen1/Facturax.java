package examen1;

public class Facturax {
    private String cliente;
    private String fecha = "18/10/2023";
    private LineaFactura[] lineaFacturas;

    public Facturax(String cliente, LineaFactura[] lineaFacturas){
        this.cliente = cliente;
        this.lineaFacturas = lineaFacturas;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public String getCliente(){
        return cliente;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public String getFecha(){
        return fecha;
    }
    public void setLineaFactura(LineaFactura[] lineaFacturas){
        this.lineaFacturas = lineaFacturas;
    }
    public LineaFactura[] getLineaFacturas(){
        return lineaFacturas;
    }
    public double getTotal(){
        double total = 0;

        for(int i = 0; i < 10; i++ ){
            if(lineaFacturas[i] != null){
                total += lineaFacturas[i].getSubTotal();
            }
          }

        return total;
    }
}
