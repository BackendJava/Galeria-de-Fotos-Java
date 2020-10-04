package SegundoParcial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mostrar {

    private JFrame ventana = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel etiqueta = new JLabel();
    private JButton iniciar = new JButton("INICIAR");
    private JButton anterior = new JButton("ANTERIOR");
    private JButton siguiente = new JButton("SIGUIENTE");
    private lista x = new lista();
    private int cont =1;
    
    public Mostrar() {
        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        panel.setSize(ventana.getSize());
        panel.setLocation(0, 0);
        panel.setLayout(null);
        panel.setVisible(true);
        
        etiqueta.setSize(300, 300);
        etiqueta.setLocation(100, 20);
        etiqueta.setVisible(true);
        
        iniciar.setSize(100, 30);
        iniciar.setLocation(200, 400);
        iniciar.setVisible(true);
        
        anterior.setSize(100, 30);
        anterior.setLocation(50, 400);
        anterior.setVisible(true);
        
        siguiente.setSize(100, 30);
        siguiente.setLocation(350, 400);
        siguiente.setVisible(true);
        
        ActionListener in = new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent e) {
                x= new lista();
                x.Insertar(1);
                x.Insertar(2);
                x.Insertar(3);
                x.Insertar(4);
                x.Insertar(5);
                x.Insertar(6);
                x.Insertar(7);
                x.Insertar(8);
                x.Insertar(9);
                x.Insertar(10);
                etiqueta.setIcon(x.buscar(1));
                ventana.repaint();
            }            
        };
        ActionListener an = new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent e) {
                cont--;
                if(cont==0)
                {
                    cont=10;
                }
                etiqueta.setIcon(x.buscar(cont));
                ventana.repaint();
            }            
        };
        ActionListener sig = new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent e) {
               
                cont++;
                if(cont==10)
                {
                    cont=1;
                }
                etiqueta.setIcon(x.buscar(cont));
                ventana.repaint();
            }            
        };
        iniciar.addActionListener(in);
        siguiente.addActionListener(sig);
        anterior.addActionListener(an);
        panel.add(anterior);
        panel.add(siguiente);
        panel.add(etiqueta);
        panel.add(iniciar);
        ventana.add(panel);
        ventana.setVisible(true);
    }
    
}
