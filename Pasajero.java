public class Pasajero{

  protected String nombre;
  protected String correo;
  protected String asiento;
  protected String tipo;



  public Pasajero(String nombre, String correo, String asiento, String tipo){
    this.nombre = nombre;
    this.correo = correo;
    this.asiento = asiento;
    this.tipo = tipo;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getNombre(){
    return nombre;
  }

  public void setCorreo(String correo){
    this.correo = correo;
  }

  public String getCorreo(){
    return correo;
  }

  public void setAsiento(String asiento){
    this.asiento =  asiento;
  }

  public String getAsiento(){
    return asiento;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTipo(){
    return tipo;
  }

  public double calcularPrecio(){
    double precioFinal = 1500 * 1;
    return precioFinal;
  }

}
