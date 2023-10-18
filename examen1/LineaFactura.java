package examen1;

public class LineaFactura {
    private int can;
    private String prd;
    private double pu, subTotal;

    
    public LineaFactura(int can, double pu, String prd) {
        this.can = can;
        this.pu = pu;
        this.prd = prd;
        this.subTotal = (double)can*pu;
    }
    public void setProducto(String prd){
        this.prd = prd;
    }
    public String getProducto(){
        return prd;
    }
    public void setCantidad(int can){
        this.can = can;
    }
    public int getCantidad(){
        return can;
    }
    public void setPrecUnit(double pu){
        this.pu = pu;
    }
    public double gePrecUnit(){
        return pu;
    }
    public void setSubTotal(double subTotal){
        this.subTotal = subTotal;
    }
    public double getSubTotal(){
        return subTotal;
    }
}