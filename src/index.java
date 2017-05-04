import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;

public class index extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTipo;
	private JTextField txtNifcif;
	private JTextField txtAltaDesde;
	private JTextField txtAltaHasta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 910, 550);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 18, 50));
		panel_1.setBounds(0, 0, 83, 550);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(18, 72, 45, 55);
		label_1.setIcon(new ImageIcon("/Users/sergio/Downloads/User Groups-40.png"));
		panel_1.add(label_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/sergio/Downloads/Plus Math-40.png"));
		lblNewLabel_3.setBounds(18, 151, 45, 45);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("/Users/sergio/Downloads/Coins-40.png"));
		lblNewLabel_4.setBounds(18, 233, 61, 40);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("/Users/sergio/Downloads/Activity Feed Filled-40.png"));
		lblNewLabel_5.setBounds(18, 308, 61, 40);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("/Users/sergio/Downloads/Park Bench-40.png"));
		lblNewLabel_6.setBounds(18, 386, 61, 40);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("/Users/sergio/Downloads/Services-40.png"));
		lblNewLabel_7.setBounds(18, 461, 61, 40);
		panel_1.add(lblNewLabel_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setForeground(new Color(192, 192, 192));
		panel_2.setBackground(new Color(32, 47, 90));
		panel_2.setBounds(81, 254, 829, 296);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("/Users/sergio/Downloads/Plus Math-40.png"));
		label_2.setBounds(757, 75, 45, 45);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("/Users/sergio/Downloads/Edit Property-40.png"));
		label_3.setBounds(762, 143, 45, 45);
		panel_2.add(label_3);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("/Users/sergio/Downloads/Delete-40.png"));
		lblNewLabel_8.setBounds(762, 217, 40, 36);
		panel_2.add(lblNewLabel_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 240, 240));
		panel_3.setBounds(81, 59, 829, 196);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTorri = new JLabel("Munity v0.2");
		lblTorri.setBounds(627, -12, 194, 73);
		lblTorri.setFont(new Font("Segoe UI", Font.PLAIN, 37));
		panel_3.add(lblTorri);
		
		JLabel lblSloganTorrismart = new JLabel("Experts on management");
		lblSloganTorrismart.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSloganTorrismart.setBounds(627, 28, 145, 50);
		panel_3.add(lblSloganTorrismart);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-- Seleccione una --", "Asociación", "Subvención", "Actividades", "Espacio Municipal"}));
		comboBox.setBounds(28, 34, 194, 27);
		panel_3.add(comboBox);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtNombre.setText("Nombre");
		txtNombre.setBackground(new Color(240, 240, 240));
		txtNombre.setBorder(null);
		txtNombre.setBounds(28, 62, 130, 16);
		panel_3.add(txtNombre);
		txtNombre.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(32, 47, 90));
		separator_1.setBounds(28, 76, 194, 12);
		panel_3.add(separator_1);
		
		txtTipo = new JTextField();
		txtTipo.setText("Categoría");
		txtTipo.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtTipo.setColumns(10);
		txtTipo.setBorder(null);
		txtTipo.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtTipo.setBounds(28, 17, 130, 16);
		panel_3.add(txtTipo);
		
		txtNifcif = new JTextField();
		txtNifcif.setText("NIF/CIF");
		txtNifcif.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtNifcif.setColumns(10);
		txtNifcif.setBorder(null);
		txtNifcif.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtNifcif.setBounds(28, 90, 130, 16);
		panel_3.add(txtNifcif);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(32, 47, 90));
		separator_2.setBounds(28, 105, 194, 12);
		panel_3.add(separator_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(189,195,199));
		panel_5.setBounds(28, 129, 194, 50);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("    CONSULTAR");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/sergio/Downloads/Search Property-40.png"));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1.setBounds(21, 6, 131, 40);
		panel_5.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBorder(null);
		dateChooser.setBounds(352, 34, 27, 26);
		panel_3.add(dateChooser);
		
		txtAltaDesde = new JTextField();
		txtAltaDesde.setText("Alta desde");
		txtAltaDesde.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtAltaDesde.setColumns(10);
		txtAltaDesde.setBorder(null);
		txtAltaDesde.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtAltaDesde.setBounds(245, 34, 100, 16);
		panel_3.add(txtAltaDesde);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(32, 47, 90));
		separator_3.setBounds(245, 49, 100, 12);
		panel_3.add(separator_3);
		
		txtAltaHasta = new JTextField();
		txtAltaHasta.setText("Alta hasta");
		txtAltaHasta.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtAltaHasta.setColumns(10);
		txtAltaHasta.setBorder(null);
		txtAltaHasta.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtAltaHasta.setBounds(245, 63, 100, 16);
		panel_3.add(txtAltaHasta);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(32, 47, 90));
		separator_4.setBounds(245, 76, 100, 12);
		panel_3.add(separator_4);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(351, 62, 27, 26);
		panel_3.add(dateChooser_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(189,195,199));
		panel_6.setBounds(429, 89, 181, 40);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblInscribirAsoc = new JLabel("ALTA ASOCIACIÓN");
		lblInscribirAsoc.setIcon(new ImageIcon("/Users/sergio/Downloads/Form-30 (2).png"));
		lblInscribirAsoc.setForeground(Color.WHITE);
		lblInscribirAsoc.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblInscribirAsoc.setBounds(12, 6, 169, 28);
		panel_6.add(lblInscribirAsoc);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(189,195,199));
		panel_7.setBounds(640, 89, 181, 40);
		panel_3.add(panel_7);
		
		JLabel lblPreimpresos = new JLabel("PREIMPRESOS");
		lblPreimpresos.setIcon(new ImageIcon("/Users/sergio/Downloads/Paper-30.png"));
		lblPreimpresos.setForeground(Color.WHITE);
		lblPreimpresos.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPreimpresos.setBounds(12, 6, 169, 28);
		panel_7.add(lblPreimpresos);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(189,195,199));
		panel_8.setBounds(429, 141, 181, 40);
		panel_3.add(panel_8);
		
		JLabel lblBajaAsociacin = new JLabel("BAJA ASOCIACIÓN");
		lblBajaAsociacin.setIcon(new ImageIcon("/Users/sergio/Downloads/Cancel Filled-30 (1).png"));
		lblBajaAsociacin.setForeground(Color.WHITE);
		lblBajaAsociacin.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblBajaAsociacin.setBounds(16, 6, 145, 28);
		panel_8.add(lblBajaAsociacin);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(189,195,199));
		panel_9.setBounds(640, 139, 181, 40);
		panel_3.add(panel_9);
		
		JLabel lblNoticias = new JLabel("NOTICIAS");
		lblNoticias.setIcon(new ImageIcon("/Users/sergio/Downloads/News-30.png"));
		lblNoticias.setForeground(Color.WHITE);
		lblNoticias.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNoticias.setBounds(12, 6, 169, 34);
		panel_9.add(lblNoticias);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(81, 0, 829, 59);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 6, 40, 40);
		lblNewLabel.setIcon(new ImageIcon("/Users/sergio/Downloads/Search-40 (1).png"));
		panel_4.add(lblNewLabel);
		
		JLabel lblBsqueda = new JLabel("Búsqueda");
		lblBsqueda.setBounds(58, 6, 89, 36);
		lblBsqueda.setForeground(new Color(128, 128, 128));
		lblBsqueda.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel_4.add(lblBsqueda);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(55, 41, 209, 12);
		panel_4.add(separator);
		
		JLabel label = new JLabel("");
		label.setBounds(633, 6, 40, 40);
		label.setIcon(new ImageIcon("/Users/sergio/Downloads/User-40 (2).png"));
		panel_4.add(label);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(675, 6, 76, 40);
		lblUsuario.setForeground(new Color(128, 128, 128));
		lblUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel_4.add(lblUsuario);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(781, 6, 40, 40);
		lblNewLabel_2.setIcon(new ImageIcon("/Users/sergio/Downloads/Exit-35.png"));
		panel_4.add(lblNewLabel_2);
		
		//headers for the table
        String[] columns = new String[] {
            "Identificador", "Nombre", "CIF", "E-Mail", "Dirección", "Teléfono"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {1, "Tiro al plato", "B37948858", "tiroplato-benavente@gmail.com", "C/Jacinto Benavente 33", "916345645" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {3, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {4, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {5, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {6, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
        };
         
        //create table model with data
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            
        };
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		scrollPane.setBounds(16, 21, 711, 241);
		panel_2.add(scrollPane);
		
        JTable table = new JTable(model);
        scrollPane.setViewportView(table);
        table.setForeground(new Color(255, 255, 255));
        table.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        table.setBackground(new Color(106, 116, 145));
        table.setShowGrid(false);
		
        
         
       
		
	}
}
