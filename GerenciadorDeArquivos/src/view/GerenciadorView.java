package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;

public class GerenciadorView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciadorView frame = new GerenciadorView();
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
	public GerenciadorView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//criar função adiciona arquivo, em branco mesmo, vai solicitar o nome do arquivo, somente e ele ocupará um bloco
				//pode solicitar para abrir o mesmo na edição
				
				
				
			}
		});
		btnInserir.setBounds(685, 50, 89, 23);
		contentPane.add(btnInserir);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//vai remover o arquivo selecionado da lista e liberar seus blocos
				//criar metodo remover arquivo
				
				
				
			}
		});
		btnRemover.setBounds(685, 100, 89, 23);
		contentPane.add(btnRemover);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//vai abrir o editar view e ao clicar salvar deeve atualizar a lista de blcos 
				//criar a função editar arquivos
				
				
			}
		});
		btnEditar.setBounds(685, 150, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnFormatar = new JButton("Formatar");
		btnFormatar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Inserir pop-up solicitando informaçoes da formatação
				//criar função formata disco e chamá-la aqui
				//VERIFICAR SE O TAMANHO DO DISCO É DIVISIVEL PELO TAMANHO DE BLOCO
				
			}
		});
		btnFormatar.setBounds(685, 200, 89, 23);
		contentPane.add(btnFormatar);
		
		table = new JTable();
		table.setBounds(360, 41, 296, 409);
		contentPane.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(656, 41, 17, 409);
		contentPane.add(scrollBar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Simplesmente encerra a aplicação fechando a janela
				
				
			}
		});
		btnFechar.setBounds(685, 400, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnCarregar = new JButton("Carregar");
		btnCarregar.setBounds(685, 350, 89, 23);
		contentPane.add(btnCarregar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(685, 300, 89, 23);
		contentPane.add(btnSalvar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(685, 265, 89, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(685, 11, 89, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(685, 448, 89, 2);
		contentPane.add(separator_2);
		
		table_1 = new JTable();
		table_1.setBounds(10, 41, 296, 409);
		contentPane.add(table_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(305, 41, 17, 409);
		contentPane.add(scrollBar_1);
		
		JLabel lblDisco = new JLabel("Disco");
		lblDisco.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDisco.setBounds(10, 16, 46, 14);
		contentPane.add(lblDisco);
		
		JLabel lblTabelaDeInodes = new JLabel("Tabela de I-nodes");
		lblTabelaDeInodes.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTabelaDeInodes.setBounds(360, 16, 137, 14);
		contentPane.add(lblTabelaDeInodes);
	}
}
