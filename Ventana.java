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



//INPUT FIELDS & DROPDOWN
  private JTextField fieldNombre;
  private JTextField fieldCorreo;
  private JTextField fieldAsiento;

//DROPDOWN
  private JComboBox dropTipo;
  String[] tipos = {"Normal", "Silver", "Gold"};
  private JComboBox dropAsiento;
  String[] asientos = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18"};

//ACTION BUTTON
  private JButton botonAgregar;


//CONSTRUCTOR
  public Ventana(){
    vuelo = new Vuelo();
    setSize(1280, 720);
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
      dropTipo = new JComboBox(tipos);
      panelLeft.add(dropTipo);

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
      panelRight.setLayout(new GridLayout(1,1));

      labelPasajeros = new JLabel("Pasajeros");
      panelRight.add(labelPasajeros);

      labelPasajero1 = new JLabel("1.Vacio");
      panelRight.add(labelPasajero1);



      add(panelLeft);
      add(panelMiddle);
      add(panelRight);
  }




public class ListenerAgregar implements ActionListener{

  public void actionPerformed(ActionEvent event){
      Pasajero pas = new Pasajero(fieldNombre.getText() , fieldCorreo.getText(), fieldAsiento.getText());
      int numeroAsiento = Integer.parseInt(fieldAsiento.getText());
      vuelo.addPasajero(numeroAsiento, pas);
      mostrarListaVuelo();

  }

}


public void mostrarListaVuelo(){
  String resultado = "<html>";
  for(int i=0;i<vuelo.getPasajeros().length;i++){
    if(vuelo.getPasajeros()[i] != null){
      resultado = resultado+i+ ".- " + vuelo.getPasajeros()[i].getNombre()+"<br/>";
    }else{
      resultado = resultado+i+".- Vacio";
    }
  }
  resultado = resultado + "</html>";
  labelPasajero1.setText(resultado);
}


}
