package calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame {
    
    JPanel panelinicio = new JPanel();
    JTextField txtvalor1 = new JTextField();
    JTextField txtvalor2 = new JTextField();
    JLabel lblResultado = new JLabel("Total");
    int valor1 = 0;
    
    public ventana() {
        this.setVisible(true);//HACER VISIBLE LA VENTANA

        //FINALIZAR EJECUCION AL DAR CLIC EN CERRAR
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //crear panel
    public void insertarpanel() {
        this.getContentPane().add(panelinicio);
        //panelinicio.setBackground(Color.BLACK);//hacer visible el panel con un color
        panelinicio.setLayout(null); //desactivar la organizacion automatica de las etiquetas 
    }
    
    public void insertaretiquetas() {
        JLabel lblvalor1 = new JLabel("Ingrese el primer valor");
        lblvalor1.setBounds(20, 10, 200, 15);
        panelinicio.add(lblvalor1);
        
        JLabel lblvalor2 = new JLabel("ingrese el segundo valor");
        lblvalor2.setBounds(20, 80, 200, 15);
        panelinicio.add(lblvalor2);
        
        lblResultado.setBounds(20, 180, 200, 25);
        panelinicio.add(lblResultado);
    }
    
    public void insertartexto() {
        txtvalor1.setBounds(190, 10, 150, 25);
        panelinicio.add(txtvalor1);
        txtvalor1.repaint();
        
        txtvalor2.setBounds(190, 80, 150, 25);
        panelinicio.add(txtvalor2);
        txtvalor2.repaint();
        
    }
    
    public void insertarbotones() {
        JButton btnsumar = new JButton("+");
        btnsumar.setBounds(120, 130, 80, 30);
        panelinicio.add(btnsumar);
        btnsumar.repaint();
        ActionListener sumando = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                
                if (txtvalor1.getText().equals("") || txtvalor2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "debe llenar todos los campos");
                } else {
                    int resultadosuma = Integer.parseInt(txtvalor1.getText()) + Integer.parseInt(txtvalor2.getText());
                    lblResultado.setText("Total: " + String.valueOf(resultadosuma));
                }
                
            }
        };
        
        btnsumar.addActionListener(sumando);
        
        JButton btnSum = new JButton("sumar");
        btnSum.setBounds(210, 130, 80, 30);
         panelinicio.add(btnSum);
        btnSum.repaint();
        ActionListener suma2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtvalor1.getText().equals(" ")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                }else{
                    valor1 = valor1 + Integer.parseInt(txtvalor1.getText());
                    txtvalor1.setText("");
                }
            }
        };
        btnSum.addActionListener(suma2);
        
        JButton btnigual = new JButton ("=");
        panelinicio.add(btnigual);
        btnigual.setBounds(300, 130, 60, 30);
        
        ActionListener resultado = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               txtvalor1.setText(String.valueOf(valor1));
            }
        };
        btnigual.addActionListener(resultado);
        
        
        JButton btn1 = new JButton("1");
        btn1.setBounds(120, 180, 50, 30);
        panelinicio.add(btn1);
        btn1.repaint();
        
        ActionListener agregar1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor1.getText()+ "1";
                txtvalor1.setText(union);
            }
        };
        btn1.addActionListener(agregar1);
        
        JButton btn2 = new JButton("2");
        btn2.setBounds(180, 180, 50, 30);
        panelinicio.add(btn2);
        btn2.repaint();
        
        ActionListener agregar2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor1.getText()+ "2";
                txtvalor1.setText(union);
            }
        };
        btn2.addActionListener(agregar2);
        
         
    }
}
