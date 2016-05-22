import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Creates window that allows user to click a button and choose an easy or hard level.
 * @author Ananya Chakravarthy and Crystal Sun
 *
 */
public class LevelChooser extends JPanel {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public static void main(String[] args) {
		LevelChooser level = new LevelChooser();
		level.levelDisplay();
	}

	/**
	 * Creates a 800 by 800 window for the buttons to choose the levels.
	 */
	public LevelChooser() {
		mainFrame = new JFrame("Sudoku");
		mainFrame.setSize(800, 800);
		mainFrame.setLayout(new GridLayout(3, 1));
		prepareGUI();
	}
	
	/**
	 * Places two level selection buttons onto the window.
	 */
	private void prepareGUI() {

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350, 100);
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	/**
	 * Displays the level selection window.
	 */
	private void levelDisplay() {
		headerLabel.setText("Please choose level: ");

		JButton easyLevel = new JButton("Easy");
		JButton mediumLevel = new JButton("Hard");

		easyLevel.setActionCommand("Easy");
		mediumLevel.setActionCommand("Hard");

		easyLevel.addActionListener(new ButtonClickListener());
		mediumLevel.addActionListener(new ButtonClickListener());
		controlPanel.add(easyLevel);
		controlPanel.add(mediumLevel);

		mainFrame.setVisible(true);
	}

	/**
	 * Creates board according to which level was selected.
	 * @author Ananya Chakravarthy and Crystal Sun
	 *
	 */
	public class ButtonClickListener implements ActionListener {

		/**
		 * Creates board according to which level was chosen.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("Easy")) {
				statusLabel.setText("Easy level selected.");
				mainFrame.setVisible(false);
				mainFrame.dispose();
				SudokuGame first = new SudokuGame();

			} else if (command.equals("Hard")) {
				statusLabel.setText("Hard level selected.");
				mainFrame.setVisible(false);
				mainFrame.dispose();
				SudokuGame first = new SudokuGame();

			}

		}
	}
}
