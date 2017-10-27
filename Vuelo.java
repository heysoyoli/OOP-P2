public class Vuelo{

  private Pasajero[] pasajeros;


//CONSTRUCTOR
  public Vuelo(){
    //UP TO 25 PASAJEROS
    pasajeros = new Pasajero[25];
  }


  public Pasajero[] getPasajeros(){
    return pasajeros;
  }


//ADD & REMOVE PASAJERO FROM VUELO
  public void addPasajero(int index, Pasajero pasajero){
    pasajeros[index] = pasajero;
  }

}
