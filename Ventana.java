import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Ventana extends JFrame{

  private JPanel panelLeft, panelMiddle, panelRight;

  private Vuelo vuelo;

//LABELS FOR INPUT
  private JLabel labelNombre;
  private JLabel labelCorreo;
  private JLabel labelTipo;
  private JLabel labelAsiento;
  private JLabel labelPasajeros;

  //LABELS FOR OUTPUT
  private JLabel labelPasajero1;
  private JLabel labelTotalText;
  private JLabel labelTotal;



//INPUT FIELDS
  private JTextField fieldNombre;
  private JTextField fieldCorreo;
  private JTextField fieldAsiento;
  private JTextField fieldTipo;


//ACTION BUTTON
  private JButton botonAgregar;


//CONSTRUCTOR
  public Ventana(){
    vuelo = new Vuelo();
    setSize(1280, 1000);
    setTitle("Examen Segundo Parcial");
    initComponents();
    setLayout(new GridLayout(1,3));
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }


//INICIALIZACION DE COMPONETES DE LA VENTANA
  public void initComponents(){

      panelLeft = new JPanel();
      panelLeft.setLayout(new GridLayout(10,1));
      panelMiddle = new JPanel();


      //NOMBRE
      labelNombre = new JLabel("Nombre");
      panelLeft.add(labelNombre);
      fieldNombre = new JTextField("Input", 14);
      panelLeft.add(fieldNombre);

      //CORREO
      labelCorreo = new JLabel("Correo");
      panelLeft.add(labelCorreo);
      fieldCorreo = new JTextField("Input", 14);
      panelLeft.add(fieldCorreo);

      //TIPO
      labelTipo = new JLabel("Tipo");
      panelLeft.add(labelTipo);
      fieldTipo = new JTextField("Input", 14);
      panelLeft.add(fieldTipo);

      //Asiento
      labelAsiento = new JLabel("Asiento");
      panelLeft.add(labelAsiento);
      fieldAsiento = new JTextField("Input", 14);
      panelLeft.add(fieldAsiento);

      //AGREGAR
      botonAgregar = new JButton("Agregar");
      botonAgregar.addActionListener(new ListenerAgregar());
      panelLeft.add(botonAgregar);


      //OUTPUT

      panelRight = new JPanel();
      panelRight.setLayout(new GridLayout(2,1));

      labelPasajeros = new JLabel("Pasajeros:");
      panelRight.add(labelPasajeros);

      labelPasajero1 = new JLabel();
      panelRight.add(labelPasajero1);

      labelTotalText = new JLabel("Total:");
      panelRight.add(labelTotalText);

      labelTotal = new JLabel();
      panelRight.add(labelTotal);





      add(panelLeft);
      add(panelMiddle);
      add(panelRight);
  }




public class ListenerAgregar implements ActionListener{

  public void actionPerformed(ActionEvent event){
      //Pasajero pas = new Pasajero(fieldNombre.getText() , fieldCorreo.getText(), fieldAsiento.getText());
      //Pasajero pas = verTipoPasajero();



      Pasajero pas = new Pasajero(fieldNombre.getText() , fieldCorreo.getText(), fieldAsiento.getText(), fieldTipo.getText());
      int numeroAsiento = Integer.parseInt(fieldAsiento.getText());
      //String tipo = pas.getTipo();
      //double finalPrice = calcularPrecioPasajero(tipo);
      //String precioFin = Double.toString(finalPrice);

      vuelo.addPasajero(numeroAsiento - 1, pas);

      mostrarListaVuelo();

  }

}

/*public Pasajero verTipoPasajero(){

  if(fieldTipo.getText() == "Silver"){
     Pasajero pasS = new Silver(fieldNombre.getText() , fieldCorreo.getText(), fieldAsiento.getText());
     return pasS;
  }else{
    Pasajero pas = new Pasajero(fieldNombre.getText() , fieldCorreo.getText(), fieldAsiento.getText());
    return pas;
}}*/

public double calcularPrecioPasajero(String type){


  if(type.equals("Silver")){

     Silver pasS = new Silver(fieldNombre.getText() , fieldCorreo.getText(), fieldAsiento.getText(), fieldTipo.getText());
     double precioFS = pasS.calcularPrecio();
     return precioFS;
     //System.out.println("Silver");
     //System.out.println(precioFS);

  }else if(type.equals("Gold")){

    Gold pasG = new Gold(fieldNombre.getText() , fieldCorreo.getText(), fieldAsiento.getText(), fieldTipo.getText());
    double precioFG = pasG.calcularPrecio();
    return precioFG;
    //System.out.println("Gold");
    //System.out.println(precioFG);

  }else{

    Pasajero pas = new Pasajero(fieldNombre.getText() , fieldCorreo.getText(), fieldAsiento.getText(), fieldTipo.getText());
    double precioF = pas.calcularPrecio();
    return precioF;
  //  System.out.println("Normal");
  //  System.out.println(precioF);

}}


public void mostrarListaVuelo(){
  double total = 0;
  String lista = "<html>";
  for(int i=0;i<vuelo.getPasajeros().length;i++){
    if(vuelo.getPasajeros()[i] != null){
      String precioPasajero = Double.toString(calcularPrecioPasajero(vuelo.getPasajeros()[i].getTipo()));
      total = total + calcularPrecioPasajero(vuelo.getPasajeros()[i].getTipo());
      lista = lista+(i+1)+ ".- " + vuelo.getPasajeros()[i].getNombre()+ " " + precioPasajero + "<br/>";
    }else{
      lista = lista+(i+1)+".- Vacio"+"<br/>";
    }
  }
  lista = lista + "</html>";
  labelTotal.setText(Double.toString(total));
  labelPasajero1.setText(lista);
}




}
