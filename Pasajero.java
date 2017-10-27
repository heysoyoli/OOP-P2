public class Pasajero{

  private String nombre;
  private String correo;


  public Pasajero(String nombre, String correo){
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

}
