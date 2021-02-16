/*
JOSUE DANIEL TORRES SANTOS
*/

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorTAP extends JFrame{
    JPanel panel_principal;
    JPanel panel_botones;
    JTextField caja;
    
    public CalculatorTAP(){
        setTitle("Calculadora"); //título de la ventana
        setSize(300,400);
        setResizable(false); // aquí impedimos que pueda ser modificado el tamaño de la ventana
        setLocationRelativeTo(null);
        
        init();
        setVisible(true); //true indicando que se muestre nuestra ventana de manera visible 
    }
   
 private void init() {
      panel_principal = new JPanel();
      panel_principal.setLayout(new BorderLayout());
      caja = new JTextField();
      panel_principal.add("North",caja); //mandamos hacia la parte superior el campo de los numeros.
      panel_botones = new JPanel();
      panel_botones.setLayout(new GridLayout(5,4,5,5)); //damos tamaño a los botones, knidicamdo 
      agregarBotones();
      panel_principal.add("Center",panel_botones);
      getContentPane().add(panel_principal);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 
 JButton boton[];
 double op1=0,op2=0;
 String operacion="";
 boolean niu =true;
 
    
 private void agregarBotones(){
    boton = new JButton[20];
    boton[0]=new JButton("CE");
    boton[1]=new JButton("Datos");
    boton[2]=new JButton("");
    boton[3]=new JButton("");
    boton[4]=new JButton("7");
    boton[5]=new JButton("8");
    boton[6]=new JButton("9");
    boton[7]=new JButton("/");
    boton[8]=new JButton("4");
    boton[9]=new JButton("5");
    boton[10]=new JButton("6");
    boton[11]=new JButton("*");
    boton[12]=new JButton("1");
    boton[13]=new JButton("2");
    boton[14]=new JButton("3");
    boton[15]=new JButton("-");
    boton[16]=new JButton("0");
    boton[17]=new JButton(".");
    boton[18]=new JButton("=");
    boton[19]=new JButton("+");
    
     //hacemos un ciclo de los botones para que sean iguales.
    for(int i=0;i<20;i++){
         panel_botones.add(boton[i]);
    }
     // utilicé el método lambda para la reducción de código y solo puede ser utilizado en una versión superior a java 8
     //boton para abrir una segunda ventana con los datos.
     boton[1].addActionListener((ActionEvent evt) -> {
         Datos dates = new Datos();
    });
    
    
    boton[19].addActionListener((ActionEvent evt) -> {
        try{
            if(op1!=0)
                op1=op1+Double.parseDouble(caja.getText());
            else
                op1=Double.parseDouble(caja.getText());
            operacion="suma";
            caja.setText("");
        }catch(Exception err){}
    });
    boton[15].addActionListener((ActionEvent evt) -> {
        try{
            if(op1!=0)
                op1=op1-Double.parseDouble(caja.getText());
            else
                op1=Double.parseDouble(caja.getText());
            operacion="resta";
            caja.setText("");
        }catch(Exception err){}
    });
      boton[11].addActionListener((ActionEvent evt) -> {
          try{
              if(op1!=0)
                  op1=op1*Double.parseDouble(caja.getText());
              else
                  op1=Double.parseDouble(caja.getText());
              operacion="multiplicacion";
              caja.setText("");
          }catch(Exception err){}
    });
      boton[7].addActionListener((ActionEvent evt) -> {
          try{
              if(op1!=0)
                  op1=op1/Double.parseDouble(caja.getText());
              else
                  op1=Double.parseDouble(caja.getText());
              operacion="division";
              caja.setText("");
          }catch(Exception err){}
    });
      //NUMEROS Y PUNTO DECIMAL
      boton[4].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"7");
    });
      boton[5].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"8");
    });
      boton[6].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"9");
    });
      boton[8].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"4");
    });
      boton[9].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"5");
    });
      boton[10].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"6");
    });
      boton[12].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"1");
    });
      boton[13].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"2");
    });
      boton[14].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"3");
    });
      boton[16].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+"0");
    });
      boton[17].addActionListener((ActionEvent evt) -> {
          if(niu){caja.setText("");niu=false;}
          caja.setText(caja.getText()+".");
    });
        //equals
      boton[18].addActionListener((ActionEvent evt) -> {
          try{
              op2=Double.parseDouble(caja.getText());
          }catch(Exception err){}
          if(operacion.equals("suma")){
              double res=op1+op2;
              caja.setText(String.valueOf(res));
              op1=op2=0;
              operacion="";
          }else if(operacion.equals("resta")){
              double res=op1-op2;
              caja.setText(String.valueOf(res));
              op1=op2=0;
              operacion="";
          }else if(operacion.equals("multiplicacion")){
              double res=op1*op2;
              caja.setText(String.valueOf(res));
              op1=op2=0;
              operacion="";
          }else if(operacion.equals("division")){
              double res=op1/op2;
              caja.setText(String.valueOf(res));
              op1=op2=0;
              operacion="";
          }
          niu=true;
    });
        //CE borrado
      boton[0].addActionListener((ActionEvent evt) -> {
          caja.setText("");
          op1=op2=0;
          operacion="";
    });
}
   
    public static void main(String args[]) {
     //instanciacion del objeto
        CalculatorTAP calculatorTAP = new CalculatorTAP();
    }
}
