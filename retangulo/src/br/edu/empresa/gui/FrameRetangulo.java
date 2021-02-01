package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.function.DoublePredicate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		// *** Resultado da Area
		JLabel labelArea = new JLabel();
		labelArea.setText("Area:");
		labelArea.setBounds(220, 10, 70, 30);
		
		// *** Resultado Perimetro
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Perímetro:");
		labelPerimetro.setBounds(220, 50, 180, 30);
		
		// *** Criar um botão para calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		Color verde = new Color(50,205,50);
		buttonCalcular.setBackground(verde);
		buttonCalcular.setBounds(10, 95, 180, 30);
		
		// *** Criar um botão para Limpar
		JButton buttonLimpar= new JButton();
		buttonLimpar.setText("Limpar");
		Color vermelho = new Color(178,34,34);
		buttonLimpar.setBackground(vermelho);
		buttonLimpar.setBounds(10, 130, 180, 30);
		
		
		
		// ***Colocar dentro do painel de conteúdo (contentPane)
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		telaRetangulo.getContentPane().add(buttonLimpar);
		telaRetangulo.getContentPane().add(labelArea);
		telaRetangulo.getContentPane().add(labelPerimetro);
		
		telaRetangulo.setVisible(true);
		
		// *** Ouvintes de ação
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Retangulo r1 = new Retangulo();
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText()));
				
				labelArea.setText("Área: " + String.valueOf(r1.calcularArea()));
				labelPerimetro.setText("Perímetro: " + String.valueOf(r1.calcularPerimetro()));
				
			}
		});
		
	}
	
}
