package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {
	
	public void criarTela() {
		
		JFrame telaRetangulo = new JFrame();
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaRetangulo.setSize(500, 300);
		telaRetangulo.setTitle("Calculos com retângulo");
		telaRetangulo.setLayout(null);
		telaRetangulo.setLocationRelativeTo(null);
		
		// *** Criar um Label e textField da Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		// *** Definir a posição e tamango do label (x, y, width, height)
		labelAltura.setBounds(10, 10, 80, 30);
		JTextField textAltura = new JTextField();
		textAltura.setBounds(50, 10, 100, 30);
		
		
		// *** Criar um Label e textField da Base
		JLabel labelBase = new JLabel();
		labelBase.setText("Base:");
		labelBase.setBounds(10, 45, 80, 30);
		JTextField textBase = new JTextField();
		textBase.setBounds(50, 45, 100, 30);
		
		// *** Criar um botão para calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		Color roxo = new Color(131,111,255);
		buttonCalcular.setBackground(roxo);
		buttonCalcular.setBounds(10, 95, 180, 30);
		
		
		// ***Colocar dentro do painel de conteúdo (contentPane)
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		
		telaRetangulo.setVisible(true);
		
		// *** Cliques da tela
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Retangulo r = new Retangulo();
				r.setAltura(Double.parseDouble(textAltura.getText()));
				r.setBase(Double.parseDouble(textBase.getText()));
				
				labelAltura.setText(String.valueOf(r.calcularArea()));
				labelBase.setText(String.valueOf(r.calcularPerimetro()));
				
			}
		});
	}
	
}
