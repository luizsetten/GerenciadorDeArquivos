package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;

public class EditarView extends JFrame {

	private JPanel contentPane;
	private JTextField nomeDoArquivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarView frame = new EditarView();
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
	public EditarView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 400, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(335, 350, 89, 23);
		contentPane.add(btnSalvar);
		
		nomeDoArquivo = new JTextField();
		nomeDoArquivo.setBounds(74, 11, 235, 20);
		contentPane.add(nomeDoArquivo);
		nomeDoArquivo.setColumns(10);
		
		JEditorPane editordoarquivo = new JEditorPane();
		editordoarquivo.setBounds(10, 37, 299, 413);
		contentPane.add(editordoarquivo);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(308, 37, 17, 413);
		contentPane.add(scrollBar);
		
		JLabel lblArquivo = new JLabel("Arquivo:");
		lblArquivo.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblArquivo.setBounds(10, 14, 67, 14);
		contentPane.add(lblArquivo);
	}
}
