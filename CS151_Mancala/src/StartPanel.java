import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel {
	public StartPanel() {
		FlowLayout alignButtons = new FlowLayout();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel buttonPanel = new JPanel();
		JPanel containerPanel = new JPanel();

		JLabel topLabel = new JLabel("Please select board style: ");
		frame.add(topLabel, BorderLayout.NORTH);

		buttonPanel.setLayout(new GridLayout(8, 2));
		buttonPanel.add(topLabel);

		alignButtons.setAlignment(FlowLayout.LEADING);// TRAILING);
		buttonPanel.setLayout(alignButtons);

		buttonPanel.add(new JButton("Layout 1"));
		buttonPanel.add(new JButton("Layout 2"));
		buttonPanel.add(new JButton("Layout 3"));
		buttonPanel.setPreferredSize(new Dimension(500, 100));

		JLabel bottomLabel = new JLabel("\n\nPlease select number of stones: ");
		frame.add(bottomLabel, BorderLayout.CENTER);

		alignButtons.setAlignment(FlowLayout.LEFT);
		buttonPanel.setLayout(alignButtons);

		buttonPanel.add(bottomLabel);
		buttonPanel.add(new JButton("3"));
		buttonPanel.add(new JButton("4"));

		containerPanel.add(buttonPanel);

		frame.getContentPane().add(containerPanel);
		frame.pack();
		frame.setVisible(true);
	}
}
