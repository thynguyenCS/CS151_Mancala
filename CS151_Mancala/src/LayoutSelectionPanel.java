import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LayoutSelectionPanel extends JComponent{

	public LayoutSelectionPanel() {
		// Add initial screen with stone selection, layout options, start game
		// button

		//_______________SET UP PANELS___________________
		FlowLayout alignButtons = new FlowLayout();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel layoutPanel = new JPanel();
		layoutPanel.setPreferredSize(new Dimension(650, 150));
		// layoutPanel.setLayout(new GridLayout(5, 5));

		JPanel containerPanel = new JPanel();
		containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));

		// ________________LAYOUT BUTTONS______________________
		JLabel layoutLabel = new JLabel("Please select board style: ");
		layoutPanel.add(layoutLabel);

		// layoutPanel.add(new JButton("Layout 1"));
		JButton lay1Button = new JButton("Layout 1");
		layoutPanel.add(lay1Button);
		lay1Button.setPreferredSize(new Dimension(100, 70));

		JButton lay2Button = new JButton("Layout 2");
		layoutPanel.add(lay2Button);
		lay2Button.setPreferredSize(new Dimension(100, 70));

		JButton lay3Button = new JButton("Layout 3");
		layoutPanel.add(lay3Button);
		lay3Button.setPreferredSize(new Dimension(100, 70));

		
		containerPanel.add(layoutPanel, BorderLayout.NORTH);
		

		frame.getContentPane().add(containerPanel);
		frame.pack();
		frame.setVisible(true);

		// _____________________ADD THE ACTION LISTENERS_______________________

		lay1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// layout = layout1();
			}
		});

		lay2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// layout = layout2();
			}
		});

		lay3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// layout = layout3();
			}
		});

	}
}

