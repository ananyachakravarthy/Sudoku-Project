import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * 
 * @author Ananya Chakravarthy and Crystal Sun
 *
 */
public class SudokuGame extends JPanel {

	private int[][] solution;
	private int[][] game;
	private int selectedNumber;
	private JFrame board;
	private boolean isSelected;
	private SudokuBoard p;

	public SudokuGame() {
		solution = new int[9][9];
		game = new int[9][9];

		board = new JFrame("Sudoku");
		board.setSize(900, 500);
		board.setLocationRelativeTo(null);
		board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(1, 2);
		board.setLayout(grid);
		p = new SudokuBoard();
		board.add(p);

		GameButtons gameB = new GameButtons();
		ButtonController buttonController = new ButtonController(this);
		gameB.setController(buttonController);
		board.add(gameB);
		board.setVisible(true);
	}

	public static void main(String args[]) {
		SudokuGame game = new SudokuGame();
	}

	public SudokuBoard getBoard() {
		return p;
	}

	public void newGame() {
		board.setVisible(false);
		board.dispose();
		SudokuGame game = new SudokuGame();
		p = game.getBoard();
		board.add(game);
	}

	public void checkGame() {
		// TODO Auto-generated method stub

	}

	public void changeInt(int panel, int x, int y, int num) {
		BoardPanel bard = new BoardPanel(p.getBPNum(panel, x, y));
		if (bard.returnSelected() == true)
			bard.addUserLable(num);
	}

	public void setSelectedNumber(int parseInt) {
		selectedNumber = parseInt;

	}

	public void clearBoard() {
		board.setVisible(false);
		board.dispose();
		new SudokuGame();
	}
}
