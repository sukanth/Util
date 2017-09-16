package Practice;

//public class test {

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dubai extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dubai frame = new dubai();
					frame.setVisible(true);
					frame.setName("Marwan Alhumyed");
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public dubai() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 177, 214);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("first name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(33, 34, 36, 20);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(79, 34, 86, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("middel name:");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 62, 59, 20);
		panel.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(79, 59, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("age:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(33, 88, 36, 20);
		panel.add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setBounds(79, 84, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("last name:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(33, 111, 36, 20);
		panel.add(lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setBounds(79, 109, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("degree:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(23, 134, 46, 20);
		panel.add(lblNewLabel_4);

		textField_4 = new JTextField();
		textField_4.setBounds(79, 134, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(179, 10, 285, 214);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 224, 500, 47);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnSave = new JButton("submit");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
				textArea.append(textField.getText() + "\n");
				textArea.append(textField_1.getText() + "\n");
				textArea.append(textField_2.getText() + "\n");
				textArea.append(textField_3.getText() + "\n");
				textArea.append(textField_4.getText() + "\n");
			}
		});
		btnSave.setBounds(159, 5, 64, 36);
		btnSave.setPreferredSize(new Dimension(64, 36));
		panel_1.add(btnSave);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnClear.setBounds(233, 5, 64, 36);
		btnClear.setPreferredSize(new Dimension(64, 36));
		panel_1.add(btnClear);
	}
}
