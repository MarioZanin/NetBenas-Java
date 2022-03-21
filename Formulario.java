package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Formulario {

    private javax.swing.JFrame form;
    private javax.swing.JLabel lblNome; 
    private javax.swing.JTextField txtNome;   
    private javax.swing.JButton btnSaudar;   

    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("Meu primeiro JFrame");
        form.setBounds(300, 200, 500, 250);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLayout(null);
        lblNome = new JLabel("Nome: ");
        lblNome.setBounds(50, 40, 50, 30);
        form.getContentPane().add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(105, 40, 300, 30);
        form.getContentPane().add(txtNome);
        
        btnSaudar = new JButton("Enviar saudação");
        btnSaudar.setBounds(150, 100, 200, 30);
        btnSaudar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Olá, " + txtNome.getText() + "!");
            }
        });
        
        form.getContentPane().add(btnSaudar);
        
        form.setVisible(true);
    }
    
}














