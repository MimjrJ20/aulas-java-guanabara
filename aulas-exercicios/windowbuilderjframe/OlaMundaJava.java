package windowbuilderjframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//AULA #05 APRENDENDO WINDOW BUIILDER
public class OlaMundaJava extends JFrame { //extends = herança --> tudo que um jframe criar vai jogar para minha tela olá mundo

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundaJava frame = new OlaMundaJava();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OlaMundaJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblMensagem = new JLabel("Aqui vai aparecer a mensagem");
		lblMensagem.setForeground(Color.RED);
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JButton btnClique = new JButton("Clique em mim!");
		btnClique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//actionPerfomed é um evento e um método
				
				lblMensagem.setText("Olá, Mundo!");//código digitado --> setText é um método
			}
		});
		btnClique.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(89)
					.addComponent(lblMensagem)
					.addContainerGap(80, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(234, Short.MAX_VALUE)
					.addComponent(btnClique)
					.addGap(176))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addComponent(lblMensagem)
					.addGap(18)
					.addComponent(btnClique)
					.addContainerGap(119, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
