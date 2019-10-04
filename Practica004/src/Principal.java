import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textIdIng;
	private JTextField textNomIng;
	private JTextField textStockIng;
	private JTextField textTipoIng;
	private JTextField textIdRec;
	private JTextField textClasRec;
	private JTextField textOriRec;
	private JTextField textIdPla;
	private JTextField textNomPla;
	private JTextField textPrePla;
	private JTextField textTiemPla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblId = new JLabel("id:");
		lblId.setBounds(10, 27, 46, 14);
		contentPane.add(lblId);

		textIdIng = new JTextField();
		textIdIng.setBounds(41, 24, 57, 20);
		contentPane.add(textIdIng);
		textIdIng.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(108, 27, 46, 14);
		contentPane.add(lblNombre);

		textNomIng = new JTextField();
		textNomIng.setBounds(164, 24, 86, 20);
		contentPane.add(textNomIng);
		textNomIng.setColumns(10);

		JLabel lblStock = new JLabel("Stock:");
		lblStock.setBounds(260, 27, 46, 14);
		contentPane.add(lblStock);

		textStockIng = new JTextField();
		textStockIng.setBounds(298, 24, 86, 20);
		contentPane.add(textStockIng);
		textStockIng.setColumns(10);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(394, 27, 46, 14);
		contentPane.add(lblTipo);

		textTipoIng = new JTextField();
		textTipoIng.setBounds(426, 24, 86, 20);
		contentPane.add(textTipoIng);
		textTipoIng.setColumns(10);

		JLabel lblIngredientes = new JLabel("Ingredientes");
		lblIngredientes.setBounds(10, 2, 88, 14);
		contentPane.add(lblIngredientes);

		JLabel lblReceta = new JLabel("Receta");
		lblReceta.setBounds(10, 62, 46, 14);
		contentPane.add(lblReceta);

		JLabel label = new JLabel("id:");
		label.setBounds(10, 87, 46, 14);
		contentPane.add(label);

		textIdRec = new JTextField();
		textIdRec.setColumns(10);
		textIdRec.setBounds(41, 87, 57, 20);
		contentPane.add(textIdRec);

		JLabel lblClasificacion = new JLabel("Clasificacion:");
		lblClasificacion.setBounds(108, 87, 71, 14);
		contentPane.add(lblClasificacion);

		textClasRec = new JTextField();
		textClasRec.setColumns(10);
		textClasRec.setBounds(177, 84, 86, 20);
		contentPane.add(textClasRec);

		JLabel lblOrigenReceta = new JLabel("Origen Receta:");
		lblOrigenReceta.setBounds(273, 87, 86, 14);
		contentPane.add(lblOrigenReceta);

		textOriRec = new JTextField();
		textOriRec.setColumns(10);
		textOriRec.setBounds(354, 84, 86, 20);
		contentPane.add(textOriRec);

		JLabel lblPatillo = new JLabel("Patillo");
		lblPatillo.setBounds(10, 118, 46, 14);
		contentPane.add(lblPatillo);

		JLabel lblId_1 = new JLabel("id:");
		lblId_1.setBounds(10, 143, 46, 14);
		contentPane.add(lblId_1);

		textIdPla = new JTextField();
		textIdPla.setColumns(10);
		textIdPla.setBounds(41, 140, 57, 20);
		contentPane.add(textIdPla);

		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(108, 143, 46, 14);
		contentPane.add(lblNombre_1);

		textNomPla = new JTextField();
		textNomPla.setColumns(10);
		textNomPla.setBounds(164, 140, 86, 20);
		contentPane.add(textNomPla);

		JLabel lblPresentacion = new JLabel("Presentacion:");
		lblPresentacion.setBounds(260, 143, 71, 14);
		contentPane.add(lblPresentacion);

		textPrePla = new JTextField();
		textPrePla.setColumns(10);
		textPrePla.setBounds(341, 140, 86, 20);
		contentPane.add(textPrePla);

		JLabel lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setBounds(451, 143, 46, 14);
		contentPane.add(lblTiempo);

		textTiemPla = new JTextField();
		textTiemPla.setColumns(10);
		textTiemPla.setBounds(504, 140, 86, 20);
		contentPane.add(textTiemPla);

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAgregar.setBounds(242, 186, 89, 23);
		contentPane.add(btnAgregar);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(41, 236, 517, 105);
		contentPane.add(textArea);
	}
}
