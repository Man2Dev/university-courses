import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel commandPanel;
	Dimension d = getToolkit().getScreenSize();
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		String[] commands = { "-", "+", "*", "/", "Del", "Cal" };
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(d.width / 2 - 450 / 2, d.height / 2 - 300 / 2, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(20, 20));

		JPanel numberPanel = new JPanel();
		contentPane.add(numberPanel, BorderLayout.CENTER);
		numberPanel.setLayout(new GridLayout(3, 3, 5, 5));
		for (int i = 1; i < 10; i++) {
			JButton tmpButton = new JButton();
			tmpButton.setText(i + "");

			tmpButton.setFont(new Font("Ubuntu", Font.BOLD, 32));
			tmpButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {

					JButton b = (JButton) event.getSource();
					textField.setText(textField.getText() + b.getText());
				}
			});
			numberPanel.add(tmpButton);
		}
		textField = new JTextField();
		textField.setFont(new Font("Ubuntu", Font.BOLD, 32));
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);

		commandPanel = new JPanel();
		contentPane.add(commandPanel, BorderLayout.WEST);
		commandPanel.setLayout(new GridLayout(6, 1, 5, 5));

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		for (int i = 0; i < 6; i++) {
			JButton tmpButton = new JButton();
			tmpButton.setText(commands[i]);
			tmpButton.setFont(new Font("Ubuntu", Font.PLAIN, 30));
			tmpButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {

					JButton b = (JButton) event.getSource();
					if (b.getText().equals("Del"))
						textField.setText("");
					else {
						long l = MainWindow.calculate(textField.getText());
						textField.setText(l + " " + b.getText() + " ");
					}
				}
			});
			commandPanel.add(tmpButton);
		}
	}

	protected static long calculate(String text) {
		try {
			return Long.parseLong(text);

		} catch (Exception e) {
			String[] expression = text.split(" ");
			long firstNum = Long.parseLong(expression[0]);
			long secondNum = Long.parseLong(expression[2]);
			char command = expression[1].charAt(0);

			switch (command) {
			case '+':

				return firstNum + secondNum;

			case '-':

				return firstNum - secondNum;

			case '/':

				return firstNum / secondNum;

			case '*':

				return firstNum * secondNum;
			}

			return 0;
		}

	}
}
