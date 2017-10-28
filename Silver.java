public class Silver extends Pasajero {

  private double descuento;

  public Silver(String nombre, String correo, String asiento, String tipo){
    super(nombre, correo, asiento, tipo);
  }

  public void setDescueto(double descuento){
    this.descuento = descuento;
  }

  public double getDescuento(){
    return descuento;
  }


    public double calcularPrecio(){
      double precioFinal = 1500 * 0.9;
      return precioFinal;
    }

}
