import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JComponent {
	public GUI gui;
	public DataModel model;

	public StartPanel(GUI gui, DataModel m) {
		this.gui = gui;
		this.model = m;
		// Add initial screen with stone selection, layout options, start game
		// button

		// _______________SET UP PANELS___________________
	//	FlowLayout alignButtons = new FlowLayout();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel layoutPanel = new JPanel();
		layoutPanel.setPreferredSize(new Dimension(650, 150));
		// layoutPanel.setLayout(new GridLayout(5, 5));

		JPanel stonePanel = new JPanel();
		stonePanel.setPreferredSize(new Dimension(650, 150));

		JPanel startPanel = new JPanel();
		startPanel.setPreferredSize(new Dimension(650, 150));

		JPanel containerPanel = new JPanel();
		containerPanel.setLayout((LayoutManager) new BoxLayout(containerPanel, BoxLayout.Y_AXIS));

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

		// ________________NUMBER OF STONES___________________
		JLabel numberStoneLabel = new JLabel("Please select number of stones: ");

		// stonePanel.setLayout(new GridLayout(4, 2));
		stonePanel.add(numberStoneLabel);

		JButton threeStones = new JButton("3");
		stonePanel.add(threeStones);
		threeStones.setPreferredSize(new Dimension(100, 70));

		JButton fourStones = new JButton("4");
		stonePanel.add(fourStones);
		fourStones.setPreferredSize(new Dimension(100, 70));

		// _______________START BUTTON____________________
		JLabel startLabel = new JLabel("Press START button to begin game after you have made your selection.");
		// startPanel.setLayout(new GridLayout(4, 2));
		startPanel.add(startLabel);
		JButton startButton = new JButton("START");
		startPanel.add(startButton);
		startPanel.setPreferredSize(new Dimension(100, 70));

		containerPanel.add(layoutPanel, BorderLayout.NORTH);
		containerPanel.add(stonePanel, BorderLayout.CENTER);
		containerPanel.add(startPanel, BorderLayout.SOUTH);

		frame.getContentPane().add(containerPanel);
		frame.pack();
		frame.setVisible(true);

		// _____________________ADD THE ACTION LISTENERS_______________________

		lay1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				gui.setBoardLayout(new Layout1());
			}
		});

		lay2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				gui.setBoardLayout(new Layout2());
			}
		});

		lay3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				gui.setBoardLayout(new Layout3());
			}
		});
		threeStones.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			model.setNumOfStones(3);
		}
	});

	fourStones.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			model.setNumOfStones(4);
		}
	});
	
	startButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			// beginGame;
		}
	});

	}
}
