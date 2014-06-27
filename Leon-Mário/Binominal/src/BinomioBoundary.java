import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class BinomioBoundary extends JFrame {

	private JLabel labelBinomio;
	private JLabel labelN;
	private JTextField textFieldN;
	private JLabel labelK;
	private JTextField textFieldK;
	private JLabel lblResultado;
	private JTextField textField;
	private JButton btnCalcular;
	private JButton btnLimpar;

	public BinomioBoundary() {
		setTitle("Binomio");

		iniciarComponentes();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 224, 205);
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}

	public JTextField getTextFieldN() {
		return textFieldN;
	}

	public JTextField getTextFieldK() {
		return textFieldK;
	}

	public JTextField getTextField() {
		return textField;
	}

	private void iniciarComponentes() {

		labelBinomio = new JLabel("Binomio de Newton");
		labelBinomio.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelBinomio.setBounds(10, 11, 180, 14);
		getContentPane().add(labelBinomio);

		labelN = new JLabel("N");
		labelN.setBounds(10, 36, 46, 14);
		getContentPane().add(labelN);

		textFieldN = new JTextField();
		textFieldN.setBounds(46, 36, 34, 14);
		getContentPane().add(textFieldN);
		textFieldN.setColumns(10);

		labelK = new JLabel("K");
		labelK.setBounds(10, 61, 46, 14);
		getContentPane().add(labelK);

		textFieldK = new JTextField();
		textFieldK.setColumns(10);
		textFieldK.setBounds(46, 61, 34, 14);
		getContentPane().add(textFieldK);

		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(10, 127, 89, 23);
		btnCalcular.addActionListener(new BinomioController());
		getContentPane().add(btnCalcular);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(101, 127, 89, 23);
		btnLimpar.addActionListener(new BinomioController());
		getContentPane().add(btnLimpar);

		lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 86, 70, 14);
		getContentPane().add(lblResultado);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(77, 86, 57, 14);
		getContentPane().add(textField);
		textField.setColumns(10);
	}

	class BinomioController implements ActionListener {

		private BinomioEntidade binomioEntidade;

		@Override
		public void actionPerformed(ActionEvent e) {

			int n = 0, k = 0;
			boolean flag = true;

			if (e.getSource() == btnCalcular) {

				try {
					n = Integer.parseInt(getTextFieldN().getText());
					k = Integer.parseInt(getTextFieldK().getText());

				} catch (NumberFormatException numberFormatException) {

					JOptionPane.showMessageDialog(null, "Somente números",
							"Erro", JOptionPane.ERROR_MESSAGE);
					flag = false;
				}

				if (flag) {
					binomioEntidade = new BinomioEntidade(n, k);

					getTextField().setText(
							"" + binomioEntidade.getCoeficiente());
				}

			} else if (e.getSource() == btnLimpar) {

				textFieldN.setText("");
				textFieldK.setText("");
				textField.setText("");

			}

		}

	}

	public static void main(String[] args) {

		new BinomioBoundary();
	}

}
