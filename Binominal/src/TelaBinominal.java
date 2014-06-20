
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class TelaBinominal extends JFrame {

	private JPanel contentPane;
	private JLabel labelBinomio;
	private JLabel labelN;
	private JTextField textFieldN;
	private JLabel labelK;
	private JTextField textFieldK;
	private JLabel lblResultado;
	private JTextField textField;

	public TelaBinominal() {
		setTitle("Binomio");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 224, 205);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		iniciarComponentes();

	}

	private void iniciarComponentes() {

		labelBinomio = new JLabel("Binomio de Newton");
		labelBinomio.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelBinomio.setBounds(10, 11, 180, 14);
		contentPane.add(labelBinomio);

		labelN = new JLabel("N");
		labelN.setBounds(10, 36, 46, 14);
		contentPane.add(labelN);

		textFieldN = new JTextField();
		textFieldN.setBounds(46, 36, 34, 14);
		contentPane.add(textFieldN);
		textFieldN.setColumns(10);

		labelK = new JLabel("K");
		labelK.setBounds(10, 61, 46, 14);
		contentPane.add(labelK);

		textFieldK = new JTextField();
		textFieldK.setColumns(10);
		textFieldK.setBounds(46, 61, 34, 14);
		contentPane.add(textFieldK);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(10, 127, 89, 23);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(101, 127, 89, 23);
		contentPane.add(btnLimpar);

		lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 86, 70, 14);
		contentPane.add(lblResultado);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(77, 86, 57, 14);
		contentPane.add(textField);
		textField.setColumns(10);
	}



	public static void main(String[] args) {

		new TelaBinominal();
	}

}
