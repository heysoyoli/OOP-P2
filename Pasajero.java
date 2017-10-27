public class Pasajero{

  private String nombre;
  private String correo;
  private String tipo;
  private String asiento;


  public Pasajero(String nombre, String correo, String asiento){
    this.nombre = nombre;
    this.correo = correo;
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

}
