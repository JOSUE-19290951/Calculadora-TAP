/*
JOSUE DANIEL TORRES SANTOS 
*/
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Datos extends JFrame{
    
    JLabel nombre, universidad, docente, grupo, materia;
    
    public Datos()
    {
         initComponents();
    }
    
    private void initComponents()
    {
        setTitle("Datos ");
        setSize(600,200);
        setResizable(false);
        
        universidad = new JLabel("INSTITUTO TECNOLOGICO DE CIUDAD GUZMAN");
        nombre = new JLabel("ALUMNO: JOSUE DANIEL TORRES SANTOS");
        docente = new JLabel("DOCENTE: ARELI PEREZ APARICIO");
        materia = new JLabel("MATERIA: TOPICOS AVANZADOS DE PROGRAMACION");
        grupo= new JLabel("GRUPO: 4 A");
        
        universidad.setFont(new Font("Serif", Font.PLAIN, 14)); 
        nombre.setFont(new Font("Serif", Font.PLAIN, 14)); 
        docente.setFont(new Font("Serif", Font.PLAIN, 14)); 
        materia.setFont(new Font("Serif", Font.PLAIN, 14)); 
        grupo.setFont(new Font("Serif", Font.PLAIN, 14)); 
        
       
        
        JPanel panel= new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(5, 5, 10, 10));
        panel.add(universidad);
        panel.add(nombre);
        panel.add(docente);
        panel.add(materia);
        panel.add(grupo);
        

        
        setLocationRelativeTo(null);
        setContentPane(panel);
         setVisible(true);
    }
    
   
    
}
