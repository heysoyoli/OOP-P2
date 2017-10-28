public class Gold extends Pasajero{

  private int descuento;

  public Gold(String nombre, String correo, String asiento, String tipo){
    super(nombre, correo, asiento, tipo);
    this.descuento = descuento;
  }

  public void setDescueto(int descuento){
    this.descuento = descuento;
  }

  public int getDescuento(){
    return descuento;
  }


    public double calcularPrecio(){
      double precioFinal = 1500 * 0.8;
      return precioFinal;
    }

}
